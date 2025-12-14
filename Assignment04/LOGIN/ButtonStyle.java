package Assignment04.LOGIN;

import java.awt.*;
import javax.swing.*;

public class ButtonStyle{

    public static JButton ForgotPass(String text){
        JButton b = new JButton(text);
        b.setBounds(250,300,115,30);
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setFont(new Font("Aptos Display", Font.PLAIN, 14));
        b.setForeground(Color.BLUE);
        b.setCursor(new Cursor (Cursor.HAND_CURSOR));
        b.setContentAreaFilled(false);
        b.setOpaque(false);

        return b;
    }

    public static JButton LoginButton(String text){
        JButton b = new JButton(text);
        b.setBounds(200,400,115,50);
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        b.setForeground(Color.WHITE);
        b.setCursor(new Cursor (Cursor.HAND_CURSOR));
        b.setBackground(new Color(0, 40, 80));
        

        return b;
    }
    public static JButton BackButton(String text){
        JButton b = new JButton(text);
        b.setBounds(20,20,50,30);
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b.setForeground(Color.WHITE);
        b.setCursor(new Cursor (Cursor.HAND_CURSOR));
        b.setBackground(new Color(0, 40, 80));
        

        return b;
    }
    public static JButton BackNext(String text){
        JButton b = new JButton(text);
        b.setBounds(200,220,50,30);
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b.setForeground(Color.WHITE);
        b.setCursor(new Cursor (Cursor.HAND_CURSOR));
        b.setBackground(new Color(0, 40, 80));
        

        return b;
    }
    public static JButton BackReset(String text){
        JButton b = new JButton(text);
        b.setBounds(200,220,50,30);
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b.setForeground(Color.WHITE);
        b.setCursor(new Cursor (Cursor.HAND_CURSOR));
        b.setBackground(new Color(0, 40, 80));
        

        return b;
    }
    public static JButton resetButton(String text){
        JButton b = new JButton(text);
        b.setBounds(200,330,70,30);
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b.setForeground(Color.WHITE);
        b.setCursor(new Cursor (Cursor.HAND_CURSOR));
        b.setBackground(new Color(0, 40, 80));
        

        return b;
    }

}
