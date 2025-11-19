package AbstractionInterface;
public abstract class Payment{
    protected int ammount;

    protected Payment(int am){
        ammount = am;
    }
    protected abstract void makePayment();
    public void printReciept(){
        System.out.println("Payment Successful thanks for using our service");
    }
}
