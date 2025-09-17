package p6;

import java.util.Scanner;

public class MainClass {
    public static void main(String args[]) {
        book b1 = new book();
        Scanner c = new Scanner(System.in);
        System.out.print("Enter the Title of the book :");
        String name = c.nextLine();
        System.out.print("Enter the name of the Author :");
        String author = c.nextLine();
        System.out.print("Enter the Price of the book :");
        double price = c.nextInt();
        System.out.print("Enter the Number of the pages of the book :");
        int page = c.nextInt();
        b1.setTitle(name);
        b1.setAuthor(author);
        b1.setPrice(price);
        b1.setNoOfPage(page);
        b1.calculateDiscount();

        System.out.println();
        b1.displayInfo();

        c.close();
    }
}