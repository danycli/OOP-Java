package String;
public class LeetCode {
    public static void main(String [] args){
        String s = "My name  is  Danial  ";

        String[] sp = s.split("");
        int count = 0;
        for(int i = sp.length-1; i >= 0; i--){
            if(sp[i].equals(" ") && count != 0){
                break;
            }else if(!(sp[i].equals(" "))){
                count++;
            }
        }
        System.out.println(count);
    }
}