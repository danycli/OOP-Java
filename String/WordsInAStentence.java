package String;
import java.util.Scanner;
public class WordsInAStentence {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sp = s.split(" ");
        System.out.println("Total words count = "+sp.length);
        sc.close();
    }
}
