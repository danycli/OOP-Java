package GUI.Calculator;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventHandling extends MouseAdapter{
    
    private MainFrame f;
    public EventHandling(MainFrame frame){
        frame = f;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(f != null && e.getSource() == f.getBtn1()){
                String t = f.getText().getText();
                t = t+"1";
                f.getText().setText(t);
        }
    }

    

}
