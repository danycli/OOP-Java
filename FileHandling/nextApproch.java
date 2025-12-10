package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class nextApproch{
    public static void main(String [] args){    
        int permission = JOptionPane.showConfirmDialog(null, "To enter you team Info plese continue");
        if(permission == 0){
            String teamName = JOptionPane.showInputDialog(null, "Enter the name of your team");
            try(FileWriter team = new FileWriter(teamName+".txt")){
                int numOfPlayers = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the total number of players you want to add"));
                for(int i = 1; i <= numOfPlayers; i++){
                    String playerName = JOptionPane.showInputDialog(null,"Enter the name of the "+i+" Player");
                    team.append(i+"."+playerName+"\n");
                }
            }
            catch(IOException e){
                System.out.println("There is some error While opening the file");
            }
        }
    }
}