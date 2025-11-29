package String;

public class CheckPalindrome {
    public static void main(String [] args){
        String str = "A man, a plan, a canal: Panama";
        boolean b = true;
        str = str.replace(" ", "");
        str = str.replaceAll("[\\p{Punct}]", "").toLowerCase();
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
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
