package Assignment04.LOGIN;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;

public class ResetPass extends JFrame {

    private JButton reset = new JButton("Reset");
    private JLabel passReset = new JLabel("Password & Username Reset");
    private JLabel passLabel = new JLabel("New Password:");
    private JLabel userLabel = new JLabel("New User Name:");
    private JTextField passText = new JTextField("");
    private JTextField userText = new JTextField("");
    
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

        add(passReset);
        add(passLabel);
        add(userLabel);
        add(passText);
        add(userText);

        setResizable(false); // Restricting the frame not to maximize because making the frame componenton the to hendled dynamic is a headach for me
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Getter for reset
    public JButton getReset() {
        return reset;
    }
    public void display(){
        setVisible(true);
    }
}
