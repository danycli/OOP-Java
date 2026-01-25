package Styling;

import javax.swing.*;
import java.awt.*;

public class StyleTextField {

    public static JTextField StyleTName(){
        JTextField t = new JTextField();
        t.setBounds(130 , 160, 130,30);
        t.setBackground(new Color(244, 240, 228));
        t.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        t.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
        return t;
    }
}
