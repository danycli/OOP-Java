package GUI.Program2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventHandling extends MouseAdapter {
    
    Frame frame;

    public EventHandling(Frame f){
        frame = f;
    }

    @Override
    public void mouseClicked(MouseEvent m){
        if(m.getSource() == frame.getSum()){
            int x = Integer.parseInt(frame.getN1().getText());
            int y = Integer.parseInt(frame.getN2().getText());
            int Sum = x + y;
            frame.setResultField(Integer.toString(Sum));
        }else if(m.getSource() == frame.getProduct()){
            int x = Integer.parseInt(frame.getN1().getText());
            int y = Integer.parseInt(frame.getN2().getText());
            int pro = x * y;
            frame.setResultField(Integer.toString(pro));
        }else if(m.getSource() == frame.getClear()){
            frame.getN1().setText(null);
            frame.getN2().setText(null);
            frame.setResultField(null);
        }else{
            frame.dispose();
        }
    }
}
