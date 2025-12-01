package Exception;

public class item {
    private int itemId;
    private String productName;
    private int totalQuantity;
    private double itemPrice;
    private String type; 
    //Constructor
    public item(int itemId, String productName, int totalQuantity) {
        this.itemId = itemId;
        this.productName = productName;
        this.totalQuantity = totalQuantity;
    }
    //Setters
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
    //getters
    public int getItemId() {
        return itemId;
    }
    public String getProductName() {
        return productName;
    }
    public int getTotalQuantity() {
        return totalQuantity;
    }
    public double getItemPrice() {
        return itemPrice;
    }
    public String getType() {
        return type;
    }

    void sellItem(int quantity) {
        try{
            if(quantity < totalQuantity){
                totalQuantity = totalQuantity-quantity;
            }else{
                throw new itemException("is greater than the amount of quantity we have quantity is greater than the total quantity", quantity);
            }
        }
        catch(itemException e){
            e.display();
        }
    }
    void purchaseItem(int quantity){
        try{
            if(quantity > 0){
            totalQuantity= totalQuantity+ quantity;
        }else{
            throw new itemException(" quantity is Invalid",quantity);
        }
        }
        catch(itemException e){
            e.display();
        }
    }
    static int dividerMethod(int N1, int N2){
        try{
            int result = N1/N2;
            return result;
        }
        catch(ArithmeticException w){
            System.out.println("N2 cant be zero");
            return 0;
        }
    }
    static int calculateSumOfItemsQuantities(item I1, item I2){
        try{
            int sum= I1. totalQuantity + I2. totalQuantity;
            return sum;
        }
        catch(NullPointerException b){
            System.out.println("Null Pointer Exception");
            return 0;
        }
    }
    void calculateType(){
            type = (itemPrice > 5000) ? "Expensive" : "Not Expensive";
    }
    void displayInfo() {
        System.out.println(itemId+" "+itemPrice+" "+type+" "+totalQuantity+" "+productName);
    }
}
