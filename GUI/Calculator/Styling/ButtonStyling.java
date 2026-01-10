package GUI.Calculator.Styling;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class ButtonStyling {
    
    public static JButton arithmeticOp(String text, int x, int y){
        JButton b = new JButton(text);
        b.setSize(112,112);
        b.setLocation(x, y);
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setBackground(Color.RED);
        b.setForeground(Color.WHITE);
        b.setBorder(BorderFactory.createMatteBorder(0, 2, 2, 2, Color.WHITE));
        return b;
    }
    public static JButton zero (String text, int x, int y){
        JButton b = new JButton(text);
        b.setSize(336,112);
        b.setLocation(x, y);
        b.setBorder(BorderFactory.createEmptyBorder());
        b.setBackground(Color.RED);
        b.setForeground(Color.WHITE);
        b.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
        return b;
    }
}
