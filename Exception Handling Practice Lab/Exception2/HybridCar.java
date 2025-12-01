package Exception2;

import java.text.NumberFormat;

public class HybridCar implements MechanicalCar, ElectricalCar {
    private int carId;
    private int horsePower;
    private int elctricalBatteryPower;
    private int fuelQuantity;
    private int batteryTime;
    private double price;

    //Constructor
    public HybridCar(int carId, int horsePower, int elctricalBatteryPower) {
        this.carId = carId;
        this.horsePower = horsePower;
        this.elctricalBatteryPower = elctricalBatteryPower;
    }

    //setters
    public void setCarId(int carId) {
        this.carId = carId;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public void setElctricalBatteryPower(int elctricalBatteryPower) {
        this.elctricalBatteryPower = elctricalBatteryPower;
    }
    //Getters
    public int getCarId() {
        return carId;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public int getElctricalBatteryPower() {
        return elctricalBatteryPower;
    }
    public int getFuelQuantity() {
        return fuelQuantity;
    }
    public int getBatteryTime() {
        return batteryTime;
    }
    public double getPrice() {
        return price;
    }
    //Other Methods...
    
    public void chargeBattery(int batterytime){
        batteryTime = batterytime;
        System.out.println("Battery charged for: " + batterytime + " minutes.");
    }
    public void calculatePrice(){
        this.price = (horsePower * 500) + (elctricalBatteryPower * 300);
        System.out.println("Calculated Price: " + NumberFormat.getCurrencyInstance().format(this.price));
    }

    public void fillFuel(int fuelqunatity){
        fuelQuantity = fuelqunatity;
        System.out.println("Fuel tank filled with: " + fuelqunatity + " liters.");
    }

}
