package lab;
import java.util.Scanner;
public class MainClass{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        square sq1 = new square(47);
        square sq2 = new square(333);
        sq1.calculateArea();
        sq1.calculatePerimeter();
        sq2.calculateArea();
        sq2.calculatePerimeter();

        square sq3 = new square(sq2);
        boolean res = sq1.equalSquares(sq2,sq3);
        System.out.println("Equality Check ="+res);
        float average = square.averageLength(sq1, sq2, sq3);
        System.out.println("Average Length ="+average);

        System.out.println();
        sq1.displayInfo();
        System.out.println();
        sq2.displayInfo();
        System.out.println();
        sq3.displayInfo();

        System.out.println("Decimal area for object 1 = "+sq1.getArea());
        System.out.println("The Non-Decimal area for object 1 is = "+(int)sq1.getArea());

        int count = 0;
        int var = sq2.getSideLength();
        while(var != 0){
            int red = var/10;
            var = red;
            count++;
        }
        System.out.println("Count ="+count);
        int check =0;
        int check2 =0;
        int check3=0;
        if(count == 3){
            int same = sq1.getSideLength();
            for(int i = 1; i<=3; i++){
                int reduce = same%10;
                same = same/10;
                if(i == 1){
                    check = reduce;
                }
                if(i == 2){
                    check2 = reduce;
                }
                if(i == 3){
                    check3 = reduce;
                }
                while(i == 3){
                    if(check == check2 && check == check3){
                    System.out.println("Yes");
                    break;
                }
                else{
                    System.out.println("No");
                    break;
                }
                }
            }
            }

        int great =0;
        int low = 0;
        for(int i = 0; i<=5; i++){
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