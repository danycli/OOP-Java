package Assignment04.LOGIN;

import java.awt.*;
import javax.swing.*;

public class TextFieldStyle {
    
    public static JTextField UserField(String text){
        JTextField t = new JTextField(text);
        t.setBounds(100,195,200,30);
        t.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        t.setFont(new Font("Aptos Display", Font.PLAIN, 14));
        t.setOpaque(false);

        return t;
    }

    public static JTextField PassField(String text){
        JTextField t = new JTextField(text);
        t.setBounds(100,270,200,30);
        t.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        t.setFont(new Font("Aptos Display", Font.PLAIN, 14));
        t.setOpaque(false);

        return t;
    }
}
