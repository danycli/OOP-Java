package addingBinaryNums;
import java.util.Scanner;
public class MainClass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary number :");
        int first = sc.nextInt();
        boolean chk = binary.ChkBinary(first);
        while(chk == false){
            System.out.print("Invalid Number!\nTry again :");
            first = sc.nextInt();
            chk = binary.ChkBinary(first);
        }

        System.out.print("Enter second binary number :");
        int second = sc.nextInt();
        boolean chk2 = binary.ChkBinary(second);
        while(chk2 == false){
            System.out.print("Invalid Number!\nTry again :");
            second = sc.nextInt();
            chk2 = binary.ChkBinary(second);
        }
        
        double num1 = binary.binToDec(first);
        double num2 = binary.binToDec(second);
        double sum = num1 + num2;

        binary.DecToBin((int)sum,first,second);
        sc.close();
    }
}