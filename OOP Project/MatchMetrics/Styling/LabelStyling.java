package Styling;

import javax.swing.*;
import java.awt.*;

public class LabelStyling {
    
    public static JLabel StyleMatchMetrics(String text){
        JLabel l = new JLabel(text);
        l.setBounds(320,0,360,200);
        l.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l.setForeground(new Color(52, 77, 46));

        return l;
    }

    public static JLabel StyleDummyA(){
        JLabel l = new JLabel(); 
        l.setBackground(new Color(245, 241, 229));
        l.setBounds(150, 150, 700,170);
        l.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        return l;
    }

    public static JLabel StyleDummyB(){
        JLabel l = new JLabel(); 
        l.setBackground(new Color(245, 241, 229));
        l.setBounds(150, 350, 700,170);
        l.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        return l;
    }

    public static JLabel StyleSelectA(String text){
        JLabel l = new JLabel(text); 
        l.setBackground(new Color(245, 241, 229));
        l.setBounds(170, 170, 170,130);
        l.setFont(new Font("Roboto Condensed", Font.BOLD, 22));
        l.setForeground(new Color(93, 115, 86));
        return l;
    }
    public static JLabel StyleSelectB(String text){
        JLabel l = new JLabel(text); 
        l.setBackground(new Color(245, 241, 229));
        l.setBounds(170, 370, 170,130);
        l.setFont(new Font("Roboto Condensed", Font.BOLD, 22));
        l.setForeground(new Color(93, 115, 86));
        return l;
    }

    public static JLabel StyleImportTeam(String text){
        JLabel l = new JLabel(text); 
        l.setBounds(105 , 30, 185,50);
        l.setFont(new Font("Roboto Condensed", Font.BOLD, 25));
        l.setForeground(new Color(93, 115, 86));
        return l;
    }
    public static JLabel StyleTeamName(String text){
        JLabel l = new JLabel(text); 
        l.setBounds(130 , 130, 130,30);
        l.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
        l.setForeground(Color.BLACK);
        return l;
    }
    public static JLabel StyleErrorMessage(String text){
        JLabel l = new JLabel(text); 
        l.setBounds(127, 210, 145,30);
        l.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
        l.setForeground(Color.RED);
        return l;
    }

    public static JLabel StyleTossTitle(String text){
        JLabel l = new JLabel(text);
        l.setBounds(100, 20, 200, 40);
        l.setFont(new Font("Roboto Condensed", Font.BOLD, 30));
        l.setForeground(new Color(52, 77, 46)); 
        l.setHorizontalAlignment(SwingConstants.CENTER);
        return l;
    }

    public static JLabel StyleWhoCalls(String text){
        JLabel l = new JLabel(text);
        l.setBounds(50, 80, 300, 30);
        l.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
        l.setForeground(Color.BLACK);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        return l;
    }

    public static JLabel StyleCallChoice(String text){
        JLabel l = new JLabel(text);
        l.setBounds(50, 160, 300, 30);
        l.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
        l.setForeground(Color.BLACK);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        return l;
    }
    public static JLabel StyleResultTitle(){
        JLabel l = new JLabel("TOSS RESULT");
        l.setBounds(75, 20, 250, 40);
        l.setFont(new Font("Roboto Condensed", Font.BOLD, 30));
        l.setForeground(new Color(52, 77, 46)); 
        l.setHorizontalAlignment(SwingConstants.CENTER);
        return l;
    }

    public static JLabel StyleWinnerLabel(String text){
        JLabel l = new JLabel(text);
        l.setBounds(20, 80, 360, 40); // Wide enough for long team names
        l.setFont(new Font("Roboto Condensed", Font.BOLD, 22));
        l.setForeground(Color.BLACK);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        return l;
    }

    public static JLabel StyleMainScore(String text){
        JLabel l = new JLabel(text);
        l.setBounds(0, 70, 1000, 50); // Full width, centered
        l.setFont(new Font("Roboto Condensed", Font.BOLD, 40));
        l.setForeground(Color.BLACK);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        return l;
    }

    public static JLabel StyleSubHeader(String text, int x, int y){
        JLabel l = new JLabel(text);
        l.setBounds(x, y, 200, 30);
        l.setFont(new Font("Roboto Condensed", Font.BOLD, 22));
        l.setForeground(Color.BLACK);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        return l;
    }

    public static JLabel StylePlayerText(String text, int x, int y){
        JLabel l = new JLabel(text);
        l.setBounds(x, y, 300, 30);
        l.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
        l.setForeground(Color.BLACK);
        return l;
    }

    //Dismissal Runs
    public static JLabel StyleDismissalRuns(String text){
        JLabel l = new JLabel(text);
        l.setBounds(170,5,300,40);
        l.setFont(new Font("Roboto Condensed", Font.BOLD, 30));
        l.setForeground(Color.BLACK);
        return l;
    }
}
