package Assignment04.LOGIN;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

public class ForgotFrame extends JFrame{
    private JButton back = ButtonStyle.BackButton("Back");
    public ForgotFrame(){
        setTitle("Forgot Password");
        ImageIcon favicon = new ImageIcon("C:\\VS Code projects\\OOP-Java\\Assignment04\\favicon5.png");
        setIconImage(favicon.getImage());
        setLocation(710,190);
        setSize(500,700);
        setLayout(null);
        getContentPane().setBackground(new Color(0, 255, 255));

        LogInEventHandling mouseClick = new LogInEventHandling(this);
        back.addMouseListener(mouseClick);

        add(back);

        setResizable(false); // Restricting the frame not to maximize because making the frame componenton the to hendled dynamic is a headach for me
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Getter for back
    public JButton getBack() {
        return back;
    }

    public void display(){
        setVisible(true);
    }
}
