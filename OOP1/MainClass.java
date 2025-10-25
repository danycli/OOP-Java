package OOP1;

import java.util.Scanner;

public class MainClass {
    public static void main(String args[]){
        roadproject r1 = new roadproject();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of your Project :");
        String name = sc.nextLine();
        r1.setRoadProjectName(name);

        System.out.print("Enter the ID of your Project :");
        int id = sc.nextInt();
        r1.setRoadProjectID(id);

        System.out.print("Enter the Length of the Road (km): ");
        int km = sc.nextInt();
        r1.setRoadLenghtInKiloMeters(km);

        r1.calculateRoadCost();
        r1.calculateNumberOfTollPlazas();
        r1.calculateProjectDurationInMonths();
        r1.calculateRoadProjectTax();

        r1.displayInfo();
    // Create a second roadproject object r2 and repeat the same input/processing
    roadproject r2 = new roadproject();

    // consume leftover newline from previous nextInt() calls before reading a new line
    sc.nextLine();

    System.out.print("\n--- Enter details for Project 2 ---\n");
    System.out.print("Enter the name of your Project :");
    String name2 = sc.nextLine();
    r2.setRoadProjectName(name2);

    System.out.print("Enter the ID of your Project :");
    int id2 = sc.nextInt();
    r2.setRoadProjectID(id2);

    System.out.print("Enter the Length of the Road (km): ");
    int km2 = sc.nextInt();
    r2.setRoadLenghtInKiloMeters(km2);

    r2.calculateRoadCost();
    r2.calculateNumberOfTollPlazas();
    r2.calculateProjectDurationInMonths();
    r2.calculateRoadProjectTax();

    r2.displayInfo();

    double result = roadproject.sum(r1, r2);
        if(result != 0){
            System.out.println("The sum of road project is "+result);
        }else{
            System.out.println("The Ids dont matched");
        }
    sc.close();
    }
}
