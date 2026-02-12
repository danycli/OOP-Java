package Styling;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import Dashboard.GettingTeamNames;

public class StyleComboBox extends GettingTeamNames{
    
    public static JComboBox<String> StyleCBTeamA(){
        ArrayList<String> fileNames = GettingTeamNames.file();
        JComboBox<String> c = new JComboBox<String>(fileNames.toArray(new String[0]));

        c.setForeground(Color.BLACK);
        c.setBounds(600, 255, 200,50);
        c.setBackground(new Color(244, 240, 228));
        c.setBorder(BorderFactory.createLineBorder(new Color(203, 150, 97),10));
        
        return c;
    }

    public static JComboBox<String> StyleCBTeamB(){
        ArrayList<String> fileNames = GettingTeamNames.file();
        JComboBox<String> c = new JComboBox<String>(fileNames.toArray(new String[0]));

        c.setForeground(Color.BLACK);
        c.setBounds(600, 450, 200,50);
        c.setBackground(new Color(244, 240, 228));
        c.setBorder(BorderFactory.createLineBorder(new Color(203, 150, 97),10));

        return c;
    }
}
