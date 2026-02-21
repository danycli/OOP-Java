package Assignment04.DASHBOARD;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Stats extends JFrame{

    private String UN;
    private String pass;
    private String freshStats ="<html>" +
                    "<b>Player Progress</b><br>"+
                    "Level : 5<br>"+
                    "Rank : GrandMaster IV<br>"+
                    "Total XP : 1250<br><br>"+
                    "<b>Match Performance</b><br>"+
                    "Total Games : 39<br>"+
                    "Wins : 35<br>"+
                    "Losses : 4<br>"+
                    "Win Rate : 94%<br><br>"+
                    "<b>Combat Stats</b><br>"+
                    "Kills : 912<br>"+
                    "Knockdowns : 1297<br>"+
                    "K/D Ratio : 4.5<br>"+
                    "Headshot Rate : 84.7%<br><br>"+
                    "<b>Play Time & Achievements</b><br>"+
                    "Play Time : 14h 32m<br>"+
                    "Achievements : 12 / 90<br>"+"</html>";

    private JButton back = ButtonStyle.styleBack("Back");
    private JLabel stats = LabelStyle.stlyeStats(freshStats);

    public Stats(String name, String Pass){
        UN = name;
        pass = Pass;
        System.out.println("Username = "+UN);
        System.out.println("Pass = "+pass);
        setSize(1200,1000);
        setLocation(360,40);
        setTitle("Stats");
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
    public String getUN() {
        return UN;
    }
    public String getPass() {
        return pass;
    }
    public void display(){
        setVisible(true);
    } 
}
