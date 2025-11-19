package AbstractionInterface;

public class VisaCard extends Payment{
    public VisaCard(int amm){
        super(amm);
    }
    @Override
    protected void makePayment(){
        System.out.println("Payment through VisaCard of amount : "+ammount);
    }
}
