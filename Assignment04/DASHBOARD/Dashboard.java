package Assignment04.DASHBOARD;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

public class Dashboard extends JFrame{
    
    private JButton PLay = new JButton("PLAY");
    private JButton Settings = new JButton("Settings");
    private JButton ViewStats = new JButton("View Stats");

    private JLabel Dashboard = LabelStyle.stlyeDashboard("Dashboard");
    private JLabel xp = LabelStyle.stlyeXP("Total XP\n   1250");
    private JLabel achievements = new JLabel("Acievements\n    5/10");
    private JLabel level = new JLabel("Level\n 5");
    private JLabel quote = new JLabel("You ain't meant to be average");
    

    public Dashboard(){
        setSize(1000,900);
        setLocation(460,90);
        setTitle("Dashboard");
        ImageIcon favicon = new ImageIcon("C:\\VS Code projects\\OOP-Java\\Assignment04\\favicon5.png");
        setIconImage(favicon.getImage());
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(new Color(43, 47, 54));


        add(PLay);
        add(Settings);
        add(ViewStats);
        add(Dashboard);
        add(xp);
        add(achievements);
        add(level);
        add(quote);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void display(){
        setVisible(true);
    }
}
