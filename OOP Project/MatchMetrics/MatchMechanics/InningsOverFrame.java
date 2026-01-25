package MatchMechanics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InningsOverFrame extends BasePopupFrame {

    private JLabel titleLabel;
    private JLabel scoreLabel;
    private JLabel messageLabel;
    private JButton startButton;

    private String battingTeam;
    private String bowlingTeam;
    private int finalScore;
    private int finalWickets;
    private int inningsNumber;
    private int firstInningsScore;
    private String firstInningsTeam;

    public InningsOverFrame(String batting, String bowling, int runs, int wickets, int innings, int firstScore,String firstTeam) {
        super("Innings Over", 450, 280);

        battingTeam = batting;
        bowlingTeam = bowling;
        finalScore = runs;
        finalWickets = wickets;
        inningsNumber = innings;
        firstInningsScore = firstScore;
        firstInningsTeam = firstTeam;

        titleLabel = new JLabel("INNINGS OVER");
        titleLabel.setBounds(0, 20, 450, 40);
        titleLabel.setFont(new Font("Roboto Condensed", Font.BOLD, 30));
        titleLabel.setForeground(new Color(52, 77, 46));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        scoreLabel = new JLabel(battingTeam + ": " + finalScore + "/" + finalWickets);
        scoreLabel.setBounds(0, 70, 450, 35);
        scoreLabel.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
        scoreLabel.setForeground(Color.BLACK);
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        String message = (inningsNumber == 1) ? (bowlingTeam + " will bat now") : "Match complete!";
        messageLabel = new JLabel(message);
        messageLabel.setBounds(0, 110, 450, 30);
        messageLabel.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
        messageLabel.setForeground(Color.DARK_GRAY);
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        String buttonText = (inningsNumber == 1) ? "Start 2nd Innings" : "View Result";
        startButton = new JButton(buttonText);
        startButton.setBounds(125, 170, 200, 45);
        startButton.setBackground(new Color(52, 77, 46));
        startButton.setForeground(Color.WHITE);
        startButton.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
        startButton.setFocusPainted(false);
        startButton.setBorderPainted(false);
        startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        startButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();

                if (inningsNumber == 1) {
                    ScoreBoardFrame newFrame = new ScoreBoardFrame(bowlingTeam, battingTeam, finalScore, battingTeam);
                    newFrame.display();
                } else {
                    WinnerFrame winner = new WinnerFrame(firstInningsTeam, firstInningsScore, battingTeam, finalScore);
                    winner.display();
                }
            }
        });

        add(titleLabel);
        add(scoreLabel);
        add(messageLabel);
        add(startButton);
    }
}
