package String;
import java.util.Scanner;
public class counting {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name :");
        String name = sc.nextLine();
        String[] sp = name.replace(" ","").toLowerCase().split("");

        int count = 0;

        String[] vowels = {"a","e","i","o","u"};
        for(int i = 0; i < name.length(); i++){
            for(int j = 0; j < vowels.length; j++){
                if(sp[i].equals(vowels[j])){
                    count++;
                    break;
                }
            }
        }
        System.out.println("Number of Vowels = "+count);
        System.out.println("The count of consonents is : "+(name.length()-count));
        sc.close();
    }
}
