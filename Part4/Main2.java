package Part4;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String DrinkName = "Null";
        float DrinkSize = 0.0f;
        int numOfDrinks = 0;
        String FoodName = "Null";
        String FoodSize = "Null";
        int FoodNum = 0;
        float bill = 0;
        System.out.print("Choose Order Type \n1.Dine-In\n2.Home Delivery\nChoose :");
        int orderType = sc.nextInt();
        sc.nextLine();
        while(orderType < 1 || orderType > 2){
            System.out.print("Invalid Choice!\nTry Again (1-2):");
            orderType = sc.nextInt();
        }
        System.out.print("Enter your Name :");
        String name = sc.nextLine();
        System.out.print("Enter your Phone Number :");
        String number = sc.nextLine();

        System.out.print("Choose Food Type \n1.Drink\n2.Food\nChoose :");
        int FoodType = sc.nextInt();
        while (FoodType < 1 || FoodType > 2) {
            System.out.print("Invalid Choice!\nTry Again (1-2) :");
            FoodType = sc.nextInt();
        }
        if(FoodType == 1){
            System.out.print("Choose the Drink Of your Choice \n1.Coca Cola\n2.Pepsi\n3.Sprite\n4.7up\n5.Marinda\nChoose :");
            int drink = sc.nextInt();
            while (drink < 1 || drink > 5) {
                System.out.print("Invalid Choice!\nTry Again (1-5) :");
                drink = sc.nextInt();
            }
            if(drink == 1){
                DrinkName = "Coca Cola";
            }else if(drink == 2){
                DrinkName = "Pepsi";
            }else if(drink == 3){
                DrinkName = "Sprite";
            }else if(drink == 4){
                DrinkName = "7up";
            }else{
                DrinkName = "Marinda";
            }
            System.out.print("Choose Drink Size\n1. 1Litre\n2. 1.5Litre \n3. 2Litre\n4. 2.25Litre\nChoose :");
            int litre = sc.nextInt();
            System.out.print("Choose the number of drinks (Max 10):");
            numOfDrinks = sc.nextInt();
            while (numOfDrinks < 1 || numOfDrinks > 10) {
                System.out.print("Invalid Choice!\nTry Again (1-10) :");
                numOfDrinks = sc.nextInt();
            }
            if (litre == 1) {
                bill = numOfDrinks * 120f;
                DrinkSize = 1.0f;
            } else if (litre == 2) {
                bill = numOfDrinks * 180f;
                DrinkSize = 1.5f;
            } else if (litre == 3) {
                bill = numOfDrinks * 220f;
                DrinkSize = 2.0f;
            } else {
                bill = numOfDrinks * 280f;
                DrinkSize = 2.25f;
            }
        } else {
            System.out.print("Choose the Food Of your Choice \n1.Burger\n2.Pizza\n3.Pasta\n4.Biryani\n5.Chowmin\n0.Exit\nChoose :");
            int food = sc.nextInt();
            while (food < 0 || food > 5) {
                System.out.print("Invalid Choice!\nTry Again (0-5) :");
                food = sc.nextInt();
            }
            switch (food) {
                case 1:
                    System.out.print("Which burger you want to Order \n1.Beef Burger\n2.Chicken Burger\n3.Fish Burger\n4.Veggie Burger\n5.Egg Burger\nChoose:");
                    int burger = sc.nextInt();
                    while (burger < 1 || burger > 5) {
                        System.out.print("Invalid Choice!\nTry Again (1-5) :");
                        burger = sc.nextInt();
                    }   
                    System.out.print("Now Choose the Size of the Burger\n1.Junior\n2.Classic\n3.King Size\nChoose :");
                    int size = sc.nextInt();
                    while (size < 1 || size > 3) {
                        System.out.print("Invalid Choice!\nTry Again (1-3) :");
                        size = sc.nextInt();
                    }
                    if(size == 1){
                        FoodSize = "Junior";
                    }else if(size == 2){
                        FoodSize = "Classic";
                    }else{
                        FoodSize = "King Size";
                    }
                    System.out.print("Enter the Number of Burgers you want to Order\nChoose (Max 15):");
                    FoodNum = sc.nextInt();
                    while (FoodNum < 1 || FoodNum > 15) {
                        System.out.print("Invalid Choice!\nTry Again (1-15) :");
                        FoodNum = sc.nextInt();
                    }
                    if (burger == 1) {
                        FoodName = "Beef Burger";
                        if (size == 1) {
                            bill = FoodNum * 450;
                        } else if (size == 2) {
                            bill = FoodNum * 800;
                        } else {
                            bill = FoodNum * 1200;
                        }
                    } else if (burger == 2) {
                        FoodName = "Chicken Burger";
                        if (size == 1) {
                            bill = FoodNum * 350;
                        } else if (size == 2) {
                            bill = FoodNum * 700;
                        } else {
                            bill = FoodNum * 1050;
                        }
                    } else if (burger == 3) {
                        FoodName = "Fish Burger";
                        if (size == 1) {
                            bill = FoodNum * 650;
                        } else if (size == 2) {
                            bill = FoodNum * 1100;
                        } else {
                            bill = FoodNum * 1550;
                        }
                    } else if (burger == 4) {
                        FoodName = "Veggie Burger";
                        if (size == 1) {
                            bill = FoodNum * 250;
                        } else if (size == 2) {
                            bill = FoodNum * 400;
                        } else {
                            bill = FoodNum * 750;
                        }
                    } else {
                        FoodName = "Egg Burger";
                        if (size == 1) {
                            bill = FoodNum * 150;
                        } else if (size == 2) {
                            bill = FoodNum * 250;
                        } else {
                            bill = FoodNum * 400;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Which pizza you want to Order \n1.Cheese Pizza\n2.Pepperoni Pizza\n3.BBQ Chicken Pizza\n4.Veggie Pizza\n5.Spicy Pizza\nChoose:");
                    int pizza = sc.nextInt();
                    while (pizza < 1 || pizza > 5) {
                        System.out.print("Invalid Choice!\nTry Again (1-5) :");
                        pizza = sc.nextInt();
                    }
                    System.out.println("Now Choose the Size of the Pizza\n1.Small\n2.Medium\n3.Large\n4.Extra Large\nChoose :");
                    int PizzaSize = sc.nextInt();
                    while (PizzaSize < 1 || PizzaSize > 4) {
                        System.out.print("Invalid Choice!\nTry Again (1-4) :");
                        PizzaSize = sc.nextInt();
                    }
                    if(PizzaSize == 1){
                        FoodSize = "Small";
                    }else if(PizzaSize == 2){
                        FoodSize = "Medium";
                    }else if(PizzaSize == 3){
                        FoodSize = "Large";
                    }else{
                        FoodSize = "Extra Large";
                    }
                    System.out.print("Enter the Number of Pizzas you want to Order\nChoose (Max 10):");
                    FoodNum = sc.nextInt();
                    while (FoodNum < 1 || FoodNum > 10) {
                        System.out.print("Invalid Choice!\nTry Again (1-10) :");
                        FoodNum = sc.nextInt();
                    }
                    if (pizza == 1) {
                        FoodName = "Cheese Pizza";
                        if (PizzaSize == 1) {
                            bill = FoodNum * 350;
                        } else if (PizzaSize == 2) {
                            bill = FoodNum * 600;
                        } else if (PizzaSize == 3) {
                            bill = FoodNum * 900;
                        } else {
                            bill = FoodNum * 1200;
                        }
                    } else if (pizza == 2) {
                        FoodName = "Pepperoni Pizza";
                        if (PizzaSize == 1) {
                            bill = FoodNum * 400;
                        } else if (PizzaSize == 2) {
                            bill = FoodNum * 650;
                        } else if (PizzaSize == 3) {
                            bill = FoodNum * 800;
                        } else {
                            bill = FoodNum * 1250;
                        }
                    } else if (pizza == 3) {
                        FoodName = "BBQ Chicken Pizza";
                        if (PizzaSize == 1) {
                            bill = FoodNum * 650;
                        } else if (PizzaSize == 2) {
                            bill = FoodNum * 900;
                        } else if (PizzaSize == 3) {
                            bill = FoodNum * 1100;
                        } else {
                            bill = FoodNum * 1450;
                        }
                    } else if (pizza == 4) {
                        FoodName = "Veggie Pizza";
                        if (PizzaSize == 1) {
                            bill = FoodNum * 250;
                        } else if (PizzaSize == 2) {
                            bill = FoodNum * 450;
                        } else if (PizzaSize == 3) {
                            bill = FoodNum * 750;
                        } else {
                            bill = FoodNum * 1050;
                        }
                    } else {
                        FoodName = "Spicy Pizza";
                        if (PizzaSize == 1) {
                            bill = FoodNum * 500;
                        } else if (PizzaSize == 2) {
                            bill = FoodNum * 750;
                        } else if (PizzaSize == 3) {
                            bill = FoodNum * 999;
                        } else {
                            bill = FoodNum * 1350;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Which Pasta you want to Order \n1.Spaghetti\n2.Macaroni\n3.Fusilli\nChoose:");
                    int pasta = sc.nextInt();
                    while (pasta < 1 || pasta > 3) {
                        System.out.print("Invalid Choice!\nTry Again (1-3) :");
                        pasta = sc.nextInt();
                    }
                    System.out.print("Select Pasta size\n1.Small Plate\n2.Medium Plate\n3.Large Plate\nChoose :");
                    int pastaSize = sc.nextInt();
                    while (pastaSize < 1 || pastaSize > 3) {
                        System.out.print("Invalid Choice!\nTry Again (1-3) :");
                        pastaSize = sc.nextInt();
                    }
                    if(pastaSize == 1){
                        FoodSize = "Small Plate";
                    }else if(pastaSize == 2){
                        FoodSize = "Medium Plate";
                    }else{
                        FoodSize = "Large Plate";
                    }
                    System.out.print("Enter the Number of Pastas you want to order\nChoose (Max 10): ");
                    FoodNum = sc.nextInt();
                    while (FoodNum < 1 || FoodNum > 10) {
                        System.out.print("Invalid Choice!\nTry Again (1-10) :");
                        FoodNum = sc.nextInt();
                    }
                    if (pasta == 1) {
                        FoodName = "Spaghetti";
                        if (pastaSize == 1) {
                            bill = FoodNum * 150;
                        } else if (pastaSize == 2) {
                            bill = FoodNum * 250;
                        } else {
                            bill = FoodNum * 400;
                        }
                    } else if (pasta == 2) {
                        FoodName = "Macaroni";
                        if (pastaSize == 1) {
                            bill = FoodNum * 200;
                        } else if (pastaSize == 2) {
                            bill = FoodNum * 350;
                        } else {
                            bill = FoodNum * 600;
                        }
                    } else {
                        FoodName = "Fusilli";
                        if (pastaSize == 1) {
                            bill = FoodNum * 130;
                        } else if (pastaSize == 2) {
                            bill = FoodNum * 200;
                        } else {
                            bill = FoodNum * 360;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Which Biryani you want to Order \n1.Simple Biryani\n2.Chicken Biryani\nChoose:");
                    int biryani = sc.nextInt();
                    while (biryani < 1 || biryani > 2) {
                        System.out.print("Invalid Choice!\nTry Again (1-2): ");
                        biryani = sc.nextInt();
                    }
                    System.out.print("Select Biryani Plate Size\n1.Small Plate\n2.Medium Plate\n3.Large Plate\nChoose :");
                    int biryaniSize = sc.nextInt();
                    while (biryaniSize < 1 || biryaniSize > 3) {
                        System.out.print("Invalid Choice!\nTry Again (1-3): ");
                        biryaniSize = sc.nextInt();
                    }
                    if(biryaniSize == 1){
                        FoodSize = "Small Plate";
                    }else if(biryaniSize == 2){
                        FoodSize = "Medium Plate";
                    }else{
                        FoodSize = "Large Plate";
                    }
                    System.out.print("Enter the Number of Biryani Plates you want to order\nChoose (Max 10): ");
                    FoodNum = sc.nextInt();
                    while (FoodNum < 1 || FoodNum > 10) {
                        System.out.print("Invalid Choice!\nTry Again (1-10):");
                        FoodNum = sc.nextInt();
                    }
                    if (biryani == 1) {
                        FoodName = "Simple Biryani";
                        if (biryaniSize == 1) {
                            bill = FoodNum * 200;
                        } else if (biryaniSize == 2) {
                            bill = FoodNum * 350;
                        } else {
                            bill = FoodNum * 600;
                        }
                    } else {
                        FoodName = "Chicken Biryani";
                        if (biryaniSize == 1) {
                            bill = FoodNum * 300;
                        } else if (biryaniSize == 2) {
                            bill = FoodNum * 450;
                        } else {
                            bill = FoodNum * 750;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Which Chowmin you want to Order \n1.Chicken Chowmein\n2.Beef Chowmein\n3.Vegetable Chowmein\nChoose:");
                    int chowmin = sc.nextInt();
                    while (chowmin < 1 || chowmin > 3) {
                        System.out.print("Invalid Choice!\nTry Again (1-3):");
                        chowmin = sc.nextInt();
                    }
                    System.out.print("Select Chowmin Plate Size\n1.Small Plate\n2.Medium Plate\n3.Large Plate\nChoose :");
                    int chowminSize = sc.nextInt();
                    while (chowminSize < 1 || chowminSize > 3) {
                        System.out.print("Invalid Choice!\nTry Again (1-3): ");
                        chowminSize = sc.nextInt();
                    }
                    if(chowminSize == 1){
                        FoodSize = "Small Plate";
                    }else if(chowminSize == 2){
                        FoodSize = "Medium Plate";
                    }else{
                        FoodSize = "Large Plate";
                    }
                    System.out.print("Enter the Number of Chowmin Plates you want to order\nChoose (Max 10): ");
                    FoodNum = sc.nextInt();
                    while (FoodNum < 1 || FoodNum > 10) {
                        System.out.print("Invalid Choice!\nTry Again (1-10):");
                        FoodNum = sc.nextInt();
                    }
                    if (chowmin == 1) {
                        FoodName = "Chicken Chowmin";
                        if (chowminSize == 1) {
                            bill = FoodNum * 350;
                        } else if (chowminSize == 2) {
                            bill = FoodNum * 490;
                        } else {
                            bill = FoodNum * 660;
                        }
                    } else if (chowmin == 2) {
                        FoodName = "Beef Chowmin";
                        if (chowminSize == 1) {
                            bill = FoodNum * 400;
                        } else if (chowminSize == 2) {
                            bill = FoodNum * 570;
                        } else {
                            bill = FoodNum * 790;
                        }
                    } else {
                        FoodName = "Vegetable Chowmin";
                        if (chowminSize == 1) {
                            bill = FoodNum * 200;
                        } else if (chowminSize == 2) {
                            bill = FoodNum * 320;
                        } else {
                            bill = FoodNum * 410;
                        }
                    }
                    break;
                default:
                    System.out.println("Come Again WhenEver you Like!");
                    break;
            }
        }

            String foodType;
            if (FoodType == 1) {
                foodType = "Drink";
            } else {
                foodType = "Food";
            }
            String Type;
            if (orderType == 1) {
                Type = "Dine-In";
                FoodOrder F1 = new FoodOrder(12, foodType, name, number, Type);
                F1.setDrinkName(DrinkName);
                F1.setLitre(DrinkSize);
                F1.setNumOfDrinks(numOfDrinks);
                F1.setFoodName(FoodName);
                F1.setFoodSize(FoodSize);
                F1.setFoodNum(FoodNum);
                F1.TotalBill(bill);
                F1.displayInfo();
            } else {
                Type = "Home Delivery";
                String delivery;
                System.out.print("Enter Delivery Type \n1.Standard \n2.Fast\nChoose :");
                int DeliveryType = sc.nextInt();
                while (DeliveryType < 1 || DeliveryType > 2) {
                    System.out.print("Invalid Choice!\nTry Again (1-2):");
                    DeliveryType = sc.nextInt();
                }
                if (DeliveryType == 1) {
                    delivery = "Standard";
                } else {
                    delivery = "Fast";
                }
                System.out.print("Enter the Distance of between our Facility and your Address (In km):");
                float km = sc.nextFloat();
                while (km < 0.0f) {
                    System.out.print("Distance Can't be negative!\nTry Again :");
                    km = sc.nextFloat();
                }
                FoodOrder F2 = new FoodOrder(23, foodType, delivery, km, name, number, Type);
                F2.setDrinkName(DrinkName);
                F2.setLitre(DrinkSize);
                F2.setNumOfDrinks(numOfDrinks);
                F2.setFoodName(FoodName);
                F2.setFoodSize(FoodSize);
                F2.setFoodNum(FoodNum);
                F2.DeliveryCharges();
                F2.TotalBill(bill);
                F2.displayInfo();
            }
        sc.close();
    }
}