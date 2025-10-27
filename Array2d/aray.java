package Array2d;

import java.util.Arrays;

public class aray {
    private int[][] a1;
    private int[][] a2;
    private int[][] sum;
    private int[][] mult;

    void seta(int[][] b,int r,int c){
        a1 = new int[r][c];
        this.a1 = b.clone();
        for(int i = 0; i < r; i++){
            a1[i] = b[i].clone();
        }   
    }
    int[][] getb(){
        int[][] copy = new int[a1.length][];
        for(int i = 0; i < a1.length; i++){
            copy[i] = a1[i];
        }
        return copy;
    }
    void setb(int[][] b,int r,int c){
        a2 = new int[r][c];
        this.a2 = b.clone();
        for(int i = 0; i < r; i++){
            a2[i] = b[i].clone();
        }   
    }
    int[][] getbs(){
        int[][] copy = new int[a2.length][];
        for(int i = 0; i < a2.length; i++){
            copy[i] = a1[i];
        }
        return copy;
    }

    int[][] getbSum(){
        int[][] copy = new int[sum.length][];
        for(int i = 0; i < a2.length; i++){
            copy[i] = sum[i];
        }
        return copy;
    }
    int[][] getMult(){
        int[][] copy = new int[mult.length][];
        for(int i = 0; i < copy.length; i++){
            copy[i] = mult[i];
        }
        return copy;
    }

    void calSum(int r, int c){
        sum = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                sum[i][j] = a1[i][j]+ a2[i][j];
            }
        }
    }

    void calMult(int r){
        mult = new int[r][r];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < r; j++){
                for(int k = 0; k < r; k++){
                    mult[i][j] += a1[k][i] * a2[j][k]; 
                }
            }
        }
    }

    void display(){
        System.out.println("Sum = "+Arrays.deepToString(sum));
        System.out.println("Multiplication = "+Arrays.deepToString(mult));
    }
}
