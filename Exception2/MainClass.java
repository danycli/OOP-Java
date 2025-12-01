package Exception2;

public class MainClass {
    public static void main(String [] args){
        HybridCar h1 = new HybridCar(101, 1500, 5000);
        h1.fillFuel(40);
        h1.chargeBattery(120);
        h1.calculatePrice();
    }
}
