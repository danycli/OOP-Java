package String;
import java.util.Scanner;
public class ReplacingVowels {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String[] vowels = {"a","e","i","o","u"};
        String s = sc.nextLine();
        String[] sp = s.toLowerCase().split("");
        for(int i = 0; i < sp.length ; i++){
            for(int j = 0; j < vowels.length; j++){
                if(sp[i].equals(vowels[j])){
                    sp[i] = "*";
                }
            }
        }
        for(int i = 0; i < sp.length ; i++){
            System.out.print(sp[i]);
        }
        sc.close();
    }
}
