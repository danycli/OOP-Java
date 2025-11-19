package AbstractionInterface;

public class MainClass {
    public static void main(String [] args){
            Payment p1 = new JazzCash();

            p1.makePayment(4000);
            p1.printReciept();

            EasyPaisa e1 = new EasyPaisa();
            e1.makePayment(39002);
            e1.printReciept();

            VisaCard v1 = new VisaCard();
            v1.makePayment(33322);
            v1.printReciept();
    }

}
