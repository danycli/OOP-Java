package Part1;
import java.util.Scanner;
public class MainClass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Inputs for First Triangle");
        System.out.print("Enter the first Side of the triangle :");
        float s1 = sc.nextFloat();
        System.out.print("Enter the second Side of the triangle :");
        float s2 = sc.nextFloat();
        System.out.print("Enter the third Side of the triangle :");
        float s3 = sc.nextFloat();
        System.out.println();

        Triangle t1 = new Triangle(s1,s2,s3);
        t1.CalArea();
        t1.CalPerimeter();
        t1.TypeOfTriangle();
        System.out.println("\nResults for First Triangle");
        t1.displayInfo();

        System.out.println("\nInputs for Second Triangle");
        System.out.print("Enter the first Side of the triangle :");
        float L1 = sc.nextFloat();
        System.out.print("Enter the second Side of the triangle :");
        float L2 = sc.nextFloat();
        System.out.print("Enter the third Side of the triangle :");
        float L3 = sc.nextFloat();

        Triangle t2 = new Triangle(L1,L2,L3);
        t2.CalArea();
        t2.CalPerimeter();
        t2.TypeOfTriangle();
        System.out.println("Results for Second Triangle");
        t2.displayInfo();

        Triangle t3 = new Triangle(t2);
        System.out.println("\nResults for Third Triangle");
        t3.displayInfo();

        // Triangles Comparison
        boolean comp = Triangle.compare(t1, t2, t3);
        System.out.println("\nThe triangles are same or not.. = "+comp);

        sc.close();

    }
}
