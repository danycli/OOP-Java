package p6;

/*.Book
Fields: Title, Author, Price, Number of Pages, Discount
Logic: Give discount if the book is long (more than certain pages).
Output: Show book details and final price after discount. */

public class book {
    private String Title;
    private String Author;
    private double Price;
    private int NoOfPages;
    private double Discount;

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setNoOfPage(int noofpages) {
        NoOfPages = noofpages;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public double getPrice() {
        return Price;
    }

    public int getNoOFPages() {
        return NoOfPages;
    }

    public double getDiscount() {
        return Discount;
    }

    public void calculateDiscount() {
        if (NoOfPages >= 1000) {
            Discount = Price - (Price * (50.0 / 100));// 10% discount
        } else if (NoOfPages >= 500) {
            Discount = Price - (Price * (25.0 / 100));// 25% discount
        } else if (NoOfPages >= 100) {
            Discount = Price - (Price * (10.0 / 100));// 50% discount
        } else {
            System.out.println("Discount Unavailable for this book");
        }
    }

    public void displayInfo() {
        System.out.println("Title = " + Title);
        System.out.println("Author Of the Book = " + Author);
        System.out.println("Price = " + Price);
        System.out.println("Number of pages = " + NoOfPages);
        System.out.println("Discounted price = " + Discount);
    }

}