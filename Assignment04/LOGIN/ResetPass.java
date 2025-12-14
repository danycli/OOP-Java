package Assignment04.LOGIN;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class ResetPass extends JFrame {

    private JButton reset = ButtonStyle.resetButton("Reset");
    private JLabel passReset = LabelStyle.passAndUserLabel("Password & Username Reset");
    private JLabel passLabel = LabelStyle.newPassLabel("New Password:");
    private JLabel userLabel = LabelStyle.newUserLable("New User Name:");
    private JTextField passText = TextFieldStyle.passText("");
    private JTextField userText = TextFieldStyle.userText("");
    public ResetPass(){
        setTitle("Reset Password");
        ImageIcon favicon = new ImageIcon("C:\\VS Code projects\\OOP-Java\\Assignment04\\favicon5.png");
        setIconImage(favicon.getImage());
        setLocation(710,190);
        setSize(500,700);
        setLayout(null);
        getContentPane().setBackground(new Color(0, 255, 255));

        LogInEventHandling mouseClick = new LogInEventHandling(this);
        reset.addMouseListener(mouseClick);

        add(reset);
        add(passReset);
        add(passLabel);
        add(userLabel);
        add(passText);
        add(userText);

        setResizable(false); // Restricting the frame not to maximize because making the frame componenton the to hendled dynamic is a headach for me
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Getter for reset,pass & user
    public JButton getReset() {
        return reset;
    }
    public String getPassText() {
        return passText.getText();
    }
    public String getUserText() {
        return userText.getText();
    }
    public void display(){
        setVisible(true);
    }
}
