package MatchMechanics;

import javax.swing.*;

import Event.EventHandling;
import Styling.ButtonStyle;
import Styling.LabelStyling;

import java.awt.*;

public class WicketRuns extends JFrame{
    private JLabel beforeDismissal = LabelStyling.StyleDismissalRuns("Runs before Dismissal");
    private JButton zero = ButtonStyle.StyleDismissalButtons("0",100,80);
    private JButton one = ButtonStyle.StyleDismissalButtons("1",210,80);
    private JButton two = ButtonStyle.StyleDismissalButtons("2",320,80);
    private JButton three = ButtonStyle.StyleDismissalButtons("3",430,80);

    public WicketRuns(){
        setSize(600,200);
        setLayout(null);
        setLocationRelativeTo(null);
        ImageIcon favicon = new ImageIcon(getClass().getResource("/Images/favicon3.png"));
        setIconImage(favicon.getImage());
        setAlwaysOnTop(true);
        setTitle("Dismissal Runs");
        getContentPane().setBackground(new Color(244, 240, 228));
        setResizable(false);
        setAlwaysOnTop(true);

        EventHandling mouseClick = new EventHandling(this);
        zero.addMouseListener(mouseClick);
        one.addMouseListener(mouseClick);
        two.addMouseListener(mouseClick);
        three.addMouseListener(mouseClick);

        add(beforeDismissal);
        add(zero);
        add(one);
        add(two);
        add(three);
    }

    public JLabel getBeforeDismissal() {
        return beforeDismissal;
    }

    public JButton getZero() {
        return zero;
    }

    public JButton getOne() {
        return one;
    }

    public JButton getTwo() {
        return two;
    }

    public JButton getThree() {
        return three;
    }

    public void display(){
        setVisible(true);
    }
}
