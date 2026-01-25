package Styling;

import java.awt.*;
import javax.swing.*;

public class ButtonStyle {
    
    public static JButton StyleAddMannually(String text ){
        JButton b = new JButton(text);
        b.setBounds(270,550,160,40);
        b.setBackground(new Color(137, 156, 160));
        b.setFont(new Font("Roboto Condensed", Font.PLAIN, 14));
        b.setForeground(Color.WHITE);
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusable(false);

        return b;
    }   

    public static JButton StyleImportTeam(String text ){
        JButton b = new JButton(text);
        b.setBounds(570,550,160,40);
        b.setBackground(new Color(137, 156, 160));
        b.setFont(new Font("Roboto Condensed", Font.PLAIN, 14));
        b.setForeground(Color.WHITE);
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusable(false);

        return b;
    }  

    public static JButton StyleStartMatch(String text ){
        JButton b = new JButton(text);
        b.setBounds(415,610,170,60);
        b.setBackground(new Color(203, 150, 97));
        b.setFont(new Font("Roboto Condensed", Font.BOLD, 22));
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setForeground(Color.WHITE);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusable(false);

        return b;
    } 
    //Manual Next
    public static JButton StyleNext(String text ){
        JButton b = new JButton(text);
        b.setBounds(170,250,60,30);
        b.setBackground(new Color(203, 150, 97));
        b.setFont(new Font("Roboto Condensed", Font.BOLD, 22));
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setForeground(Color.WHITE);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusable(false);

        return b;
    } 
    public static JButton StyleFinish(String text ){
        JButton b = new JButton(text);
        b.setBounds(170,300,60,30);
        b.setBackground(new Color(52, 77, 46));
        b.setFont(new Font("Roboto Condensed", Font.BOLD, 22));
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setForeground(Color.WHITE);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusable(false);

        return b;
    } 
    public static JButton StyleRefresh(ImageIcon refresh){
        JButton b = new JButton();
        b.setIcon(refresh);
        b.setBounds(920,10,60,30);
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setBackground(new Color(244, 240, 228));
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusable(false);

        return b;
    }

    public static JButton StyleTossButton(String text){
        JButton b = new JButton(text);
        b.setBounds(115, 250, 170, 40);
        b.setBackground(new Color(203, 150, 97)); 
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Roboto Condensed", Font.BOLD, 22));
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusable(false);
        return b;
    }
    // ... inside ButtonStyle class

    public static JButton StyleBatButton(){
        JButton b = new JButton("BAT");
        b.setBounds(50, 150, 130, 60);
        b.setBackground(new Color(203, 150, 97)); 
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Roboto Condensed", Font.BOLD, 25));
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusable(false);
        return b;
    }

    public static JButton StyleBowlButton(){
        JButton b = new JButton("BOWL");
        b.setBounds(210, 150, 130, 60);
        b.setBackground(new Color(137, 156, 160));
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Roboto Condensed", Font.BOLD, 25));
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusable(false);
        return b;
    }

    public static JButton StyleRunButton(String text, int x, int y){
        JButton b = new JButton(text);
        b.setBounds(x, y, 80, 50);
        b.setBackground(new Color(203, 150, 97)); 
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Roboto Condensed", Font.BOLD, 20));
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusable(false);
        return b;
    }

    public static JButton StyleControlButton(String text, int x, int y){
        JButton b = new JButton(text);
        b.setBounds(x, y, 100, 50);
        b.setBackground(new Color(137, 156, 160)); 
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusable(false);
        return b;
    }

    public static JButton StyleEndOverButton(){
        JButton b = new JButton("End Over");
        b.setBounds(670, 500, 120, 50);
        b.setBackground(new Color(52, 77, 46)); 
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b.setFocusable(false);
        return b;
    }
    
    public static JButton StyleSwapButton(){
        JButton b = new JButton("Swap Batsman");
        b.setBounds(425, 300, 150, 30);
        b.setBackground(new Color(137, 156, 160));
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Roboto Condensed", Font.PLAIN, 14));
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setFocusable(false);
        return b;
    }
    //Dismissal Runs
    public static JButton StyleDismissalButtons(String text,int x, int y){
        JButton b = new JButton(text);
        b.setBounds(x,y,70,30);
        b.setBackground(new Color(52, 77, 46)); 
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setFocusable(false);
        return b;
    }
}
