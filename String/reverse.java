package String;
import java.util.Scanner;
public class reverse {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.print("Reverse Sentence = ");
        for(int i = (sentence.length()-1); i >= 0; i--){
            System.out.print(sentence.charAt(i));
        }
        sc.close();
    }
}
