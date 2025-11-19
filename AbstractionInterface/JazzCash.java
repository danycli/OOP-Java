package AbstractionInterface;

public class JazzCash extends Payment{
    @Override
    public void makePayment(int amount){
        System.out.println("Payment through Jazz Cash of amount : "+amount);
    }
}
