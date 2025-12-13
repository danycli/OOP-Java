package Assignment04.DASHBOARD;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Dashboard extends JFrame{
    
    private JButton PLay = ButtonStyle.stylePlay("PLAY");
    private JButton Settings = ButtonStyle.styleSetting("Settings");
    private JButton ViewStats = ButtonStyle.styleViewStats("View Stats");

    private JLabel Dashboard = LabelStyle.stlyeDashboard("WELCOME BACK ACID EYE");
    private JLabel xp = LabelStyle.stlyeXP("<html>Total XP<br><center>1250</center></html>");
    private JLabel achievements = LabelStyle.stlyeAchievements("<html>Achievements<br><center>12 / 90</center></html>");
    private JLabel level = LabelStyle.stlyeLevel("<html>Level<br><center>5</center></html>");
    private JLabel quote = LabelStyle.stlyeQuote("You ain't meant to be average");
    

    public Dashboard(){
        setSize(1200,1000);
        setLocation(360,40);
        setTitle("Dashboard");
        ImageIcon favicon = new ImageIcon("C:\\VS Code projects\\OOP-Java\\Assignment04\\favicon5.png");
        setIconImage(favicon.getImage());
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(new Color(43, 47, 54));

        DashboardEventHandling mouseClick = new DashboardEventHandling(this);
        PLay.addMouseListener(mouseClick);
        ViewStats.addMouseListener(mouseClick);

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

    //Getter for play & view Stats
    public JButton getPLay() {
        return PLay;
    }
    public JButton getViewStats() {
        return ViewStats;
    }
    public void display(){
        setVisible(true);
    }
}
