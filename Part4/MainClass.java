package Part4;
import java.util.Scanner;
public class MainClass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose Order Type \n1.Dine-In\n2.Home Delivery\nChoose :");
        int orderType = sc.nextInt();
        System.out.print("Enter your Name :");
        String name = sc.nextLine();
        System.out.print("Enter your Phone Number :");
        String number = sc.nextLine();

        System.out.print("Choose Food Type :\n1.Drink\2.Food\nChoose :");
        int FoodType = sc.nextInt(); 
        while(FoodType < 1 || FoodType > 2){
            System.out.print("Invalid Choice!\nTry Again (1-2) :");
            FoodType = sc.nextInt();
        }
        if(FoodType == 1){
            System.out.println("Choose the Drink Of your Choice \n1.Coca Cola\n2.Pepsi\n3.Sprite\n4.7up\n5.Marinda");
            int drink = sc.nextInt();
            while(drink < 1 || drink > 5){
                System.out.print("Invalid Choice!\nTry Again (1-5) :");
                drink = sc.nextInt();
            }
            System.out.print("Choose Drink Size\n1. 1Litre\n2. 1.5Litre \n3. 2Litre\n 4. 2.25Litre\nChoose :");
            int litre = sc.nextInt();
            System.out.println("Choose the number of drinks (Max 10):");
            int nums = sc.nextInt();
            while(nums < 1 || nums > 10){
                System.out.print("Invalid Choice!\nTry Again (1-5) :");
                nums = sc.nextInt();
            }
            if(litre == 1){

            }
        }
        
        String foodName ;
        if(FoodType == 1){
            foodName = "Drink"; 
        }else{
            foodName = "Food"; 
        }
        String Type;
        if(orderType == 1){
            Type = "Dine-In";
        }else{
            Type = "Home Delivery";
        }
        FoodOrder F1 = new FoodOrder(12,foodName,name,number,Type);
    }
}
