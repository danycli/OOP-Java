package NumberFormating;
import java.util.Scanner;
import java.text.NumberFormat;

public class number {
    public static void main(String [] args){
        NumberFormat num = NumberFormat.getCurrencyInstance();
        String res = num.format(333234223);
        System.out.println(res);
        // Another method to write it 
        Scanner sc = new Scanner(System.in);
        double numb = sc.nextDouble();
        String percent = NumberFormat.getPercentInstance().format(numb/100.00);
        System.out.println(percent);
        sc.close();
    }
}
