package Cricket;

public class Match {
    private int data[][]; 

    Match(int[][] DATA){
        data = new int[20][6];
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 6; j++){
                data[i][j] = DATA[i][j];
            }
        }
    }
    int[][] getData(){
        return data;
    }
    void displayInfo(){
        for(int i = 0; i < 20; i++){
            System.out.print("Over "+(i+1)+" =[ ");
            for(int j = 0; j < 6; j++){
                System.out.print(data[i][j]);
                if(j<5){
                    System.out.print(", ");
                }
            }
            System.out.println(" ]");
        }
    }
}
