package MatchMechanics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupFrame extends BasePopupFrame {

    private JLabel titleLabel;
    private JLabel messageLabel;
    private JButton okButton;

    public PopupFrame(String title, String message, Color titleColor) {
        super(title, 350, 200);

        // Title Label
        titleLabel = new JLabel(title);
        titleLabel.setBounds(0, 20, 350, 40);
        titleLabel.setFont(new Font("Roboto Condensed", Font.BOLD, 30));
        titleLabel.setForeground(titleColor);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Message Label
        messageLabel = new JLabel("<html><center>" + message + "</center></html>");
        messageLabel.setBounds(20, 60, 310, 50);
        messageLabel.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
        messageLabel.setForeground(Color.BLACK);
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // OK Button
        okButton = new JButton("OK");
        okButton.setBounds(125, 120, 100, 35);
        okButton.setBackground(new Color(52, 77, 46));
        okButton.setForeground(Color.WHITE);
        okButton.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
        okButton.setFocusPainted(false);
        okButton.setBorderPainted(false);
        okButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        okButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                // if(titleLabel.getText().equals("WICKET!")){
                //     WicketRuns runsBeforeDismissal = new WicketRuns();
                //     runsBeforeDismissal.display();
                // }
            }
        });

        add(titleLabel);
        add(messageLabel);
        add(okButton);
    }
}
