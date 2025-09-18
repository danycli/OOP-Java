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

        sc.close();

    }
}
