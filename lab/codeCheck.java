package lab;
public class codeCheck {
    public static void main(String [] args){
    //     int r = 337;
        
    //     int d1 = r%10;
    //     int d2 = (r/10)%10;
    //     int d3 = (r/100)%10;

    //     if(d1 == d2 && d1 == d3){
    //         System.out.println("Yes");
    //     }else{
    //         System.out.println("No");
    //     }This one is perfect But had to do it using loop
        
        int t = 333;
        int lastDigit = t%10;
        boolean isame = false;

        while(t > 0){
            int digit = t%10;
            if(digit != lastDigit){
                isame = false;
                break;
            }else{
                isame = true;
            }
            t = t/10;
        }
        if(isame == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
