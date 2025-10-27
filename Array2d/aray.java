package Array2d;

public class aray {
    private int[][] a1;

    void setName(int[][] b,int r,int c){
        a1 = new int[r][c];
        this.a1 = b.clone();
        for(int i = 0; i < r; i++){
            a1[i] = b[i].clone();
        }   
    }
    int[][] getMarks(){
        int[][] copy = new int[a1.length][];
        for(int i = 0; i < a1.length; i++){
            copy[i] = a1[i];
        }
        return copy;
    }
}
