package GUI.Program2;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{
    
    JButton sum = new JButton("Sum");
    JButton product = new JButton("Product");
    JButton clear = new JButton("Clear text");
    JButton exit = new JButton("Exit");

    JTextField n1 = new JTextField("");
    JTextField n2 = new JTextField("");

    JLabel number1 = new JLabel("Number 1");
    JLabel number2 = new JLabel("Number 2");
    JLabel result = new JLabel("Result");
    JTextField resultField = new JTextField("");

    GridLayout g = new GridLayout(5,2);

    public Frame(){
        setLocationRelativeTo(null);
        setTitle("Calculator");
        setSize(400,300);
        
        EventHandling mouseClick = new EventHandling(this);
        sum.addMouseListener(mouseClick);
        product.addMouseListener(mouseClick);
        exit.addMouseListener(mouseClick);
        clear.addMouseListener(mouseClick);

        
        setLayout(g);
        add(number1);
        add(n1);
        add(number2);
        add(n2);
        add(result);
        add(resultField);
        add(sum);
        add(product);
        add(clear);
        add(exit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JButton getSum() {
        return sum;
    }
    public JButton getProduct() {
        return product;
    }
    public JTextField getN1() {
        return n1;
    }
    public JTextField getN2() {
        return n2;
    }
    public void setResultField(String resultField) {
        this.resultField.setText(resultField);
    }
    public JButton getClear() {
        return clear;
    }
    public JButton getExit() {
        return exit;
    }

    public void display(){
        setVisible(true);
    }
}
