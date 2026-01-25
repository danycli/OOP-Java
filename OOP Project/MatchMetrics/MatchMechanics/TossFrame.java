package MatchMechanics;

import javax.swing.*;
import java.awt.*;

import Event.EventHandling;

import Styling.ButtonStyle;
import Styling.LabelStyling;
import Styling.StyleRadioButton;
// You will likely need EventHandling later

public class TossFrame extends JFrame {

    // Labels
    private JLabel title = LabelStyling.StyleTossTitle("TOSS TIME");
    private JLabel whoCallsLabel = LabelStyling.StyleWhoCalls("Who will call?");
    private JLabel callLabel = LabelStyling.StyleCallChoice("Call:");

    // Radio Buttons
    private JRadioButton teamAButton;
    private JRadioButton teamBButton;
    private ButtonGroup teamGroup;

    private JRadioButton headsButton = StyleRadioButton.StyleRadioHeads();
    private JRadioButton tailsButton = StyleRadioButton.StyleRadioTails();
    private ButtonGroup callGroup;

    // Button
    private JButton tossButton = ButtonStyle.StyleTossButton("TOSS");

    public TossFrame(String teamAName, String teamBName) {
        // Frame Setup
        setSize(400, 350);
        setLayout(null);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        getContentPane().setBackground(new Color(244, 240, 228));
        setTitle("Toss Time");
        setResizable(false);
        ImageIcon favicon = new ImageIcon(getClass().getResource("/Images/favicon3.png"));
        setIconImage(favicon.getImage());

        teamAButton = StyleRadioButton.StyleRadioTeamA(teamAName);
        teamBButton = StyleRadioButton.StyleRadioTeamB(teamBName);

        // Grouping radio buttons
        teamGroup = new ButtonGroup();
        teamGroup.add(teamAButton);
        teamGroup.add(teamBButton);

        callGroup = new ButtonGroup();
        callGroup.add(headsButton);
        callGroup.add(tailsButton);

        // Adding Components
        add(title);
        add(whoCallsLabel);
        add(teamAButton);
        add(teamBButton);
        add(callLabel);
        add(headsButton);
        add(tailsButton);
        add(tossButton);
        
        EventHandling tossEvent = new EventHandling(this, teamAName, teamBName);
        tossButton.addMouseListener(tossEvent);
    }
    //getters
    public JButton getTossButton() {
        return tossButton;
    }
    public String getCallingTeam() {
        if(teamAButton.isSelected()){
            return teamAButton.getText();
        } else {
            return teamBButton.getText();
        }
    }
    public String getCallChoice() {
        if(headsButton.isSelected()){
            return "Heads";
        } else {
            return "Tails";
        }
    }

    public void display() {
        setVisible(true);
    }
}