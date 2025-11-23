package TicTacToe;

import java.util.Scanner;

public class MainClass {
    public static void main(String [] args){
        System.out.println(".....Welcome to Tic Tac Toe.....");
        Scanner sc = new Scanner(System.in);
        int player = 1;
        boolean gameOver = false;
        while(gameOver != true ){
            Table.table();
            System.out.print("Player "+player+" turn : ");
            int num = sc.nextInt();
            while(num < 0 || num > 9){
                System.out.print("Invalid move!\nTry again : ");
                num = sc.nextInt();
            }
            player = (player == 1) ? 2 : 1 ;
        }
    }
}
