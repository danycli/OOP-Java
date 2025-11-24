package Enum;

import java.util.Scanner;

public class Enum {
    public static void main(String [] main){
        System.out.print("Enter a size of T-Shirt you want : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        
        try {
            Size.size si = Size.size.valueOf(s);
            System.out.println("You pick the "+si+" size T-Shirt");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Invalid Size!");
        }
        sc.close();
    }
}
