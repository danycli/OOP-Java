package MatchMechanics;

import javax.swing.*;
import java.awt.*;

public abstract class BasePopupFrame extends JFrame {

    // Common setup for all popup frames
    public BasePopupFrame(String title, int width, int height) {
        setSize(width, height);
        setLayout(null);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setTitle(title);
        getContentPane().setBackground(new Color(244, 240, 228));
        setResizable(false);
        ImageIcon favicon = new ImageIcon(getClass().getResource("/Images/favicon3.png"));
        setIconImage(favicon.getImage());
        setAlwaysOnTop(true);
    }

    public void display() {
        setVisible(true);
    }
}
