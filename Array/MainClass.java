package Array;
import java.util.Scanner;
public class MainClass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Number of the Students You want to enroll :");
        int num = sc.nextInt();
        student[] s = new student[num];

        sc.nextLine();
        for(int i = 0; i < s.length; i++){
            System.out.print("\nEnter the Name of the Student : ");
            String name = sc.nextLine();
            int number[] = new int[2];
            System.out.print("Enter Personal Phone Number :");
            number[0] = sc.nextInt();
            System.out.print("Enter Parent/Guardian Phone Number :");
            number[1] = sc.nextInt();
            String address[] = new String[2];
            sc.nextLine();
            System.out.print("Enter Your permanent address :");
            address[0] = sc.nextLine();
            System.out.print("Enter Your Current address :");
            address[1] = sc.nextLine();
            s[i] = new student(name,(i+1),number,address);
        }
        for(int i = 0; i < s.length; i++){
            System.out.println();
            System.out.println("Student "+(i+1)+" Name = "+s[i].getName());
            System.out.println("Student "+(i+1)+" ID = "+s[i].getID());
            System.out.println("Student "+(i+1)+" Mobile Numbers");
            int[] mob = s[i].getMobile();
            System.out.println("Personal Mobile Number = "+mob[0]);
            System.out.println("Parents/Guardian Mobile Number = "+mob[1]);
            System.out.println("Student "+(i+1)+" addresses");
            String[] ad = s[i].getAddress();
            System.out.println("Permanent Address = "+ad[0]);
            System.out.println("Current Address ="+ad[1]);
        }
        sc.close();
    }
    
}
