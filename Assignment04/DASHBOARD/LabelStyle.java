package Assignment04.DASHBOARD;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class LabelStyle {
    Dashboard dashboard;

    public LabelStyle(Dashboard d){
        dashboard = d;
    }

    public static JLabel stlyeDashboard(String text){
        JLabel l = new JLabel(text);

        l.setBounds(100,70,180,50);
        l.setBackground(new Color(43, 47, 54));
        l.setFont(new Font("Cooper Black", Font.BOLD, 30));
        l.setForeground(Color.WHITE);
        l.setOpaque(true);

        return l;
    }

    public static JLabel stlyeXP(String text){
        JLabel l = new JLabel(text);

        l.setBounds(300,90,180,50);
        l.setBackground(new Color(43, 47, 54));
        l.setFont(new Font("Cooper Black", Font.BOLD, 30));
        l.setForeground(Color.WHITE);
        l.setOpaque(true);

        return l;
    }
}
