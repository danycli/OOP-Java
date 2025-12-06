package Assignment04.Program4;

public abstract class Publication {
    private int id;
    private String title;
    protected float price;
    protected float discountedPrice;
    //Constructor
    public Publication(int id, String title, float price, float discountedPrice) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.discountedPrice = discountedPrice;
    }
    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setDiscountedPrice(float discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
    //Getters
    private int getId() {
        return id;
    }
    private String getTitle() {
        return title;
    }
    private float getPrice() {
        return price;
    }
    private float getDiscountedPrice() {
        return discountedPrice;
    }

    //discounted
    protected abstract void calculateDiscountedPrice();
    //display
    protected void displayInfo(){
        System.out.println("Id = "+getId());
        System.out.println("Title = "+getTitle());
        System.out.println("Price = "+getPrice());
        System.out.println("Discounted price = "+getDiscountedPrice());
    }
}
