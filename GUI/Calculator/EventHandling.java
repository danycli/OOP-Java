package GUI.Calculator;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
                
            }
        }
    }
}
