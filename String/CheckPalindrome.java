package String;

public class CheckPalindrome {
    public static void main(String [] args){
        String abc = "A man a plan a canal Panama";
        boolean b = true;
        abc = abc.replace(" ", "").toLowerCase();
        for(int i = 0; i < abc.length() / 2; i++){
            if(abc.charAt(i) != abc.charAt(abc.length() - 1 - i)){
                b = false;
                break;
            }
        }
        if(b == false){
            System.out.println("The String is not a palindrome");
        }else{
            System.out.println("The stirng is palindrome");
        }
    }
}
