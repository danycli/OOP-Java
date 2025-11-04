package Array;

import java.util.Arrays;

public class sorting {
    public static void main(String [] args){
        int[] a = {3,2,5,1,4};
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){ // > for ascending and < for descending
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        
    }
}
