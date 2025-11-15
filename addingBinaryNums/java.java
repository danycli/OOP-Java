package addingBinaryNums;

public class java {
    public class Car {
    private int carId;
    private double price;

    public Car(int carId, double price) {
        setCarId(carId);
        setPrice(price);
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        if(carId >= 1000 && carId <= 9999999) {
            this.carId = carId;
        } else {
            System.out.println("Invalid Car ID");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }
}
}
