package ToDoList;

import java.awt.*;
import javax.swing.*;

public class Dashboard extends JFrame{
    JButton addTask = new JButton("Add new Task");
    JLabel motivation = new JLabel("Do What You Have to");
    JRadioButton checkOn = new JRadioButton("Done");
    JRadioButton checkOff = new JRadioButton("Fail to do");

    GridBagLayout grid = new GridBagLayout();
    Dashboard(){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        // setSize(screen.width / 2, screen.height / 2);
        setLocation((int)(screen.width / 3.5), (int)(screen.height / 3.5));
        pack();
        setMinimumSize(new Dimension(600, 400));
        setLayout(grid);
        add(addTask);
        add(checkOn);
        add(checkOff);
        add(motivation);

        addTask.setPreferredSize(new Dimension(140,30));
        

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void display(){
        setVisible(true);
    }
}
