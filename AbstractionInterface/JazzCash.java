package AbstractionInterface;

public class JazzCash extends Payment{
    public JazzCash(int amm){
        super(amm);
    }
    @Override
    public void makePayment(){
        System.out.println("Payment through Jazz Cash of amount : "+ammount);
    }
}
