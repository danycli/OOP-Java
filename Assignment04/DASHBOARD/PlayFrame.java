package Assignment04.DASHBOARD;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class PlayFrame extends JFrame {

    private JButton back = ButtonStyle.styleBack("Back");
    private JLabel warning = LabelStyle.stlyeWarning("<html>The game is under Maintinance<br><center>go back!</center></html>");
    private String UN;
    private String pass;

    public PlayFrame(String name, String Pass){
        UN = name;
        pass = Pass;
        setSize(1200,1000);
        setLocation(360,40);
        setTitle("Play");
        ImageIcon favicon = new ImageIcon("C:\\VS Code projects\\OOP-Java\\Assignment04\\favicon5.png");
        setIconImage(favicon.getImage());
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(new Color(43, 47, 54));

        DashboardEventHandling MouseClick = new DashboardEventHandling(this);
        back.addMouseListener(MouseClick);
        
        add(back);
        add(warning);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JButton getBack() {
        return back;
    }
    public String getName(){
        return UN;
    }
    public String getPass(){
        return pass;
    }
    public void display(){
        setVisible(true);
    }
}
