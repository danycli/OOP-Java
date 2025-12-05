package GUI.InputOutput;
import javax.swing.JOptionPane;
public class MainClass {
    public static void main(String [] args){
        String name = JOptionPane.showInputDialog("Enter your name : ");
        JOptionPane.showMessageDialog(null,"Your name is "+name);

        int dateOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Enter your Dat Of Birth :"));
        JOptionPane.showMessageDialog(null, name+" your date of birth is "+dateOfBirth);
    }
}
