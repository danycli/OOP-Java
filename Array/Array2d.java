package Array;

import java.util.Arrays;

public class Array2d{
    public  static void main(String [] args){
        int [][] nums = {{2,3,4},{2,1,3}};
        int [][] mult1 = {{6,8,7},{3,6,3}};
        int [][] mult2 = {{2,1,5},{6,1,3},{2,1,3}};
        int [][] mult3 = new int[2][3];
        int [][] num2 = new int[2][3];
        System.out.println(Arrays.deepToString(nums));
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(nums[j][i]+" ");//For Transpose
            }
            System.out.println();
        }

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                num2[i][j] += nums[i][j];
            }
        }
        System.out.println(Arrays.deepToString(num2));
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 2; k++){
                        mult3[i][j] += mult1[i][k]*mult2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(mult3));
    }
}