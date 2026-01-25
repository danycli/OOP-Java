package Dashboard;

import java.awt.*;
import javax.swing.*;

//My own imports
import Event.EventHandling;
import Styling.ButtonStyle;
import Styling.LabelStyling;
import Styling.StyleComboBox;

public class Dashboard extends JFrame {
    private JLabel MatchMetrics = LabelStyling.StyleMatchMetrics("MATCH METRICS");
    private JLabel dummyA = LabelStyling.StyleDummyA();// the dummys are for the rectangular boxes in this frame
    private JLabel dummyB = LabelStyling.StyleDummyB();

    private JLabel TeamASelection = LabelStyling.StyleSelectA("<html>Team A Selection<br><br><br>Select Team A :</html>");
    private JLabel TeamBSelection = LabelStyling.StyleSelectB("<html>Team B Selection<br><br><br>Select Team B :</html>");

    private JButton addManually = ButtonStyle.StyleAddMannually("Add Team Mannually");
    private JButton importTeam = ButtonStyle.StyleImportTeam("Import Team");
    private JButton StartMatch = ButtonStyle.StyleStartMatch("START MATCH");

    // Combo Boxes are for the dropdown of the teams we have
    private JComboBox<String> teamA = StyleComboBox.StyleCBTeamA();

    private JComboBox<String> teamB = StyleComboBox.StyleCBTeamB();

    // this button is for refreshing whenever we add new team it didnt load so we
    // have to refresh it evry single time we add new team
    ImageIcon refresh1 = new ImageIcon(getClass().getResource("/Images/Refresh.png"));
    private JButton refresh = ButtonStyle.StyleRefresh(refresh1);

    //Constructor
    public Dashboard() {
        // Frame design
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setTitle("Match Metrics");
        ImageIcon favicon = new ImageIcon(getClass().getResource("/Images/favicon3.png"));
        setIconImage(favicon.getImage());
        setResizable(false);
        setLayout(null);
        getContentPane().setBackground(new Color(244, 240, 228));
        setLayout(null);

        EventHandling mouseClick = new EventHandling(this);
        addManually.addMouseListener(mouseClick);
        importTeam.addMouseListener(mouseClick);
        refresh.addMouseListener(mouseClick);
        StartMatch.addMouseListener(mouseClick);
        // Labels
        add(MatchMetrics);
        add(dummyA);
        add(TeamASelection);
        add(dummyB);
        add(TeamBSelection);
        // Buttons
        add(addManually);
        add(importTeam);
        add(StartMatch);
        add(refresh);
        // DropDownBoxes
        add(teamA);
        add(teamB);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Getters
    public JButton getAddManually() {
        return addManually;
    }

    public JButton getImportTeam() {
        return importTeam;
    }

    public JButton getStartMatch() {
        return StartMatch;
    }

    public JButton getRefresh() {
        return refresh;
    }

    public JComboBox<String> getTeamA() {
        return teamA;
    }

    public JComboBox<String> getTeamB() {
        return teamB;
    }

    public void display() {
        setVisible(true);
    }
}
