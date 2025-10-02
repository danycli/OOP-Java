package Helper;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter three values :");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();

        double result= Formula.Formula1_AMinusBWholeSquare(a,b);
        System.out.println("Result of Formula1_AMinusBWholeSquare ="+result);

        double result1= Formula.Formula2_APlusBWholeSquare(a,b);
        System.out.println("Result of Formula2_APlusBWholeSquare ="+result1);

        double result2= Formula.Formula3_aSquare_Minus_bSquare(a,b);
        System.out.println("Result of Formula3_aSquare_Minus_bSquare ="+result2);

        double result3= Formula.Formula4(a,b);
        System.out.println("Result of Formula4 ="+result3);

        double result4= Formula.Quadratic_1_AdditionValue(a,b,c);
        System.out.println("Result of Quadratic_1_AdditionValue ="+result4);
        double result5= Formula.Quadratic_2_Subtraction(a,b,c);
        System.out.println("Result of Quadratic_2_Subtraction ="+result5);

	System.out.print("Enter three numbers :");
	int X,Y,Z;
	X=sc.nextInt();
	Y=sc.nextInt();
	Z=sc.nextInt();
    
	double result6 = Formula.Formula1(X,Y);
    System.out.println("Result of Formula1 ="+result6);

    double result7 = Formula.Formula2(X,Y);
    System.out.println("Result of Formula2 ="+result7);

    double result8 = Formula.Formula3(X,Y,Z);
    System.out.println("Result of Formula3 ="+result8);

    sc.close();


    }
}