package Assignment04.DASHBOARD;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Stats extends JFrame{
    String freshStats = "<html>Total Games Played : 39<br>Total Wins : 35<br>Kills : 912<br>Knockdowns :1297<br>K/D : 4.5<br>Time game Played :9 hours<br></html>";
    private JButton back = ButtonStyle.styleBack("Back");
    private JLabel stats = LabelStyle.stlyeStats(freshStats);

    public Stats(){
        setSize(1200,1000);
        setLocation(360,40);
        setTitle("Dashboard");
        ImageIcon favicon = new ImageIcon("C:\\VS Code projects\\OOP-Java\\Assignment04\\favicon5.png");
        setIconImage(favicon.getImage());
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(new Color(43, 47, 54));

        DashboardEventHandling MouseClick = new DashboardEventHandling(this);
        back.addMouseListener(MouseClick);
        
        add(back);
        add(stats);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Getter for getBack
    public JButton getBack() {
        return back;
    }
    public void display(){
        setVisible(true);
    } 
}
