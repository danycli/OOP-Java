package Assignment04.DASHBOARD;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

public class ButtonStyle {
    Dashboard dashboard;

    public ButtonStyle(Dashboard d){
        dashboard = d;
    }

    public static JButton stylePlay(String text){
        JButton b = new JButton(text);
        
        ImageIcon controller = new ImageIcon("C:\\VS Code projects\\OOP-Java\\Assignment04\\Controller.png");
        b.setIcon(controller);
        b.setBounds(50,300,200,300);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setHorizontalTextPosition(SwingConstants.CENTER);
        b.setVerticalTextPosition(SwingConstants.BOTTOM);
        b.setHorizontalAlignment(SwingConstants.CENTER);
        b.setVerticalAlignment(SwingConstants.CENTER);
        b.setIconTextGap(60);
        b.setBackground(new Color(60, 65, 72));
        b.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Minecrafter Alt", Font.BOLD, 50));


        return b;
    }

    public static JButton styleSetting(String text){
        JButton b = new JButton(text);

        // ImageIcon setting = new ImageIcon("C:\\VS Code projects\\OOP-Java\\Assignment04\\setting.png");
        // b.setIcon(setting);
        b.setBounds(950,800,170,50);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setBackground(new Color(60, 65, 72));
        b.setForeground(Color.WHITE);
        b.setOpaque(true);
        b.setHorizontalAlignment(SwingConstants.CENTER);
        b.setVerticalAlignment(SwingConstants.CENTER);
        b.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        b.setFont(new Font("Minecrafter Alt", Font.PLAIN, 25));


        return b;
    }

    public static JButton styleViewStats(String text){
        JButton b = new JButton(text);

        // ImageIcon setting = new ImageIcon("C:\\VS Code projects\\OOP-Java\\Assignment04\\setting.png");
        // b.setIcon(setting);
        b.setBounds(490,700,220,60);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setBackground(new Color(60, 65, 72));
        b.setForeground(Color.WHITE);
        b.setOpaque(true);
        b.setHorizontalAlignment(SwingConstants.CENTER);
        b.setVerticalAlignment(SwingConstants.CENTER);
        b.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        b.setFont(new Font("Minecrafter Alt", Font.PLAIN, 25));


        return b;
    }

    public static JButton styleBack(String text){
        JButton b = new JButton(text);

        // ImageIcon setting = new ImageIcon("C:\\VS Code projects\\OOP-Java\\Assignment04\\setting.png");
        // b.setIcon(setting);
        b.setBounds(20,20,90,40);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setBackground(new Color(60, 65, 72));
        b.setForeground(Color.WHITE);
        b.setOpaque(true);
        b.setHorizontalAlignment(SwingConstants.CENTER);
        b.setVerticalAlignment(SwingConstants.CENTER);
        b.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        b.setFont(new Font("Minecrafter Alt", Font.PLAIN, 20));


        return b;
    }
}
