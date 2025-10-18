package Part4;
import java.util.Scanner;
public class MainClass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        float bill;
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
            System.out.print("Choose the Drink Of your Choice \n1.Coca Cola\n2.Pepsi\n3.Sprite\n4.7up\n5.Marinda\nChoose :");
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
                bill = nums*120f;
            }else if(litre == 2){
                bill = nums*180f;
            }else if(litre == 3){
                bill = nums*220f;
            }else{
                bill = nums*280f;
            }
        }else{
            System.out.println("Choose the Food Of your Choice \n1.Burger\n2.Pizza\n3.Pasta\n4.Biryani\n5.Chowmin\nChoose :");
            int food = sc.nextInt();
            while(food < 1 || food > 5){
                System.out.print("Invalid Choice!\nTry Again (1-5) :");
                food = sc.nextInt();
            }
            switch(food){
                case 1 :System.out.print("Which burger you want to Order \n1.Beef Burger\n2.Chicken Burger\n3.Fish Burger\n4.Veggie Burger\n5.Egg Burger\nChoose:");
                int burger =sc.nextInt();
                while(burger < 1 && burger > 5){
                    System.out.print("Invalid Choice!\nTry Again (1-15) :");
                    burger = sc.nextInt();
                }
                System.out.println("Now Choose the Size of the Burger\n1.Junior\n2.Classic\n3.King Size\nChoose :");
                int size = sc.nextInt();
                while(size < 1 && size > 3){
                    System.out.print("Invalid Choice!\nTry Again (1-15) :");
                    size = sc.nextInt();
                }
                System.out.print("Enter the Number of Burgers you want to Order\nChoose (Max 15):");
                int nums = sc.nextInt();
                while(nums < 1 && nums > 15){
                    System.out.print("Invalid Choice!\nTry Again (1-15) :");
                    nums = sc.nextInt();
                }
                if(burger == 1){
                    if(size == 1){
                        bill = nums * 450;
                    }else if(size == 2){
                        bill = nums * 800;
                    }else{
                        bill = nums * 1200;
                    }
                }else if(burger == 2){
                    if(size == 1){
                        bill = nums * 350;
                    }else if(size == 2){
                        bill = nums * 700;
                    }else{
                        bill = nums * 1050;
                    }
                }else if(burger == 3){
                    if(size == 1){
                        bill = nums * 650;
                    }else if(size == 2){
                        bill = nums * 1100;
                    }else{
                        bill = nums * 1550;
                    }
                }else if(burger == 4){
                    if(size == 1){
                        bill = nums * 250;
                    }else if(size == 2){
                        bill = nums * 400;
                    }else{
                        bill = nums * 750;
                    }
                }else{
                    if(size == 1){
                        bill = nums * 150;
                    }else if(size == 2){
                        bill = nums * 250;
                    }else{
                        bill = nums * 400;
                    }
                }
                case 2:System.out.print("Which pizza you want to Order \n1.Cheese Pizza\n2.Pepperoni Pizza\n3.BBQ Chicken Pizza\n4.Veggie Pizza\n5.Spicy Pizza\nChoose:");
                int pizza =sc.nextInt();
                while(pizza < 1 && pizza > 5){
                    System.out.print("Invalid Choice!\nTry Again (1-10) :");
                    pizza = sc.nextInt();
                }
                System.out.println("Now Choose the Size of the Pizza\n1.Small\n2.Medium\n3.Large\n4.Extra Large\nChoose :");
                int PizzaSize = sc.nextInt();
                while(PizzaSize < 1 && PizzaSize > 3){
                    System.out.print("Invalid Choice!\nTry Again (1-10) :");
                    PizzaSize = sc.nextInt();
                }
                System.out.print("Enter the Number of Pizzas you want to Order\nChoose (Max 10):");
                int PizzaNum = sc.nextInt();
                while(PizzaNum < 1 && PizzaNum > 10){
                    System.out.print("Invalid Choice!\nTry Again (1-10) :");
                    PizzaNum = sc.nextInt();
                }
                if(pizza == 1){
                    if(PizzaSize == 1){
                        bill = PizzaNum * 350;
                    }else if(PizzaSize == 2){
                        bill = PizzaNum * 600;
                    }else if(PizzaSize == 3){
                        bill = PizzaNum * 900;
                    }else{
                        bill = PizzaNum * 1200;
                    }
                }else if(pizza == 2){
                    if(PizzaSize == 1){
                        bill = PizzaNum * 400;
                    }else if(PizzaSize == 2){
                        bill = PizzaNum * 650;
                    }else if(PizzaSize == 3){
                        bill = PizzaNum * 800;
                    }else{
                        bill = PizzaNum * 1250;
                    }
                }else if(pizza == 3){
                    if(PizzaSize == 1){
                        bill = PizzaNum * 650;
                    }else if(PizzaSize == 2){
                        bill = PizzaNum * 900;
                    }else if(PizzaSize == 3){
                        bill = PizzaNum * 1100;
                    }else{
                        bill = PizzaNum * 1450;
                    }
                }else if(pizza == 4){
                    if(PizzaSize == 1){
                        bill = PizzaNum * 250;
                    }else if(PizzaSize == 2){
                        bill = PizzaNum * 450;
                    }else if(PizzaSize == 3){
                        bill = PizzaNum * 750;
                    }else{
                        bill = PizzaNum * 1050;
                    }
                }else{
                    if(PizzaSize == 1){
                        bill = PizzaNum * 500;
                    }else if(PizzaSize == 2){
                        bill = PizzaNum * 750;
                    }else if(PizzaSize == 3){
                        bill = PizzaNum * 999;
                    }else{
                        bill = PizzaNum * 1350;
                    }
            }
            case 3:System.out.print("Which Pasta you want to Order \n1.Spaghetti\n2.Macaroni\n3.Fusilli\nChoose:");
            int pasta = sc.nextInt();
            while(pasta < 1 && pasta > 3){
                    System.out.print("Invalid Choice!\nTry Again (1-15) :");
                    pasta = sc.nextInt();
            }
            System.out.print("Select Pasta size\n1.Small Plate\n2.Medium Plate\n3.Large Plate\nChoose :");
            int pastaSize = sc.nextInt();
            while(pastaSize < 1 && pastaSize > 3){
                    System.out.print("Invalid Choice!\nTry Again (1-15) :");
                    pastaSize = sc.nextInt();
            }
            System.out.print("Enter the Number of Pastas you want to order\nChoose (Max 10): ");
            
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
}
