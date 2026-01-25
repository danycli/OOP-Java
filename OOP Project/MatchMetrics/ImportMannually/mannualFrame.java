package ImportMannually;

import java.awt.*;
import javax.swing.*;

import Event.EventHandling;
import Styling.ButtonStyle;
import Styling.LabelStyling;
import Styling.StyleTextField;

public class mannualFrame extends JFrame {

    private JLabel importTeam = LabelStyling.StyleImportTeam("Importing A Team");
    private JLabel TeamName = LabelStyling.StyleTeamName("Enter Team Name:");
    private JLabel ErrorMessage = LabelStyling.StyleErrorMessage("");// keep it empty bcz we have two diff error messages

    private JTextField TName = StyleTextField.StyleTName();

    private JButton next = ButtonStyle.StyleNext("Next");

    public mannualFrame() {
        setSize(400, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        getContentPane().setBackground(new Color(244, 240, 228));
        setTitle("Importing Manually");
        ImageIcon favicon = new ImageIcon(getClass().getResource("/Images/favicon3.png"));
        setIconImage(favicon.getImage());
        setResizable(false);

        EventHandling mouseClick = new EventHandling(this);
        next.addMouseListener(mouseClick);

        //Adding Components
        add(importTeam);
        add(TeamName);
        add(TName);
        add(next);
        add(ErrorMessage);

        ErrorMessage.setVisible(false);

    }

    // Getter For Next, TName and error message
    public JButton getNext() {
        return next;
    }

    public JTextField getTName() {
        return TName;
    }

    public JLabel getErrorMessage() {
        return ErrorMessage;
    }

    // Setting Error Message
    public void setErrorMessage(String text) {
        ErrorMessage.setText(text);
    }
    // Error Visibility
    public void setErrorVisibility(boolean b) {
        ErrorMessage.setVisible(b);
    }

    public void display() {
        setVisible(true);
    }
}
