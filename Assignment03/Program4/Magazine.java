package Assignment03.Program4;

public final class Magazine extends Publication{
    private int IssueNumber;
    private int year;
    //Constructor
    public Magazine(int id, String title, int issueNumber, int year, float price) {
        super(id, title, price, price);
        IssueNumber = issueNumber;
        this.year = year;
    }
    //Setter
    public void setIssueNumber(int issueNumber) {
        IssueNumber = issueNumber;
    }
    public void setYear(int year) {
        this.year = year;
    }
    //Getters
    protected int getIssueNumber() {
        return IssueNumber;
    }
    protected int getYear() {
        return year;
    }
    //Discount
    public void calculateDiscountedPrice(){
        discountedPrice = price * 0.30f;
    }
    //display
    @Override
    public void displayInfo(){
        System.out.println("Issue Number = "+getIssueNumber());
        System.out.println("Year Published = "+getYear());
        super.displayInfo();
    }
}
