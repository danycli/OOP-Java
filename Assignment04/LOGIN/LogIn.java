package Assignment04.LOGIN;

import java.awt.*;
import javax.swing.*;

public class LogIn extends JFrame {

    private JButton LoginButton = ButtonStyle.LoginButton("Login");
    private JButton ForgotPass = ButtonStyle.ForgotPass("Forgot Password?");

    private JTextField userField = TextFieldStyle.UserField("👤 Type your username");
    private JTextField passField = TextFieldStyle.PassField("🔒 Type your password");
    
    private JLabel username = LabelStyle.UsernameLabel("Username:");
    private JLabel password = LabelStyle.PasswordLabel("Password:");
    private JLabel TopLogin = LabelStyle.LoginLabel(" Login ");
    
    public LogIn(){
        setLocation(710,230);
        setSize(500,700);
        setLayout(null);
        getContentPane().setBackground(Color.CYAN);
        
        add(TopLogin);
        add(username);
        add(userField);
        add(password);
        add(passField);
        add(ForgotPass);
        add(LoginButton);

        setResizable(false); // Restricting the frame not to maximize because making the frame componenton the to hendled dynamic is a headach for me
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public String getTopLogin(){
        return TopLogin.getText();
    }
    public void display(){
        setVisible(true);
    }

}
