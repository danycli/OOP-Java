package English;

import java.util.Scanner;

public class MainClass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence (For Constructor) :");
        String str = sc.nextLine();
        EnglishSentence eng1 = new EnglishSentence(str);
        
        // System.out.print("Enter a sentence (For Setter) :");
        // String str2 = sc.nextLine();
        // eng1.setSentence(str2);

        System.out.print("Enter a word (For concatinating) :");
        String str3 = sc.nextLine();
        eng1.concatSentence(str3);

        System.out.print("Enter two characters :");
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        eng1.displaySubStringBetweenTwoPassedChars(a,b);

        String newSent = eng1.createNewString();
        System.out.println(newSent);

        boolean chk = eng1.checkSentencceIsPalindromeOrNot();
        System.out.println(chk);
        
        int count = eng1.countTheWordsInTheSenetence();
        System.out.println(count);

        sc.close();
    }
}
