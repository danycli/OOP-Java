package TicTacToe;

public class Table {
    private static char[][] board = new char[3][3]; 
    private static char num = '1';
    
    public static void table(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = num;
                num++;
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(
                "  " + board[i][0] + "  |  " + board[i][1] + "  |  " + board[i][2] + "  ");

            if (i < 2)
                System.out.println("-----|-----|-----");
        }
    }
}
