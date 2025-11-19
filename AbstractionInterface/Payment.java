package AbstractionInterface;

public abstract class Payment{
    protected abstract void makePayment(int amount);

    public void printReciept(){
        System.out.println("Payment Successful thanks for using our service");
    }
}
