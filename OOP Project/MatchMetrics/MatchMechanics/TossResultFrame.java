package MatchMechanics;

import javax.swing.*;
import java.awt.*;
import Styling.ButtonStyle;
import Styling.LabelStyling;
import Event.EventHandling;

public class TossResultFrame extends JFrame {

    private JLabel title = LabelStyling.StyleResultTitle();
    private JLabel winnerLabel;
    
    private JButton batButton = ButtonStyle.StyleBatButton();
    private JButton bowlButton = ButtonStyle.StyleBowlButton();
    
    // We need to store both names to pass them to the Event Handler
    private String winnerTeam;
    private String loserTeam;

    //Accept both winner AND loser
    public TossResultFrame(String winnerName, String loserName) {
        winnerTeam = winnerName;
        loserTeam = loserName;
        
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setTitle("Toss Result");
        getContentPane().setBackground(new Color(244, 240, 228));
        setResizable(false);
        ImageIcon favicon = new ImageIcon(getClass().getResource("/Images/favicon3.png"));
        setIconImage(favicon.getImage());

        winnerLabel = LabelStyling.StyleWinnerLabel(winnerName + " won the toss!");

        add(title);
        add(winnerLabel);
        add(batButton);
        add(bowlButton);

        EventHandling event = new EventHandling(this, winnerTeam, loserTeam);
        batButton.addMouseListener(event);
        bowlButton.addMouseListener(event);
    }
    //getters
    public JButton getBatButton() {
        return batButton;
    }
    public JButton getBowlButton() {
        return bowlButton;
    }

    public void display() {
        setVisible(true);
    }
}