package Cricket;

public class Match {
    private int data[][]; 

    Match(int DATA[][]){
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 5; j++){
                data[i][j] = DATA[i][j];
            }
        }
    }
    int[][] getData(){
        return data;
    }
    void displayInfo(){
        
    }
}
