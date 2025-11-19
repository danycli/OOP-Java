package AbstractionInterface;

public class EasyPaisa extends Payment {
    @Override
    protected void makePayment(int amount){
        System.out.println("Payment through EasyPaisa of amount : "+amount);
    }
}
