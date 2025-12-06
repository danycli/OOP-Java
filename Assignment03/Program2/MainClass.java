package Assignment03.Program2;

public class MainClass {
    public static void main(String [] args){
        Machine m1 = new Machine(12, 2);

        m1.calculateTotalSensorsValue();
        System.out.println((m1.checkSensorOutput() == true) ? "All Sensors are of same type" : "All sensors are not of same type");
        m1.displayInfo();
    }
}
