package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Test {
    public static void main(String [] args){
        try(FileWriter writer = new FileWriter("Exam.txt")){
            String team = JOptionPane.showInputDialog(null,"Enter a team member name :");
            writer.write(team);
            System.out.println("Done");
        }
        catch(IOException e){
            System.out.println("There is some problem while opening the file");
        }
    }
}
