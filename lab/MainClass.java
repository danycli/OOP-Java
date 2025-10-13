package lab;
import java.util.Scanner;
public class MainClass{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        square sq1 = new square(47);
        square sq2 = new square(555);
        sq1.calculateArea();
        sq1.calculatePerimeter();
        sq2.calculateArea();
        sq2.calculatePerimeter();

        square sq3 = new square(sq2);
        boolean res = sq1.equalSquares(sq2,sq3);
        System.out.println("Equality Check = "+res);
        float average = square.averageLength(sq1, sq2, sq3);
        System.out.println("Average Length = "+average);

        System.out.println();
        sq1.displayInfo();
        System.out.println();
        sq2.displayInfo();
        System.out.println();
        sq3.displayInfo();
        System.out.println();

        System.out.println("Decimal area for object 1 = "+sq1.getArea());
        System.out.println("The Non-Decimal area for object 1 is = "+(int)sq1.getArea()+"\n");

        int count = 0;
        int var = sq2.getSideLength();
        while(var != 0){
            int red = var/10;
            var = red;
            count++;
        }
        int del = sq2.getSideLength();
        System.out.println("Count = "+count);
        if(count == 3){
            int lastDigit = del%10;
            boolean isSame = false;
            while(del > 0){
                int num = del%10;
                if(num != lastDigit){
                    isSame = false;
                    break;
                }else{
                    isSame = true;
                }
                del = del/10;
            }
            if(isSame == true){
                System.out.println("Yes\n");
            }else{
                System.out.println("No\n");
            }
        }

        int great =0;
        int low = 0;
        for(int i = 1; i<=5; i++){
            System.out.print("Enter the number :");
            int num = sc.nextInt();
            if(num == sq1.getSideLength()){
                System.out.println("The number you entered matches the Side Length of the first Object");
                break;
        }
            if(num>sq1.getSideLength()){
                great++;
            }else{
                low++;
            }
    }
    System.out.println("The numbers greater then than "+sq1.getSideLength()+" were "+great);
    System.out.println("The numbers Lower then than "+sq1.getSideLength()+" were "+low);

    sc.close();
        }
    }