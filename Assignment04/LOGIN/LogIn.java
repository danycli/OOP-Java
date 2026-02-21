package Assignment04.LOGIN;

import java.awt.*;
import javax.swing.*;

public class LogIn extends JFrame {
    private String pass;
    private String UserName;

    private JButton LoginButton = ButtonStyle.LoginButton("Login");
    private JButton ForgotPass = ButtonStyle.ForgotPass("Forgot Password?");

    private JTextField userField = TextFieldStyle.UserField("👤 Type your username");
    private JTextField passField = TextFieldStyle.PassField("🔒 Type your password");
    private JTextField DummyField = TextFieldStyle.dummyfield(""); //For focus 

    private JLabel username = LabelStyle.UsernameLabel("Username:");
    private JLabel password = LabelStyle.PasswordLabel("Password:");
    private JLabel TopLogin = LabelStyle.LoginLabel(" Login ");
    private JLabel Error = LabelStyle.ErrorLabel("");

    
    public LogIn(String name, String newPass){
        if(name.equals("") && newPass.equals("")){
            UserName = "Acid Eye";
            pass = "nishtamara!!@@";
        }else{
            UserName = name;
            pass = newPass;
        }

        setTitle("LogIn");
        ImageIcon favicon = new ImageIcon("C:\\VS Code projects\\OOP-Java\\Assignment04\\favicon5.png");
        setIconImage(favicon.getImage());
        setLocation(710,190);
        setSize(500,700);
        setLayout(null);
        getContentPane().setBackground(Color.CYAN);

        LogInEventHandling mouseClick = new LogInEventHandling(this);
        TextFieldStyle clicked = new TextFieldStyle(this);
        
        add(TopLogin);
        add(username);
        add(userField);
        add(password);
        add(passField);
        add(ForgotPass);
        add(LoginButton);
        add(Error);
        add(DummyField);

        LoginButton.addMouseListener(mouseClick);
        ForgotPass.addMouseListener(mouseClick);
        userField.addFocusListener(clicked);
        passField.addFocusListener(clicked);

        setResizable(false); // Restricting the frame not to maximize because making the frame componenton the to hendled dynamic is a headach for me
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Getters for buttons
    public JButton getLoginButton() {
        return LoginButton;
    }
    public JButton getForgotPass() {
        return ForgotPass;
    }
    //Getters for TextFields
    public JTextField getUserField() {
        return userField;
    }
    public String getUserFieldText(){
        return userField.getText();
    }
    public JTextField getPassField() {
        return passField;
    }
    public String getpassFieldText(){
        return passField.getText();
    }
    //Getters for pass and username
    public String getPass() {
        return pass;
    }
    public String getUserName() {
        return UserName;
    }
    //Setters for pass and username
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }

    //Setters for TextFields
    public void setUserField(String text) {
        this.userField.setText(text);
    }
    public void setpassField(String text) {
        this.passField.setText(text);
    }

    public void showError(String text){
        Error.setText(text);
        Error.setVisible(true);
    }
    public void display(){
        setVisible(true);
    }

}
