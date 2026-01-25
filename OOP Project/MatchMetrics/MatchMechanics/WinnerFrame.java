package MatchMechanics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Dashboard.Dashboard;

public class WinnerFrame extends BasePopupFrame {

    private JLabel titleLabel;
    private JLabel winnerLabel;
    private JLabel scoreLabel;
    private JButton homeButton;

    public WinnerFrame(String team1, int team1Runs, String team2, int team2Runs) {
        super("Match Result", 500, 320);

        String winnerTeam;
        String resultText;

        if (team1Runs > team2Runs) {
            winnerTeam = team1;
            int margin = team1Runs - team2Runs;
            resultText = winnerTeam + " wins by " + margin + " runs!";
        } else if (team2Runs > team1Runs) {
            winnerTeam = team2;
            int margin = team2Runs - team1Runs;
            resultText = winnerTeam + " wins by " + margin + " runs!";
        } else {
            winnerTeam = "TIE";
            resultText = "Match Tied!";
        }

        titleLabel = new JLabel("MATCH RESULT");
        titleLabel.setBounds(0, 20, 500, 40);
        titleLabel.setFont(new Font("Roboto Condensed", Font.BOLD, 32));
        titleLabel.setForeground(new Color(52, 77, 46));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        winnerLabel = new JLabel(resultText);
        winnerLabel.setBounds(0, 80, 500, 40);
        winnerLabel.setFont(new Font("Roboto Condensed", Font.BOLD, 26));
        winnerLabel.setForeground(Color.BLACK);
        winnerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        scoreLabel = new JLabel(team1 + ": " + team1Runs + "  |  " + team2 + ": " + team2Runs);
        scoreLabel.setBounds(0, 130, 500, 35);
        scoreLabel.setFont(new Font("Roboto Condensed", Font.PLAIN, 20));
        scoreLabel.setForeground(Color.DARK_GRAY);
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        homeButton = new JButton("Back to Home");
        homeButton.setBounds(150, 200, 200, 50);
        homeButton.setBackground(new Color(52, 77, 46));
        homeButton.setForeground(Color.WHITE);
        homeButton.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
        homeButton.setFocusPainted(false);
        homeButton.setBorderPainted(false);
        homeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        homeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                Dashboard dashboard = new Dashboard();
                dashboard.display();
            }
        });

        add(titleLabel);
        add(winnerLabel);
        add(scoreLabel);
        add(homeButton);
    }
}
