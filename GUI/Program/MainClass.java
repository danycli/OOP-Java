package GUI.Program;

import javax.swing.JOptionPane;

public class MainClass {
    public static void main(String [] args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));

        if(x%2 == 0 && y%2 == 0 || !(y%2 == 0) && !(x%2 == 0)){
            JOptionPane.showMessageDialog(null, "Both the nums are of same type");
        }else{
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to make both the nums of same type?");
            if(choice == 0){
                int numChoice = JOptionPane.showConfirmDialog(null, "Which number you want to change\nChoose yes for 1st number and No for 2nd number");
                if(numChoice == 0){
                    ++x;
                    if(x%2 == 0 && y%2 == 0 || !(y%2 == 0) && !(x%2 == 0)){
                        JOptionPane.showMessageDialog(null, "Both the nums are of same type");
                    }
                }else if(numChoice == 1){
                            ++y;
                            if(x%2 == 0 && y%2 == 0 || !(y%2 == 0) && !(x%2 == 0)){
                        JOptionPane.showMessageDialog(null, "Both the nums are of same type");
                    }
                }
            }
            }
        }
    }
