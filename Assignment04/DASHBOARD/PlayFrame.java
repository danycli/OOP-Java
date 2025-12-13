package Assignment04.DASHBOARD;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

public class PlayFrame extends JFrame {

    JButton back = new JButton("Back");
    JLabel warning = new JLabel("The game is under development, go back!");

    public PlayFrame(){
        setSize(1200,1000);
        setLocation(360,40);
        setTitle("Dashboard");
        ImageIcon favicon = new ImageIcon("C:\\VS Code projects\\OOP-Java\\Assignment04\\favicon5.png");
        setIconImage(favicon.getImage());
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(new Color(43, 47, 54));

        DashboardEventHandling MouseClick = new DashboardEventHandling(this);
        
        add(back);
        add(warning);
    }

    public JButton getBack() {
        return back;
    }
    public void display(){
        setVisible(true);
    }
}
