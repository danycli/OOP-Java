package Assignment04.DASHBOARD;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DashboardEventHandling extends MouseAdapter {
    private Dashboard dashboard;
    private PlayFrame play;

    public DashboardEventHandling(Dashboard d){
        dashboard = d;
    }
    public DashboardEventHandling(PlayFrame p){
        play = p;
    }

    @Override
    public void mouseClicked(MouseEvent e){
        if(e.getSource() == dashboard.getPLay()){
            PlayFrame play = new PlayFrame();
            play.display();
            dashboard.dispose();
        }else if(e.getSource() == play.getBack()){

        }
    }
}
