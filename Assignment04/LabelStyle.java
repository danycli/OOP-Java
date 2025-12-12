package Assignment04;

import javax.swing.JLabel;

public class LabelStyle extends JLabel {
    LogIn label;

    LabelStyle(LogIn lab){
        label = lab;
    }

    public void Lstyle(){
        if(label.getTopLogin().equals("Login")){
            System.out.println("Yes");
        }
    }
}
