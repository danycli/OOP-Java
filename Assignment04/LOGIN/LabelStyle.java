package Assignment04.LOGIN;

import java.awt.*;
import javax.swing.*;

public class LabelStyle {
    
    public static JLabel LoginLabel(String text){
        JLabel l = new JLabel(text);
        l.setBounds(200,70,100,50);
        l.setFont(new Font("Times New Roman", Font.BOLD, 30));
        // l.setOpaque(true);//Making background visible
        // l.setBackground(Color.RED);//Setting background color
        l.setForeground(new Color(0, 40, 80));//Text Color
        // l.setBorder(BorderFactory.createLineBorder(Color.BLACK,3,true));

        return l;
    }

    public static JLabel UsernameLabel(String text){
        JLabel l = new JLabel(text);
        l.setBounds(100,160,120,30);
        l.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        l.setForeground(Color.BLACK);//Text Color

        return l;
    }

    public static JLabel PasswordLabel(String text){
        JLabel l = new JLabel(text);
        l.setBounds(100,235,120,30);
        l.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        l.setForeground(Color.BLACK);//Text Color

        return l;
    }
}
