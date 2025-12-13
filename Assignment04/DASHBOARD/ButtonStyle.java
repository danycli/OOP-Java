package Assignment04.DASHBOARD;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class ButtonStyle {
    Dashboard dashboard;

    public ButtonStyle(Dashboard d){
        dashboard = d;
    }

    public static JButton stylePlay(String text){
        JButton b = new JButton();
        
        b.setBounds(100,130,400,200);
        b.setBackground( new Color(43, 47, 54));
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Times New Roman", Font.BOLD, 30));
        

        return b;
    }
}
