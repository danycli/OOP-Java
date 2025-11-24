package Regret;

public class MainClass {
    public static void main(String [] args){//When we make the reference 
        Faculty f1 = new Faculty(33, "Saad", "Computer Science", 78);
        f1.calculateSalary();
        f1.calculateGpfund();
        // f1.setDepartment("BBA");
        f1.calculateTax();
        f1.display();

        System.out.println("\n\n");

        Staff s1 = new Staff(45, "Haroon Khan", "Software Engineering", 67);
        s1.calculateSalary();
        s1.calculateGpfund();
        s1.calculateTax();
        s1.calculateBonus();
        s1.display();
    }
    
}