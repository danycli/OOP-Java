package Assignment04;

import java.awt.*;
import javax.swing.*;

public class LogIn extends JFrame {
    private JFrame LoginFrame = new JFrame();

    private JButton LoginButton = new JButton("Login");
    private JButton ForgotPass = new JButton("Forgot Password?");

    private JTextField userField = new JTextField("👤 Type your username");
    private JTextField passField = new JTextField("🔒 Type your password");
    
    private JLabel username = new JLabel("Username");
    private JLabel password = new JLabel("Password");
    private JLabel TopLogin = new JLabel("Login");
    
    LogIn(){
        setLocation(710,230);
        setSize(500,700);
        setLayout(null);
        getContentPane().setBackground(Color.CYAN);
        LabelStyle label = new LabelStyle(this);
        
        add(TopLogin);
        
        // TopLogin.setBounds(200,50,60,30);
        // TopLogin.setFont(new Font("Times New Roman", Font.BOLD, 25));
        
        // add(username);
        // add(userField);
        // add(password);
        // add(passField);
        // add(ForgotPass);
        // add(LoginButton);
        LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public String getTopLogin(){
        return TopLogin.getText();
    }
    public void display(){
        setVisible(true);
    }

}
