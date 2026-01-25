package MatchMechanics;

import javax.swing.*;
import java.awt.*;
import Styling.ButtonStyle;
import Styling.LabelStyling;
import Event.EventHandling;

public class ScoreBoardFrame extends JFrame {

    // Labels
    private JLabel scoreLabel;

    private JLabel batsmenHeader = LabelStyling.StyleSubHeader("Batsmen", 150, 140);
    private JLabel bowlerHeader = LabelStyling.StyleSubHeader("Bowler", 650, 140);

    private JLabel strikerLabel;
    private JLabel nonStrikerLabel;
    private JLabel currentBowlerLabel;

    // Controls
    private JButton btn1, btn2, btn3, btn4, btn6;
    private JButton btnWicket, btnWide, btnNoBall, btnDot;
    private JButton btnEndOver, btnSwap;

    // Team Names
    private String battingTeamName;
    private String bowlingTeamName;

    // Innings tracking
    private int inningsNumber = 1;
    private int firstInningsScore = 0;
    private String firstInningsTeam = "";

    // 1st innings
    public ScoreBoardFrame(String battingTeam, String bowlingTeam) {
        battingTeamName = battingTeam;
        bowlingTeamName = bowlingTeam;
        inningsNumber = 1;
        setupFrame();
    }

    // 2nd innings
    public ScoreBoardFrame(String battingTeam, String bowlingTeam, int firstScore, String firstTeam) {
        battingTeamName = battingTeam;
        bowlingTeamName = bowlingTeam;
        inningsNumber = 2;
        firstInningsScore = firstScore;
        firstInningsTeam = firstTeam;
        setupFrame();
    }

    private void setupFrame() {
        setSize(1000, 800);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Live Score - " + battingTeamName + " vs " + bowlingTeamName);
        getContentPane().setBackground(new Color(244, 240, 228));
        setResizable(false);
        ImageIcon favicon = new ImageIcon(getClass().getResource("/Images/favicon3.png"));
        setIconImage(favicon.getImage());

        scoreLabel = LabelStyling.StyleMainScore(battingTeamName + ": 0/0 (0.0 Overs)");
        strikerLabel = LabelStyling.StylePlayerText("Player 1 * 0(0)", 150, 180);
        nonStrikerLabel = LabelStyling.StylePlayerText("Player 2     0(0)", 150, 220);
        currentBowlerLabel = LabelStyling.StylePlayerText("Bowler 1    0/0 (0.0)", 650, 180);

        btn1 = ButtonStyle.StyleRunButton("1", 210, 430);
        btn2 = ButtonStyle.StyleRunButton("2", 300, 430);
        btn3 = ButtonStyle.StyleRunButton("3", 390, 430);
        btn4 = ButtonStyle.StyleRunButton("4", 480, 430);
        btn6 = ButtonStyle.StyleRunButton("6", 570, 430);

        btnWicket = ButtonStyle.StyleControlButton("Wicket", 210, 500);
        btnWide = ButtonStyle.StyleControlButton("Wide", 320, 500);
        btnNoBall = ButtonStyle.StyleControlButton("No-ball", 430, 500);
        btnDot = ButtonStyle.StyleControlButton("Dot", 540, 500);

        btnEndOver = ButtonStyle.StyleEndOverButton();
        btnSwap = ButtonStyle.StyleSwapButton();

        add(scoreLabel);
        add(batsmenHeader);
        add(bowlerHeader);
        add(strikerLabel);
        add(nonStrikerLabel);
        add(currentBowlerLabel);
        add(btnSwap);

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn6);
        add(btnWicket);
        add(btnWide);
        add(btnNoBall);
        add(btnDot);
        add(btnEndOver);

        EventHandling scoreEvent = new EventHandling(this);

        btn1.addMouseListener(scoreEvent);
        btn2.addMouseListener(scoreEvent);
        btn3.addMouseListener(scoreEvent);
        btn4.addMouseListener(scoreEvent);
        btn6.addMouseListener(scoreEvent);
        btnWicket.addMouseListener(scoreEvent);
        btnWide.addMouseListener(scoreEvent);
        btnNoBall.addMouseListener(scoreEvent);
        btnDot.addMouseListener(scoreEvent);
        btnEndOver.addMouseListener(scoreEvent);
        btnSwap.addMouseListener(scoreEvent);
    }

    // getters
    public JLabel getScoreLabel() {
        return scoreLabel;
    }

    public JLabel getStrikerLabel() {
        return strikerLabel;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public JButton getBtnWicket() {
        return btnWicket;
    }

    public JButton getBtnWide() {
        return btnWide;
    }

    public JButton getBtnNoBall() {
        return btnNoBall;
    }

    public JButton getBtnDot() {
        return btnDot;
    }

    public JButton getBtnEndOver() {
        return btnEndOver;
    }

    public JButton getBtnSwap() {
        return btnSwap;
    }

    public JLabel getNonStrikerLabel() {
        return nonStrikerLabel;
    }

    public JLabel getCurrentBowlerLabel() {
        return currentBowlerLabel;
    }

    public String getBattingTeamName() {
        return battingTeamName;
    }

    public String getBowlingTeamName() {
        return bowlingTeamName;
    }

    public int getInningsNumber() {
        return inningsNumber;
    }

    public int getFirstInningsScore() {
        return firstInningsScore;
    }

    public String getFirstInningsTeam() {
        return firstInningsTeam;
    }

    public void display() {
        setVisible(true);
    }
}