package GUI.Calculator;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{

    private JTextField text = new JTextField("");
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    private JButton add,subtract,divide,multiply;
    private JButton AC,decimal;

    MainFrame(){
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(400,600);
        setTitle("Calculator");
        // setDefaultCloseOperation();


        add(text);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn0);
        add(add);
        add(subtract);
        add(divide);
        add(multiply);
        add(AC);
        add(decimal);
    }
}