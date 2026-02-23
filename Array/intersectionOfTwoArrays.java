package Array;

import java.util.Arrays;

public class intersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int in = 0;

        for(int i = 0; i < nums1.length; i++){
            for(int k = 0; k < nums2.length; k++){
                if(nums1[i] == nums2[k]){
                    in++;
                    break;
                }
            }
        }
        int[] num = new int[in];
        for(int i = 0; i < nums1.length; i++){
            in--;
            if(in == -1){
                    break;
                }
            for(int k = 0; k < nums2.length; k++){
                if(nums1[i] == nums2[k]){
                    num[in] = nums1[i];
                    break;
                }
            }
        }
        System.out.println("Nums Found"+in+"\nArray = "+Arrays.toString(num));
    }
}
