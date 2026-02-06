package MatchMechanics;

import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Styling.ButtonStyle;
import Styling.LabelStyling;

public class ExtraRunsPopup extends JDialog {
    private int selectedRuns = 0;

    public ExtraRunsPopup(JFrame parent, String title, int maxRuns) {
        super(parent, title, true);
        setSize(600, 200);
        setLayout(null);
        setLocationRelativeTo(parent);
        setResizable(false);
        getContentPane().setBackground(new Color(244, 240, 228));

        javax.swing.JLabel heading = LabelStyling.StyleDismissalRuns("Select Extra Runs");
        heading.setBounds(160, 10, 300, 40);
        add(heading);

        int startX = 80;
        int gap = 70;
        for (int i = 0; i <= maxRuns; i++) {
            JButton button = ButtonStyle.StyleDismissalButtons(String.valueOf(i), startX + (gap * i), 90);
            button.setCursor(new Cursor(Cursor.HAND_CURSOR));
            int runValue = i;
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    selectedRuns = runValue;
                    dispose();
                }
            });
            add(button);
        }
    }

    public int getSelectedRuns() {
        return selectedRuns;
    }

    public static int promptRuns(JFrame parent, String title, int maxRuns) {
        ExtraRunsPopup popup = new ExtraRunsPopup(parent, title, maxRuns);
        popup.setVisible(true);
        return popup.getSelectedRuns();
    }
}
