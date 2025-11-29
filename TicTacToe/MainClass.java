package TicTacToe;

import java.util.Scanner;

public class MainClass {
    public static void main(String [] args){
        System.out.println(".....Welcome to Tic Tac Toe.....");
        Scanner sc = new Scanner(System.in);
        int countTurns = 0;
        Table.table();
        char symb = 'X';
        char turn;
        int player = 1;
        boolean gameOver = false;
        while(gameOver != true ){
            countTurns++;
            System.out.print("Player "+player+" turn : ");
            turn = sc.nextLine().charAt(0);
            int num = turn - '0';
            while(num < 1 || num > 9){
                System.out.print("Invalid move!\nTry again : ");
                symb = sc.nextLine().charAt(0);
                num = turn - '0';
            }

            boolean check = Table.placeMove(num,symb);
            while(check == false){
                check = Table.placeMove(num,symb);
                System.out.println("Invalid Move!\nTry Again....");
                symb = sc.nextLine().charAt(0);
                num = symb - '0';
            }
            Table.table();
            boolean won = Table.gameWon();
            if(won == true){
                String wonMessage = (symb == 'X') ? "Player 1 Won" : "Player 2 Won"; 
                System.out.println(wonMessage);
                break;
            }
            if(countTurns == 9 && won == false){
                System.out.println("Game draw!");
                break;
            }
            symb = (symb == 'X') ? '0' : 'X';
            player = (player == 1) ? 2 : 1 ;
        }
        sc.close();
    }
}