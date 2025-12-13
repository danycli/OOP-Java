package Assignment04.DASHBOARD;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class LabelStyle {
    Dashboard dashboard;

    public LabelStyle(Dashboard d){
        dashboard = d;
    }

    public static JLabel stlyeDashboard(String text){
        JLabel l = new JLabel(text);

        l.setBounds(130,90,885,100);
        l.setBackground(new Color(43, 47, 54));
        l.setFont(new Font("Cooper Black", Font.PLAIN, 60));
        l.setForeground(Color.WHITE);
        l.setOpaque(true);

        return l;
    }

    public static JLabel stlyeXP(String text){
        JLabel l = new JLabel(text);

        l.setBounds(270,300,280,170);
        l.setBackground(new Color(43, 47, 54));
        l.setOpaque(true);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setVerticalAlignment(SwingConstants.CENTER);
        l.setBackground(new Color(60, 65, 72));
        l.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
        l.setFont(new Font("Minecrafter Alt", Font.PLAIN, 30));
        l.setForeground(Color.WHITE);
        l.setOpaque(true);

        return l;
    }

    public static JLabel stlyeAchievements(String text){
        JLabel l = new JLabel(text);

        l.setBounds(570,300,280,170);
        l.setBackground(new Color(43, 47, 54));
        l.setOpaque(true);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setVerticalAlignment(SwingConstants.CENTER);
        l.setBackground(new Color(60, 65, 72));
        l.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
        l.setFont(new Font("Minecrafter Alt", Font.PLAIN, 30));
        l.setForeground(Color.WHITE);
        l.setOpaque(true);

        return l;
    }

    public static JLabel stlyeLevel(String text){
        JLabel l = new JLabel(text);

        l.setBounds(870,300,280,170);
        l.setBackground(new Color(43, 47, 54));
        l.setOpaque(true);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setVerticalAlignment(SwingConstants.CENTER);
        l.setBackground(new Color(60, 65, 72));
        l.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
        l.setFont(new Font("Minecrafter Alt", Font.PLAIN, 30));
        l.setForeground(Color.WHITE);
        l.setOpaque(true);

        return l;
    }

    public static JLabel stlyeQuote(String text){
        JLabel l = new JLabel(text);

        l.setBounds(270,500,780,70);
        l.setBackground(new Color(43, 47, 54));
        l.setOpaque(true);
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setVerticalAlignment(SwingConstants.CENTER);
        l.setBackground(new Color(60, 65, 72));
        l.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
        l.setFont(new Font("Minecrafter Alt", Font.PLAIN, 30));
        l.setForeground(Color.WHITE);
        l.setOpaque(true);

        return l;
    }
    public static JLabel stlyeWarning(String text){
        JLabel l = new JLabel(text);

        l.setBounds(83,450,1035,100);
        l.setBackground(new Color(43, 47, 54));
        l.setFont(new Font("Minecrafter Alt", Font.PLAIN, 50));
        l.setForeground(Color.RED);
        l.setOpaque(true);

        return l;
    }
}
