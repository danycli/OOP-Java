package Array;

import java.util.Arrays;

public class sorting {
    public static void main(String [] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] > nums[j]){ // > for ascending and < for descending
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }
        for(int i = 0; i < nums.length; i ++){
            for(int k = 0; k < nums.length; k++){
                if(i != k && nums[i] < nums[k]){
                    nums[i] = (nums[i] + nums[k]) - (nums[k] = nums[i]);
                }
            }
        }
        // int a = 10;
        // int b = 14;
        // a = (a+b) - (b = a);
        // System.out.println(a+" "+b);
        System.out.println(Arrays.toString(nums));
        
    }
}
