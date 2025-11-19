package AbstractionInterface;

public class VisaCard extends Payment{
    @Override
    protected void makePayment(int amount){
        System.out.println("Payment through VisaCard of amount : "+amount);
    }
}
