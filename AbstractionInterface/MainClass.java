package AbstractionInterface;

public class MainClass {
    //As currently we are using the abstract class cz we have one method in common, both in name and in behaviour, but if we got to have the methods with the same name and diff behaviour then they are gonna be in the inerface class which is fully hiding of the data....
    public static void main(String [] args){
            Payment p1 = new JazzCash(665);

            p1.makePayment();
            p1.printReciept();

            EasyPaisa e1 = new EasyPaisa(434);
            e1.makePayment();
            e1.printReciept();

            VisaCard v1 = new VisaCard(756);
            v1.makePayment();
            v1.printReciept();
    }

}
