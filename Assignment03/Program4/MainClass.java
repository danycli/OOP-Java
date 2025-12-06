package Assignment03.Program4;

public class MainClass {
    public static void main(String [] args){
        Publication[] items = new Publication[4];

        //Upcasting
        items[0] = new Book(1, "Schrödinger`s Cat","Dani Carvajal",230f);
        items[1] = new Magazine(2, "The Faith of God of War",1123,2022,499f);
        items[2] = new Book(3, "The Art of Being Alone","Renuka Gavrani",99f);
        items[3] = new Magazine(4, "Porsche 911",5443,2024,86f);
        
        items[0].calculateDiscountedPrice();
        items[0].displayInfo();

        System.out.println();
        items[1].calculateDiscountedPrice();
        items[1].displayInfo();

        //DownCasting
        System.out.println();
        Book b = (Book) items[2];
        b.calculateDiscountedPrice();
        b.displayInfo();
    }
}
