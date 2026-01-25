package ImportMannually;

import java.awt.*;
import javax.swing.*;

//My Own Imports
import Event.EventHandling;
import Styling.ButtonStyle;
import Styling.LabelStyling;
import Styling.StyleTextField;

public class PlayersEntry extends JFrame{

    private JLabel playerEntry = LabelStyling.StyleImportTeam("   Players Entry");
    private JLabel PlayerName = LabelStyling.StyleTeamName("Enter Player Name:");
    private JLabel ErrorMessage = LabelStyling.StyleErrorMessage("");// keep it empty bcz we have two diff error messages

    private JTextField PName = StyleTextField.StyleTName();

    private JButton next = ButtonStyle.StyleNext("Next");
    private JButton finish = ButtonStyle.StyleFinish("Finish");
    

    public PlayersEntry(String teamName){
        setSize(400,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        getContentPane().setBackground(new Color(244, 240, 228));
        setTitle("Importing Manually");
        ImageIcon favicon = new ImageIcon(getClass().getResource("/Images/favicon3.png"));
        setIconImage(favicon.getImage());
        setResizable(false);

        EventHandling mouseClick = new EventHandling(this,teamName);
        next.addMouseListener(mouseClick);
        finish.addMouseListener(mouseClick);

        //adding components
        add(playerEntry);
        add(PlayerName);
        add(PName);
        add(next);
        add(ErrorMessage);
        add(finish);
        
        ErrorMessage.setVisible(false);
    }

    // Getters

    public JTextField getPName() {
        return PName;
    }
    public JButton getNext() {
        return next;
    }
    public JButton getFinish() {
        return finish;
    }

    // Setting Error Message
    public void setErrorMessage(String text) {
        ErrorMessage.setText(text);
    }

    //Error Visibility
    public void setErrorVisibility(boolean b){
        ErrorMessage.setVisible(b);
    }
    public void display(){
        setVisible(true);
    }
}
