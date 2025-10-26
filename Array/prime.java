package Array;
import java.util.Scanner;
public class prime {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int prime = 1;
        int x = sc.nextInt();

        if(x%2 == 0 || x < 1){
                prime = 0;
            }
        if(x == 1){
            prime = 1;
        }
            for(int i = 2; i*i<=x; i+=2){
                if(x%i == 0){
                    prime = 0;
                    break;
                }
            }
        if(prime == 1){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
        sc.close();
}
}
