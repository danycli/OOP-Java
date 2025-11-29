package TicTacToe;

import java.util.Scanner;

public class MainClass {
    public static void main(String [] args){
        System.out.println(".....Welcome to Tic Tac Toe.....");
        Scanner sc = new Scanner(System.in);
        char symb = '1';
        int r=0,c=0;
        int player = 1;
        boolean gameOver = false;
        while(gameOver != true ){
            Table.table(r,c,symb);
            r = 0; c = 0;
            System.out.print("Player "+player+" turn : ");
            symb = sc.nextLine().charAt(0);
            int num = symb - '0';
            while(num < 1 || num > 9){
                System.out.print("Invalid move!\nTry again : ");
                symb = sc.nextLine().charAt(0);
                num = symb - '0';
            }
            if(num >= 3){
                c = num - 1;
            }else if(num >= 6){
                r = 1;
                c = num - 1;
            }else{
                r = 2;
                c = num - 1;
            }
            if(player == 1){
                symb = 'X';
            }else{
                symb = 'O';
            }
            player = (player == 1) ? 2 : 1 ;
        }
    }
}
