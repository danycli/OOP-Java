package Exception;

public class MainClass {
    public static void main(String [] args){
        item i1 = new item(34, "Coffee", 45);
        item i2 = new item(24, "Gaming Mouse", 45);
        i1.sellItem(50);
        System.out.println("Code is still Running");
        i1.setItemPrice(6000); 
        i1.sellItem(100); 
        i1.purchaseItem(-5);
        item.dividerMethod(10, 0);
        item.calculateSumOfItemsQuantities(i1, i2);
        i1.calculateType();
        i1.displayInfo();
    }
}