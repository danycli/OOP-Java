package Assignment03.Program4;

public final class Book extends Publication{
    private String author;
    //Constructor
    public Book(int id, String title, String author, float price) {
        super(id, title, price, price);
        this.author = author;
    }
    //Setter
    public void setAuthor(String author) {
        this.author = author;
    }
    //Getter
    private String getAuthor() {
        return author;
    }
    //Discount
    @Override
    public void calculateDiscountedPrice(){
        discountedPrice = price * 0.90f;
    }
    //display
    @Override
    public void displayInfo(){
        System.out.println("Author = "+getAuthor());
        super.displayInfo();
    }
}
