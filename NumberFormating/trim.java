package NumberFormating;

import java.util.Scanner;

public class trim {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        System.out.println(name);
        sc.close();
    }    
}
