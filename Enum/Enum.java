package Enum;

import java.util.Scanner;

public class Enum {
    public static void main(String [] main){
        System.out.print("Enter a size of T-Shirt you want : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        
        try {
            Size si = Size.valueOf(s);
        }
    }
}
