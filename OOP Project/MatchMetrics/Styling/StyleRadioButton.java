package Styling;

import javax.swing.*;
import java.awt.*;

public class StyleRadioButton {

    public static JRadioButton StyleRadioTeamA(String text){
        JRadioButton r = new JRadioButton(text);
        r.setBounds(80, 115, 120, 30);
        r.setBackground(new Color(244, 240, 228)); 
        r.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
        r.setSelected(true); 
        return r;
    }

    public static JRadioButton StyleRadioTeamB(String text){
        JRadioButton r = new JRadioButton(text);
        r.setBounds(220, 115, 120, 30);
        r.setBackground(new Color(244, 240, 228));
        r.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
        return r;
    }

    public static JRadioButton StyleRadioHeads(){
        JRadioButton r = new JRadioButton("Heads");
        r.setBounds(100, 195, 80, 30);
        r.setBackground(new Color(244, 240, 228));
        r.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
        r.setSelected(true);
        return r;
    }

    public static JRadioButton StyleRadioTails(){
        JRadioButton r = new JRadioButton("Tails");
        r.setBounds(220, 195, 80, 30);
        r.setBackground(new Color(244, 240, 228));
        r.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
        return r;
    }
}