package Part4;

public class FoodOrder {
    private int orderId;
    private String CustomerName;
    private String PhoneNumber;
    private String foodType; //Drink or Food
    private String delivery;// Standard or Fast
    private float TotalDistance;
    private String OrderType;//DineIn, Site Order
    private float TableTax;
    private float deliveryCharges; 
    // private float litre;
    // private int numOfDrinks;
    private float Tax;
    private float Bill;
    static private int totalOrders = 0;

    //Setters
    void setOd(int id){
        this.orderId = id;
    }
    void setName(String name){
        CustomerName = name;
    }
    void setNumber(String number){
        PhoneNumber = number;
    }
    void setFoodType(String Ftype){
        this.foodType = Ftype;
    }
    void setDelivery(String delivery){
        this.delivery = delivery;
    }
    void setOrderType(String Otype){
        this.OrderType = Otype;
    }
    void setDistance(float distance){
        this.TotalDistance = distance;
    }
    //Getters
    int getId(){
        return orderId;
    }
    String getName(){
        return CustomerName;
    }
    String getNumber(){
        return PhoneNumber;
    }
    String getFoodType(){
        return foodType;
    }
    String getDeliveryType(){
        return delivery;
    }
    String getOrderType(){
        return OrderType;
    }
    float getDistance(){
        return TotalDistance;
    }
    float getDeliveryCharges(){
        return deliveryCharges;
    }
    float getTableTax(){
        return TableTax;
    }
    float getTax(){
        return Tax;
    }
    float getBill(){
        return Bill;
    }
    int getTotalOrders(){
        return totalOrders;
    }    

    //Constructors
    FoodOrder(int id, String Ftype, String DeliveryType, float distance, String name, String number, String OrderType){ //Constructor for Home Delivery
        orderId = id;
        foodType = Ftype;
        delivery = DeliveryType;
        TotalDistance = distance;
        CustomerName = name;
        PhoneNumber = number;
        this.OrderType = OrderType;
    }
    FoodOrder(int id, String Ftype,String name, String number, String OrderType){ //For Dine-In Order
        orderId = id;
        foodType = Ftype;
        CustomerName = name;
        PhoneNumber = number;
        this.OrderType = OrderType;
    }

    //Other Methods

    //Method for delicery Charges
    void DeliveryCharges(){
        if(TotalDistance <= 2.5){
            deliveryCharges = 250f;
        }else{
            deliveryCharges = 450f;
        }
    }
    //Method For TableTax
    private void tableTax(float bill){
        if(bill < 2500){
            TableTax = (4.2f/100)*bill;
        }else{
            TableTax = (6f/100)*bill;
        }
    }
    //Method for regular Tax
    private void tax(float bill){
        if(bill < 1500){
            Tax = (1.2f/100)*bill;            
        }else{
            Tax = (3.5f/100)*bill;  
        }
    }
    //Method for Total Bill
    void TotalBill(float bill){
        tax(bill);
        if(OrderType == "Dine-In"){
            tableTax(bill);
            Bill = bill + Tax + TableTax;
        }else{
            Bill = deliveryCharges + Tax;
        }
    }

}
