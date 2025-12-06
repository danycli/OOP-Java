package Assignment04.Program4;

public abstract class Publication {
    private int id;
    private String title;
    private float price;
    private float discountedPrice;
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
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public float getPrice() {
        return price;
    }
    public float getDiscountedPrice() {
        return discountedPrice;
    }

}
