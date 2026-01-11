package GUI.Calculator;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EventHandling extends MouseAdapter{
    
    private MainFrame f;
    public EventHandling(MainFrame frame){
        f = frame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(f != null ){
            if(e.getSource() == f.getBtn1()){
                String t = f.getText().getText();
                t = t+"1";
                f.getText().setText(t);
            }else if(e.getSource() == f.getBtn2()){
                String t = f.getText().getText();
                t = t+"2";
                f.getText().setText(t);
            }else if(e.getSource() == f.getBtn3()){
                String t = f.getText().getText();
                t = t+"3";
                f.getText().setText(t);
            }else if(e.getSource() == f.getBtn4()){
                String t = f.getText().getText();
                t = t+"4";
                f.getText().setText(t);
            }else if(e.getSource() == f.getBtn5()){
                String t = f.getText().getText();
                t = t+"5";
                f.getText().setText(t);
            }else if(e.getSource() == f.getBtn6()){
                String t = f.getText().getText();
                t = t+"6";
                f.getText().setText(t);
            }else if(e.getSource() == f.getBtn7()){
                String t = f.getText().getText();
                t = t+"7";
                f.getText().setText(t);
            }else if(e.getSource() == f.getBtn8()){
                String t = f.getText().getText();
                t = t+"8";
                f.getText().setText(t);
            }else if(e.getSource() == f.getBtn9()){
                String t = f.getText().getText();
                t = t+"9";
                f.getText().setText(t);
            }else if(e.getSource() == f.getBtn0()){
                String t = f.getText().getText();
                t = t+"0";
                f.getText().setText(t);
            }else if(e.getSource() == f.getAC()){
                f.getText().setText("");
            }else if(e.getSource() == f.getClearOne()){
                String t = f.getText().getText();
                String b = "";
                String[] sp = t.split("");
                for(int i = sp.length-2; i >= 0; i--){
                        b = sp[i]+b;
                }
                f.getText().setText(b);
            }else if(e.getSource() == f.getAdd()){
                String t = f.getText().getText();
                t = t+"+";
                f.getText().setText(t);
            }else if(e.getSource() == f.getMultiply()){
                String t = f.getText().getText();
                t = t+"x";
                f.getText().setText(t);
            }else if(e.getSource() == f.getDivide()){
                String t = f.getText().getText();
                t = t+"/";
                f.getText().setText(t);
            }else if(e.getSource() == f.getSubtract()){
                String t = f.getText().getText();
                t = t+"-";
                f.getText().setText(t);
            }else if(e.getSource() == f.getDecimal()){
                String t = f.getText().getText();
                t = t+".";
                f.getText().setText(t);
            }else if(e.getSource() == f.getEqual()){
                //Storing in the arraylist
                String t = f.getText().getText();
                String[] split = t.split("");
                ArrayList<String> equation = new ArrayList<>();
                for(int i = 0; i < split.length; i++){
                    if(split[i].equals("x") || split[i].equals("-") || split[i].equals("/") || split[i].equals("+")){
                        System.out.println("sign found at"+i);
                        for(int j = i-1; j >= 0; j--){
                            System.out.println("Passing through here");
                            if(j >= 0 && split[j].equals("x") || split[j].equals("-") || split[j].equals("/") || split[j].equals("+")){
                                System.out.println("prev sign found at"+j);
                                String num = t.substring(j+1,i);
                                equation.add(num);
                            }else{
                                String nums = t.substring(0, i);
                                equation.add(nums);
                                break;
                            }
                        }
                        for(int z = 0; z < i; z++){
                            if(split[z].equals("x") || split[z].equals("-") || split[z].equals("/") || split[z].equals("+")){
                                String num = t.substring(i+1,z+1);
                                equation.add(num);
                            }
                        }
                        equation.add(split[i]);
                    }
                }
                System.out.println(equation);
                for(int i = 0; i < equation.size(); i++){
                    System.out.println("passing "+i+" time");
                    if(equation.get(i).equals("x")){
                        double prev = Double.parseDouble(equation.get(i-1));
                        System.out.println("get the prev value");
                        double next = Double.parseDouble(equation.get(i+1));
                        System.out.println("get the next value");
                        double result = prev * next;
                        String res = "" + result;
                        equation.remove(i-1);
                        equation.remove(i);
                        // equation.remove(i+1);
                        equation.add(0,res);
                    }else{
                        JOptionPane.showMessageDialog(f,"Not Interested");
                    }
                }
                f.getText().setText("");
                String resultant = "";
                resultant = resultant + equation.get(0);
                f.getText().setText(resultant);
            }
        }
    }
}
