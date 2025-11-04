package String;
import java.util.Scanner;
public class Methods {
    public static void main(String [] args){
        String address = "House no 4G 70, Street no 7";
        int i = address.indexOf("House");
        int x = address.indexOf("Street");

        if(i < x){
            System.out.println("The sequence is right");
        }else{
            System.out.println("The sequence is wrong");
        }

    String game = "Red Dead Redemption";
    if(game.charAt(0) == game.charAt(game.length()/2)){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }

    System.out.print("Enter a Character :");
    Scanner sc = new Scanner(System.in);
    String y = sc.nextLine();
    int reasult = game.indexOf(y);
    System.out.println(reasult);

    System.out.println(game.toLowerCase());
    System.out.println(game.toUpperCase());

    boolean b = game.equalsIgnoreCase("Red dead Redemption");
    System.out.println(b);

    System.out.println(game.substring(3, 15));

    String[] split = game.split(" ");
    for(int j = 0; j < split.length; j++){
        System.out.println(split[j]);
    }

    sc.close();
    }
}
