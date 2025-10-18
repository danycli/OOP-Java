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
        orderType = FoodOrder.invalidCheck(1, 2, orderType,sc);
        sc.nextLine();
        System.out.print("Enter your Name :");
        String name = sc.nextLine();
        System.out.print("Enter your Phone Number :");
        String number = sc.nextLine();

        System.out.print("Choose Food Type \n1.Drink\n2.Food\n3.Both\nChoose :");
        int FoodType = sc.nextInt();
        FoodType = FoodOrder.invalidCheck(1, 3, FoodType,sc);
        //For Drinks
        if(FoodType == 1){
            System.out.print("Choose the Drink Of your Choice \n1.Coca Cola\n2.Pepsi\n3.Sprite\n4.7up\n5.Marinda\nChoose :");
            int drink = sc.nextInt();
            drink = FoodOrder.invalidCheck(1, 2, drink,sc);
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
            numOfDrinks = FoodOrder.invalidCheck(1, 2, numOfDrinks,sc);
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
            // For Food
        } else if (FoodType == 2) {
            System.out.print("Choose the Food Of your Choice \n1.Burger\n2.Pizza\n3.Pasta\n4.Biryani\n5.Chowmin\n0.Exit\nChoose :");
            int food = sc.nextInt();
            food = FoodOrder.invalidCheck(1, 2, food,sc);
            switch (food) {
                case 1:
                    System.out.print("Which burger you want to Order \n1.Beef Burger\n2.Chicken Burger\n3.Fish Burger\n4.Veggie Burger\n5.Egg Burger\nChoose:");
                    int burger = sc.nextInt();
                    burger = FoodOrder.invalidCheck(1, 5, burger,sc);   
                    System.out.print("Now Choose the Size of the Burger\n1.Junior\n2.Classic\n3.King Size\nChoose :");
                    int size = sc.nextInt();
                    size = FoodOrder.invalidCheck(1, 3, size,sc);
                    if(size == 1){
                        FoodSize = "Junior";
                    }else if(size == 2){
                        FoodSize = "Classic";
                    }else{
                        FoodSize = "King Size";
                    }
                    System.out.print("Enter the Number of Burgers you want to Order\nChoose (Max 15):");
                    FoodNum = sc.nextInt();
                    FoodNum = FoodOrder.invalidCheck(1, 15, FoodNum,sc);
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
                    pizza = FoodOrder.invalidCheck(1, 2, pizza,sc);
                    System.out.println("Now Choose the Size of the Pizza\n1.Small\n2.Medium\n3.Large\n4.Extra Large\nChoose :");
                    int PizzaSize = sc.nextInt();
                    PizzaSize = FoodOrder.invalidCheck(1, 4, PizzaSize,sc);
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
                    FoodNum = FoodOrder.invalidCheck(1, 10, FoodNum,sc);
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
                    pasta = FoodOrder.invalidCheck(1, 3, pasta,sc);
                    System.out.print("Select Pasta size\n1.Small Plate\n2.Medium Plate\n3.Large Plate\nChoose :");
                    int pastaSize = sc.nextInt();
                    pastaSize = FoodOrder.invalidCheck(1, 3, pastaSize,sc);
                    if(pastaSize == 1){
                        FoodSize = "Small Plate";
                    }else if(pastaSize == 2){
                        FoodSize = "Medium Plate";
                    }else{
                        FoodSize = "Large Plate";
                    }
                    System.out.print("Enter the Number of Pastas you want to order\nChoose (Max 10): ");
                    FoodNum = sc.nextInt();
                    FoodNum = FoodOrder.invalidCheck(1, 10, FoodNum,sc);
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
                    biryani = FoodOrder.invalidCheck(1, 2, biryani,sc);
                    System.out.print("Select Biryani Plate Size\n1.Small Plate\n2.Medium Plate\n3.Large Plate\nChoose :");
                    int biryaniSize = sc.nextInt();
                    biryaniSize = FoodOrder.invalidCheck(1, 3, biryaniSize,sc);
                    if(biryaniSize == 1){
                        FoodSize = "Small Plate";
                    }else if(biryaniSize == 2){
                        FoodSize = "Medium Plate";
                    }else{
                        FoodSize = "Large Plate";
                    }
                    System.out.print("Enter the Number of Biryani Plates you want to order\nChoose (Max 10): ");
                    FoodNum = sc.nextInt();
                    FoodNum = FoodOrder.invalidCheck(1, 10, FoodNum,sc);
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
                    chowmin = FoodOrder.invalidCheck(1, 3, chowmin,sc);
                    System.out.print("Select Chowmin Plate Size\n1.Small Plate\n2.Medium Plate\n3.Large Plate\nChoose :");
                    int chowminSize = sc.nextInt();
                    chowminSize = FoodOrder.invalidCheck(1, 3, chowminSize,sc);
                    if(chowminSize == 1){
                        FoodSize = "Small Plate";
                    }else if(chowminSize == 2){
                        FoodSize = "Medium Plate";
                    }else{
                        FoodSize = "Large Plate";
                    }
                    System.out.print("Enter the Number of Chowmin Plates you want to order\nChoose (Max 10): ");
                    FoodNum = sc.nextInt();
                    FoodNum = FoodOrder.invalidCheck(1, 10, FoodNum,sc);
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
            // For both Food & Drinks
        } else {
            float billDrink = 0.0f;
            float billFood = 0.0f;
            System.out.print("Choose the Drink Of your Choice \n1.Coca Cola\n2.Pepsi\n3.Sprite\n4.7up\n5.Marinda\nChoose :");
            int drink = sc.nextInt();
            drink = FoodOrder.invalidCheck(1, 5, drink,sc);
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
            numOfDrinks = FoodOrder.invalidCheck(1, 10, numOfDrinks,sc);
            if (litre == 1) {
                billDrink = numOfDrinks * 120f;
                DrinkSize = 1.0f;
            } else if (litre == 2) {
                billDrink = numOfDrinks * 180f;
                DrinkSize = 1.5f;
            } else if (litre == 3) {
                billDrink = numOfDrinks * 220f;
                DrinkSize = 2.0f;
            } else {
                billDrink = numOfDrinks * 280f;
                DrinkSize = 2.25f;
            }

            System.out.print("Choose the Food Of your Choice \n1.Burger\n2.Pizza\n3.Pasta\n4.Biryani\n5.Chowmin\n0.Exit\nChoose :");
            int food = sc.nextInt();
            food = FoodOrder.invalidCheck(0, 5, food,sc);
            switch (food) {
                case 1:
                    System.out.print("Which burger you want to Order \n1.Beef Burger\n2.Chicken Burger\n3.Fish Burger\n4.Veggie Burger\n5.Egg Burger\nChoose:");
                    int burger = sc.nextInt();  
                    burger = FoodOrder.invalidCheck(1, 5, burger,sc);
                    System.out.print("Now Choose the Size of the Burger\n1.Junior\n2.Classic\n3.King Size\nChoose :");
                    int size = sc.nextInt();
                    size = FoodOrder.invalidCheck(1, 3, size,sc);
                    if(size == 1){
                        FoodSize = "Junior";
                    }else if(size == 2){
                        FoodSize = "Classic";
                    }else{
                        FoodSize = "King Size";
                    }
                    System.out.print("Enter the Number of Burgers you want to Order\nChoose (Max 15):");
                    FoodNum = sc.nextInt();
                    FoodNum = FoodOrder.invalidCheck(1, 15, FoodNum,sc);
                    if (burger == 1) {
                        FoodName = "Beef Burger";
                        if (size == 1) {
                            billFood = FoodNum * 450;
                        } else if (size == 2) {
                            billFood = FoodNum * 800;
                        } else {
                            billFood = FoodNum * 1200;
                        }
                    } else if (burger == 2) {
                        FoodName = "Chicken Burger";
                        if (size == 1) {
                            billFood = FoodNum * 350;
                        } else if (size == 2) {
                            billFood = FoodNum * 700;
                        } else {
                            billFood = FoodNum * 1050;
                        }
                    } else if (burger == 3) {
                        FoodName = "Fish Burger";
                        if (size == 1) {
                            billFood = FoodNum * 650;
                        } else if (size == 2) {
                            billFood = FoodNum * 1100;
                        } else {
                            billFood = FoodNum * 1550;
                        }
                    } else if (burger == 4) {
                        FoodName = "Veggie Burger";
                        if (size == 1) {
                            billFood = FoodNum * 250;
                        } else if (size == 2) {
                            billFood = FoodNum * 400;
                        } else {
                            billFood = FoodNum * 750;
                        }
                    } else {
                        FoodName = "Egg Burger";
                        if (size == 1) {
                            billFood = FoodNum * 150;
                        } else if (size == 2) {
                            billFood = FoodNum * 250;
                        } else {
                            billFood = FoodNum * 400;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Which pizza you want to Order \n1.Cheese Pizza\n2.Pepperoni Pizza\n3.BBQ Chicken Pizza\n4.Veggie Pizza\n5.Spicy Pizza\nChoose:");
                    int pizza = sc.nextInt();
                    pizza = FoodOrder.invalidCheck(1, 5, pizza,sc);
                    System.out.println("Now Choose the Size of the Pizza\n1.Small\n2.Medium\n3.Large\n4.Extra Large\nChoose :");
                    int PizzaSize = sc.nextInt();
                    PizzaSize = FoodOrder.invalidCheck(1, 4, PizzaSize,sc);
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
                    FoodNum = FoodOrder.invalidCheck(1, 10, FoodNum,sc);
                    if (pizza == 1) {
                        FoodName = "Cheese Pizza";
                        if (PizzaSize == 1) {
                            billFood = FoodNum * 350;
                        } else if (PizzaSize == 2) {
                            billFood = FoodNum * 600;
                        } else if (PizzaSize == 3) {
                            billFood = FoodNum * 900;
                        } else {
                            billFood = FoodNum * 1200;
                        }
                    } else if (pizza == 2) {
                        FoodName = "Pepperoni Pizza";
                        if (PizzaSize == 1) {
                            billFood = FoodNum * 400;
                        } else if (PizzaSize == 2) {
                            billFood = FoodNum * 650;
                        } else if (PizzaSize == 3) {
                            billFood = FoodNum * 800;
                        } else {
                            billFood = FoodNum * 1250;
                        }
                    } else if (pizza == 3) {
                        FoodName = "BBQ Chicken Pizza";
                        if (PizzaSize == 1) {
                            billFood = FoodNum * 650;
                        } else if (PizzaSize == 2) {
                            billFood = FoodNum * 900;
                        } else if (PizzaSize == 3) {
                            billFood = FoodNum * 1100;
                        } else {
                            billFood = FoodNum * 1450;
                        }
                    } else if (pizza == 4) {
                        FoodName = "Veggie Pizza";
                        if (PizzaSize == 1) {
                            billFood = FoodNum * 250;
                        } else if (PizzaSize == 2) {
                            billFood = FoodNum * 450;
                        } else if (PizzaSize == 3) {
                            billFood = FoodNum * 750;
                        } else {
                            billFood = FoodNum * 1050;
                        }
                    } else {
                        FoodName = "Spicy Pizza";
                        if (PizzaSize == 1) {
                            billFood = FoodNum * 500;
                        } else if (PizzaSize == 2) {
                            billFood = FoodNum * 750;
                        } else if (PizzaSize == 3) {
                            billFood = FoodNum * 999;
                        } else {
                            billFood = FoodNum * 1350;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Which Pasta you want to Order \n1.Spaghetti\n2.Macaroni\n3.Fusilli\nChoose:");
                    int pasta = sc.nextInt();
                    pasta = FoodOrder.invalidCheck(1, 3, pasta,sc);
                    System.out.print("Select Pasta size\n1.Small Plate\n2.Medium Plate\n3.Large Plate\nChoose :");
                    int pastaSize = sc.nextInt();
                    pastaSize = FoodOrder.invalidCheck(1, 3, pastaSize,sc);
                    if(pastaSize == 1){
                        FoodSize = "Small Plate";
                    }else if(pastaSize == 2){
                        FoodSize = "Medium Plate";
                    }else{
                        FoodSize = "Large Plate";
                    }
                    System.out.print("Enter the Number of Pastas you want to order\nChoose (Max 10): ");
                    FoodNum = sc.nextInt();
                    FoodNum = FoodOrder.invalidCheck(1, 10, FoodNum,sc);
                    if (pasta == 1) {
                        FoodName = "Spaghetti";
                        if (pastaSize == 1) {
                            billFood = FoodNum * 150;
                        } else if (pastaSize == 2) {
                            billFood = FoodNum * 250;
                        } else {
                            billFood = FoodNum * 400;
                        }
                    } else if (pasta == 2) {
                        FoodName = "Macaroni";
                        if (pastaSize == 1) {
                            billFood = FoodNum * 200;
                        } else if (pastaSize == 2) {
                            billFood = FoodNum * 350;
                        } else {
                            billFood = FoodNum * 600;
                        }
                    } else {
                        FoodName = "Fusilli";
                        if (pastaSize == 1) {
                            billFood = FoodNum * 130;
                        } else if (pastaSize == 2) {
                            billFood = FoodNum * 200;
                        } else {
                            billFood = FoodNum * 360;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Which Biryani you want to Order \n1.Simple Biryani\n2.Chicken Biryani\nChoose:");
                    int biryani = sc.nextInt();
                    biryani = FoodOrder.invalidCheck(1, 2, biryani,sc);
                    System.out.print("Select Biryani Plate Size\n1.Small Plate\n2.Medium Plate\n3.Large Plate\nChoose :");
                    int biryaniSize = sc.nextInt();
                    biryaniSize = FoodOrder.invalidCheck(1, 3, biryaniSize,sc);
                    if(biryaniSize == 1){
                        FoodSize = "Small Plate";
                    }else if(biryaniSize == 2){
                        FoodSize = "Medium Plate";
                    }else{
                        FoodSize = "Large Plate";
                    }
                    System.out.print("Enter the Number of Biryani Plates you want to order\nChoose (Max 10): ");
                    FoodNum = sc.nextInt();
                    FoodNum = FoodOrder.invalidCheck(1, 10, FoodNum,sc);
                    if (biryani == 1) {
                        FoodName = "Simple Biryani";
                        if (biryaniSize == 1) {
                            billFood = FoodNum * 200;
                        } else if (biryaniSize == 2) {
                            billFood = FoodNum * 350;
                        } else {
                            billFood = FoodNum * 600;
                        }
                    } else {
                        FoodName = "Chicken Biryani";
                        if (biryaniSize == 1) {
                            billFood = FoodNum * 300;
                        } else if (biryaniSize == 2) {
                            billFood = FoodNum * 450;
                        } else {
                            billFood = FoodNum * 750;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Which Chowmin you want to Order \n1.Chicken Chowmein\n2.Beef Chowmein\n3.Vegetable Chowmein\nChoose:");
                    int chowmin = sc.nextInt();
                    chowmin = FoodOrder.invalidCheck(1, 3, chowmin,sc);
                    System.out.print("Select Chowmin Plate Size\n1.Small Plate\n2.Medium Plate\n3.Large Plate\nChoose :");
                    int chowminSize = sc.nextInt();
                    chowminSize = FoodOrder.invalidCheck(1, 3, chowminSize,sc);
                    if(chowminSize == 1){
                        FoodSize = "Small Plate";
                    }else if(chowminSize == 2){
                        FoodSize = "Medium Plate";
                    }else{
                        FoodSize = "Large Plate";
                    }
                    System.out.print("Enter the Number of Chowmin Plates you want to order\nChoose (Max 10): ");
                    FoodNum = sc.nextInt();
                    FoodNum = FoodOrder.invalidCheck(1, 10, FoodNum,sc);
                    if (chowmin == 1) {
                        FoodName = "Chicken Chowmin";
                        if (chowminSize == 1) {
                            billFood = FoodNum * 350;
                        } else if (chowminSize == 2) {
                            billFood = FoodNum * 490;
                        } else {
                            billFood = FoodNum * 660;
                        }
                    } else if (chowmin == 2) {
                        FoodName = "Beef Chowmin";
                        if (chowminSize == 1) {
                            billFood = FoodNum * 400;
                        } else if (chowminSize == 2) {
                            billFood = FoodNum * 570;
                        } else {
                            billFood = FoodNum * 790;
                        }
                    } else {
                        FoodName = "Vegetable Chowmin";
                        if (chowminSize == 1) {
                            billFood = FoodNum * 200;
                        } else if (chowminSize == 2) {
                            billFood = FoodNum * 320;
                        } else {
                            billFood = FoodNum * 410;
                        }
                    }
                    break;
                default:
                    System.out.println("Come Again WhenEver you Like!");
                    break;
            }
            // combine bills
            bill = billDrink + billFood;
        }

            String foodType;
            if (FoodType == 1) {
                foodType = "Drink";
            } else if (FoodType == 2) {
                foodType = "Food";
            } else {
                foodType = "Drink & Food both";
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
                DeliveryType = FoodOrder.invalidCheck(1, 2, DeliveryType,sc);
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