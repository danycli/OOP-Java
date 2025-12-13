package Assignment04.DASHBOARD;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Settings extends JFrame {
    
    String settingsMenu ="<html>"+
                    "<b>Graphics</b><br>"+
                    "Preset : Ultra<br>"+
                    "Resolution : 1920 x 1080<br>"+
                    "Ray Tracing : On<br>"+
                    "Lumen : Enabled<br>"+
                    "Nanite : Enabled<br><br>"+
                    "<b>Performance</b><br>"+
                    "V-Sync : Off<br>"+
                    "FPS Limit : Unlimited<br>"+
                    "DLSS / FSR : Quality<br><br>"+
                    "<b>Visuals</b><br>"+
                    "Shadows : Ultra<br>"+
                    "Textures : High<br>"+
                    "Motion Blur : Off<br>"+"</html>";

    private JButton back = ButtonStyle.styleBack("Back");
    private JLabel setting = LabelStyle.stlyeSettings(settingsMenu);


    public Settings(){
        setSize(1200,1000);
        setLocation(360,40);
        setTitle("Settings");
        ImageIcon favicon = new ImageIcon("C:\\VS Code projects\\OOP-Java\\Assignment04\\favicon5.png");
        setIconImage(favicon.getImage());
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(new Color(43, 47, 54));

        DashboardEventHandling MouseClick = new DashboardEventHandling(this);
        back.addMouseListener(MouseClick);
        
        add(back);
        add(setting);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Getterrs
    public JButton getBack() {
        return back;
    }
    public void display(){
        setVisible(true);
    }
}
