package Assignment04.DASHBOARD;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DashboardEventHandling extends MouseAdapter {

    private Dashboard dashboard;
    private PlayFrame play;
    private Stats stats;
    private Settings setting;

    public DashboardEventHandling(Dashboard d){
        dashboard = d;
    }
    public DashboardEventHandling(PlayFrame p){
        play = p;
    }
    public DashboardEventHandling(Stats s){
        stats = s;
    }
    public DashboardEventHandling(Settings s){
        setting = s;
    }
    
    

    @Override
    public void mouseClicked(MouseEvent e){
        if(dashboard != null && e.getSource() == dashboard.getPLay()){
            PlayFrame Play = new PlayFrame();
            Play.display();
            dashboard.dispose();
        }else if(dashboard != null && e.getSource() == dashboard.getViewStats()){
            Stats stats1 = new Stats();
            stats1.display();
            dashboard.dispose();
        }else if(dashboard != null && e.getSource() == dashboard.getSettings()){
            Settings settings = new Settings();
            settings.display();
            dashboard.dispose();
        }else if(setting != null && e.getSource() == setting.getBack()){
            Dashboard dashboard = new Dashboard();
            dashboard.display();
            setting.dispose();
        }else if(play != null && e.getSource() == play.getBack()){
            Dashboard dashboard = new Dashboard();
            dashboard.display();
            play.dispose();
        }else if(stats != null && e.getSource() == stats.getBack()){
            Dashboard dashboard = new Dashboard();
            dashboard.display();
            stats.dispose();
        }
    }
}
