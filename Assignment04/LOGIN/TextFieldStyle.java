package Assignment04.LOGIN;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.*;

public class TextFieldStyle extends FocusAdapter {
    LogIn login;

    public TextFieldStyle(LogIn l){
        login = l;
    }

    public static JTextField UserField(String text){
        JTextField t = new JTextField(text);
        // t.requestFocusInWindow();
        t.setBounds(100,195,200,30);
        t.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        t.setFont(new Font("Aptos Display", Font.PLAIN, 14));
        t.setOpaque(false);

        return t;
    }

    public static JTextField PassField(String text){
        JTextField t = new JTextField(text);
        // t.requestFocusInWindow();
        t.setBounds(100,270,200,30);
        t.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        t.setFont(new Font("Aptos Display", Font.PLAIN, 14));
        t.setOpaque(false);

        return t;
    }
    public static JTextField dummyfield(String text){
        JTextField t = new JTextField(text);
        t.requestFocusInWindow();

        return t;
    }


    @Override
    public void focusGained(FocusEvent e) {
        if(login.getUserField().isFocusable() && e.getSource() == login.getUserField()){
            login.setUserField(null);
        }else if(login.getPassField().isFocusable() && e.getSource() == login.getPassField()){
            login.setpassField(null);
        }
    }
}
