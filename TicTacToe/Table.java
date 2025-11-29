package TicTacToe;

public class Table {
    private static char[][] board = new char[3][3]; 
    private static char num = '1';
    
    static {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                    board[i][j] = num++;
            }
        }
    }
    public static void table(){
        for (int i = 0; i < 3; i++) {
            System.out.println("  " + board[i][0] + "  |  " + board[i][1] + "  |  " + board[i][2] + "  ");
                if (i < 2)
                System.out.println("-----|-----|-----");
        }
    }
    public static boolean placeMove(int num, char symb){
        int r = (num-1) / 3;
        int c = (num-1) % 3;

        if(board[r][c] == 'X' || board[r][c] == 'O'){
            return false;
        }else{
            board[r][c] = symb;
            return true;
        }
    }
    public static boolean gameWon(){
        boolean won = false;
        //Rows
        for(int i = 0; i < 3; i++){
            if(board[i][0] == board[i][1] && board[i][0] == board[i][2]){
                won = true;
                break;
            }
        }
        //Coloumns
        for(int i = 0; i < 3; i++){
            if(board[0][i] == board[1][i] && board[0][i] == board[2][i]){
                won = true;
                break;
            }
        }
        //Diognals
            if(board[0][0] == board[1][1] && board[0][0] == board[2][2] || board[1][1] == board[0][2] && board[0][2] == board[2][0]){
                won = true;
            }
        return won;
    }
}
