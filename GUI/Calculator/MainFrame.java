package GUI.Calculator;

import javax.swing.*;
import java.awt.*;

import GUI.Calculator.Styling.ButtonStyling;

public class MainFrame extends JFrame{

    private JTextField text = new JTextField("");
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    private JButton add,subtract,divide,multiply;
    private JButton AC,decimal,clearOne,equal;


    public MainFrame(){
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setSize(465,712);
        setTitle("Calculator");
        // getContentPane().setBackground(new Color(200,123,231));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        text.setBounds(0,0,450,112);
        text.setFont(new Font("Roboto Condensed", Font.BOLD, 50));
        text.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        text.setHorizontalAlignment(JTextField.RIGHT);
        // text.setEditable(false);
        text.setFocusable(false);

        btn1 = ButtonStyling.arithmeticOp("1", 0, 448);
        btn2 = ButtonStyling.arithmeticOp("2", 112, 448);
        btn3 = ButtonStyling.arithmeticOp("3", 224, 448);
        btn4 = ButtonStyling.arithmeticOp("4", 0, 336);
        btn5 = ButtonStyling.arithmeticOp("5", 112, 336);
        btn6 = ButtonStyling.arithmeticOp("6", 224, 336);
        btn7 = ButtonStyling.arithmeticOp("7", 0, 224);
        btn8 = ButtonStyling.arithmeticOp("8", 112, 224);
        btn9 = ButtonStyling.arithmeticOp("9", 224, 224);
        btn0 = ButtonStyling.zero("0", 0, 560);
        add = ButtonStyling.arithmeticOp("+", 336, 112);
        subtract = ButtonStyling.arithmeticOp("-", 336, 224);
        divide = ButtonStyling.arithmeticOp("/", 336, 448);
        multiply = ButtonStyling.arithmeticOp("x", 336, 336);
        AC = ButtonStyling.arithmeticOp("AC", 0, 112);
        decimal = ButtonStyling.arithmeticOp(".", 112, 112);
        clearOne = ButtonStyling.arithmeticOp("CO", 224, 112);
        equal = ButtonStyling.arithmeticOp("=", 336, 560);

        EventHandling mouseClick = new EventHandling(this);
        btn0.addMouseListener(mouseClick);
        btn1.addMouseListener(mouseClick);
        btn2.addMouseListener(mouseClick);
        btn3.addMouseListener(mouseClick);
        btn4.addMouseListener(mouseClick);
        btn5.addMouseListener(mouseClick);
        btn6.addMouseListener(mouseClick);
        btn7.addMouseListener(mouseClick);
        btn8.addMouseListener(mouseClick);
        btn9.addMouseListener(mouseClick);

        AC.addMouseListener(mouseClick);
        clearOne.addMouseListener(mouseClick);
        decimal.addMouseListener(mouseClick);
        multiply.addMouseListener(mouseClick);
        divide.addMouseListener(mouseClick);
        add.addMouseListener(mouseClick);
        subtract.addMouseListener(mouseClick);
        

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
        add(clearOne);
        add(equal);

        setLocationRelativeTo(null);
    }

    public JTextField getText() {
        return text;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public JButton getBtn7() {
        return btn7;
    }

    public JButton getBtn8() {
        return btn8;
    }

    public JButton getBtn9() {
        return btn9;
    }

    public JButton getBtn0() {
        return btn0;
    }

    public JButton getAdd() {
        return add;
    }

    public JButton getSubtract() {
        return subtract;
    }

    public JButton getDivide() {
        return divide;
    }

    public JButton getMultiply() {
        return multiply;
    }

    public JButton getAC() {
        return AC;
    }

    public JButton getDecimal() {
        return decimal;
    }

    public JButton getClearOne() {
        return clearOne;
    }

    public JButton getEqual() {
        return equal;
    }

    public void display(){
        setVisible(true);
    }
}