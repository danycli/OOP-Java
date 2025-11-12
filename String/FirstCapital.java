package String;

import java.util.Scanner;

public class FirstCapital {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == ' '){
                s = s.toUpperCase(s.charAt(i+1));
            }
        }
    }
}
