package TwoNums;

public class MainClass {
    public static void main(String [] args){
        int n = 899977;

        int prev = -1;
        int count = 1;
        int maxDig = -1;

        while(n > 0){
            int digit = n%10;
            n/=10;

            if(digit == prev){
                count ++;
            }else{
                if(count == 2){
                    if(prev > maxDig){
                        maxDig = prev;
                    }
                }
                count = 1;
            }
            prev = digit;
        }
        if(count == 2 && prev > maxDig){
            maxDig = prev;
        }
        if(maxDig != -1){
            System.out.println("Max digit appearing twice is = "+maxDig);
        }else{
            System.out.println("There is not any digit twice appearing side by side");
        }
    }
}
