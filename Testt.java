import java.util.Random;

public class Testt {

    private static volatile boolean running = true;
    private static volatile long primesFound = 0;

    public static void main(String[] args) {
        int durationSec = parseArg(args, 0, 60);
        int cpuThreads = parseArg(args, 1, Runtime.getRuntime().availableProcessors());
        int memoryThreads = parseArg(args, 2, 4);
        int memoryPerThreadMB = parseArg(args, 3, 1024); // 1GB per thread

        System.out.println("Starting stress test for " + durationSec + " seconds");
        System.out.println("CPU Threads: " + cpuThreads);
        System.out.println("Memory Threads: " + memoryThreads + " (" + memoryPerThreadMB + "MB each)");

        // Start CPU stress threads
        for (int i = 0; i < cpuThreads; i++) {
            new Thread(() -> {
                long localPrimes = 0;
                int number = 2;
                while (running) {
                    if (isPrime(number)) {
                        localPrimes++;
                    }
                    number++;
                }
                synchronized (Testt.class) {
                    primesFound += localPrimes;
                }
            }).start();
        }

        // Start memory stress threads
        for (int i = 0; i < memoryThreads; i++) {
            new Thread(() -> {
                try {
                    final int size = memoryPerThreadMB * 1024 * 1024;
                    byte[] data = new byte[size];
                    Random random = new Random();
                    while (running) {
                        random.nextBytes(data);
                        for (int j = 0; j < size; j += 1024) {
                            data[j] = (byte) (data[j] ^ 0x55);
                        }
                    }
                } catch (OutOfMemoryError e) {
                    System.err.println("Out of memory! Reduce memory per thread.");
                }
            }).start();
        }

        // Progress indicator
        new Thread(() -> {
            try {
                while (running) {
                    Thread.sleep(1000);
                    System.out.print(".");
                }
            } catch (InterruptedException ignored) {}
        }).start();

        // Run for the specified duration
        try {
            Thread.sleep(durationSec * 1000L);
        } catch (InterruptedException ignored) {}

        running = false;

        // Allow threads to exit
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {}

        System.out.println("\nStress test completed.");
        System.out.println("Total primes found: " + primesFound);
    }

    private static int parseArg(String[] args, int index, int defaultValue) {
        if (args.length > index) {
            try {
                return Integer.parseInt(args[index]);
            } catch (NumberFormatException e) {
                return defaultValue;
            }
        }
        return defaultValue;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}