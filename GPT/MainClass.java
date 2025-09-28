package GPT;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        student[] s = new student[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            s[i] = new student();

            System.out.println("\nFor " + (i + 1) + " Student");
            System.out.print("Enter your ID :");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter your name :");
            String name = sc.nextLine();

            System.out.print("Enter marks of First Subject :");
            double marks1 = sc.nextInt();
            while (marks1 > 100) {
                System.out.print("Total Marks are 100. How did you get more than 100 ?\nTry Again :");
                marks1 = sc.nextInt();
            }

            System.out.print("Enter marks for second Subject :");
            double marks2 = sc.nextInt();
            while (marks2 > 100) {
                System.out.print("Total Marks are 100. How did you get more than 100 ?\nTry Again :");
                marks2 = sc.nextInt();
            }

            s[i].setStudentID(id);
            s[i].setstudentName(name);
            s[i].setMarks1(marks1);
            s[i].setMarks2(marks2);
            s[i].calculatePercentage();
            s[i].assignGrade();
        }
        int pass = 0, fail = 0;
        for (int i = 0; i < 3; i++) {
            int prime = 1;
            System.out.println("------------------------");
            s[i].diplayinfo();
            System.out.printf("Square Root of Percentage is %.2f\n", Math.sqrt(s[i].getPercentage()));
            System.out.println("Exact Percentage = " + s[i].getPercentage());
            System.out.println("Round Off Percentage = " + (int) s[i].getPercentage());
            if (s[i].getStudentId() < 100) {
                double ran = Math.random() * (999.0 - 100.0) + 100.0;
                System.out.println("New Id = " + (int) ran);
            }
            int number = (int) s[i].getPercentage();
            if (number % 2 == 0) {
                System.out.println("Even Percentage");
            } else {
                System.out.println("Odd Percentage");
                for (int j = 2; j * j <= number; j++) {
                    if (number % j == 0) {
                        prime = 0;
                        break;
                    }
                }
            }
            if (number % 2 != 0 && prime == 1) {
                System.out.println((int) s[i].getPercentage() + " is a Prime number");
            } else {
                System.out.println((int) s[i].getPercentage() + " is not a Prime number");
            }
            if (s[i].getGrade() == 'F') {
                fail++;
            } else {
                pass++;
            }
        }
        System.out.println();
        System.out.println("Number of Pass Students = " + pass + "\nNumber of Fail Students = " + fail);
        System.out.println("------------------------");

        int i = 0;
        double max1 = Math.max(s[0].getPercentage(), s[1].getPercentage());
        double max2 = Math.max(max1, s[2].getPercentage());
        if (max2 == s[0].getPercentage()) {
            i = 1;
        } else if (max2 == s[1].getPercentage()) {
            i = 2;
        } else {
            i = 3;
        }
        System.out.println("The topper is Student " + i + " with the total percentage of " + max2);

        System.out.printf("Average Percentage of all = %.2f",
                (s[0].getPercentage() + s[1].getPercentage() + s[2].getPercentage() / 3));
        System.out.println();
        sc.close();
    }
}