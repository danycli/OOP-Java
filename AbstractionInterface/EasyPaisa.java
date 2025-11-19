package AbstractionInterface;

public class EasyPaisa extends Payment {
    public EasyPaisa(int amm){
        super(amm);
    }
    @Override
    protected void makePayment(){
        System.out.println("Payment through EasyPaisa of amount : "+ammount);
    }
}
