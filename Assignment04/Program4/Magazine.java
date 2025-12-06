package Assignment04.Program4;

public class Magazine extends Publication{
    private int id;
    private String title;
    private int IssueNumber;
    private int year;
    private float price;
    private float discountedPrice;
    //Constructor
    public Magazine(int id, String title, int issueNumber, int year, float price) {
        this.id = id;
        this.title = title;
        IssueNumber = issueNumber;
        this.year = year;
        this.price = price;
    }
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIssueNumber(int issueNumber) {
        IssueNumber = issueNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    //Getters
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public int getIssueNumber() {
        return IssueNumber;
    }
    public int getYear() {
        return year;
    }
    public float getPrice() {
        return price;
    }
    public float getDiscountedPrice() {
        return discountedPrice;
    }
    //Discount
    public void calculateDiscountedPrice(){
        discountedPrice = price * 0.30f;
    }
    //display
    public void display(){
    }
}
