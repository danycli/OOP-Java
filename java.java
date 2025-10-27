import java.util.Arrays;
import java.util.Scanner;
public class java {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String x = "Danial";
        int a = -5;
        int b = Math.abs(a);
        System.out.println(a+" "+b);



        // Lts suppose e have to draw random nuim bw 2-100
        int t = (int)(Math.random()*99)+2;
        System.out.println(t);
        System.out.println("hi");


        int[] o = {2,3,1,4,10}; 
        int[] p = {2,3,1,4,9}; 
        int[] i = new int[5];
        System.out.println(Arrays.compare(o,p));
        Arrays.fill(i, 89);
        System.out.println(Arrays.toString(i));
        Arrays.sort(p);
        System.out.println(Arrays.toString(p));

        System.out.print("Enter prime :");
        int num = sc.nextInt();
        boolean prime = true;

        if(num <= 1){
            prime = false;
        }
        for(int q = 2; q < num; q++){
            if(num % q == 0){
                prime = false;
            }
        }
        if(prime == true){
            System.out.println("Num is prime");
        }else{
            System.out.println("Num is not prime");
        }
    }
}
