package String;

import java.util.Scanner;

public class FirstCapital {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        for(int i = 0; i < split.length; i++){
            char rep = split[i].charAt(0);
            String no = ("" + rep).toUpperCase();
            split[i] = split[i].replace(split[i].charAt(0), no.charAt(0));
        }
        for(String sp : split){
            System.out.print(sp + " ");
        }
        sc.close();
    }
}
