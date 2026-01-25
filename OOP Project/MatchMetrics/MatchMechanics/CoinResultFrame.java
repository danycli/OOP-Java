package MatchMechanics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CoinResultFrame extends BasePopupFrame {

    private JLabel titleLabel;
    private JLabel callingCalled;
    private JButton headsButton;
    private JButton tailsButton;

    private String callingTeam;
    private String otherTeam;
    private String callChoice;

    public CoinResultFrame(String caller, String other, String call) {
        super("Coin Toss", 400, 250);

        callingTeam = caller;
        otherTeam = other;
        callChoice = call;

        //didn't do the styling for them in styling package separately as well as event handling 
        // Title Label
        titleLabel = new JLabel("SELECT COIN RESULT");
        titleLabel.setBounds(0, 20, 400, 40);
        titleLabel.setFont(new Font("Roboto Condensed", Font.BOLD, 26));
        titleLabel.setForeground(new Color(52, 77, 46));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //Which team was calling and what they called
        callingCalled = new JLabel(callingTeam + " called " + callChoice);
        callingCalled.setBounds(0, 70, 400, 30);
        callingCalled.setFont(new Font("Roboto Condensed", Font.PLAIN, 18));
        callingCalled.setForeground(Color.DARK_GRAY);
        callingCalled.setHorizontalAlignment(SwingConstants.CENTER);

        // Heads Button
        headsButton = new JButton("HEADS");
        headsButton.setBounds(50, 130, 130, 50);
        headsButton.setBackground(new Color(52, 77, 46));
        headsButton.setForeground(Color.WHITE);
        headsButton.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
        headsButton.setFocusPainted(false);
        headsButton.setBorderPainted(false);
        headsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Tails Button
        tailsButton = new JButton("TAILS");
        tailsButton.setBounds(220, 130, 130, 50);
        tailsButton.setBackground(new Color(52, 77, 46));
        tailsButton.setForeground(Color.WHITE);
        tailsButton.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
        tailsButton.setFocusPainted(false);
        tailsButton.setBorderPainted(false);
        tailsButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        headsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                handleResult("Heads");
            }
        });

        tailsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                handleResult("Tails");
            }
        });

        add(titleLabel);
        add(callingCalled);
        add(headsButton);
        add(tailsButton);
    }

    private void handleResult(String coinResult) {
        dispose();

        String winner;
        String loser;

        //Toss wining logic
        if (callChoice.equals(coinResult)) {
            winner = callingTeam;
            loser = otherTeam;
        } else {
            winner = otherTeam;
            loser = callingTeam;
        }

        TossResultFrame resultFrame = new TossResultFrame(winner, loser);
        resultFrame.display();
    }
}
