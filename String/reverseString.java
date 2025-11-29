package String;

public class reverseString {
    public static void main(String [] args){
        char[] s = {'h','e','l','l','o'};
        char[] c = new char[s.length];
        for(int i = 0 ; i < s.length ; i++){
            c[i] = s[(s.length-1)-i];
        }
        s = c;
        for(int i = 0; i < s.length; i++){
            System.out.print(s[i]);
        }
    }
}
