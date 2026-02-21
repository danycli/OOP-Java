package Assignment04.DASHBOARD;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Assignment04.LOGIN.LogIn;

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
            PlayFrame play1 = new PlayFrame(dashboard.getUN(), dashboard.getPass());
            play1.display();
            dashboard.dispose();
        }else if(dashboard != null && e.getSource() == dashboard.getViewStats()){
            Stats stats1 = new Stats(dashboard.getUN(), dashboard.getPass());
            stats1.display();
            dashboard.dispose();
        }else if(dashboard != null && e.getSource() == dashboard.getSettings()){
            Settings setting1 = new Settings(dashboard.getUN(), dashboard.getPass());
            setting1.display();
            dashboard.dispose();
        }else if(dashboard != null && e.getSource() == dashboard.getBackToLogin()){
            LogIn login1 = new LogIn(dashboard.getUN(), dashboard.getPass());
            login1.display();
            dashboard.dispose();
        }else if(setting != null && e.getSource() == setting.getBack()){
            Dashboard dashboard1 = new Dashboard(setting.getUN(),setting.getPass());
            dashboard1.display();
            setting.dispose();
        }else if(play != null && e.getSource() == play.getBack()){
            Dashboard dashboard1 = new Dashboard(play.getName(),play.getPass());
            dashboard1.display();
            play.dispose();
        }else if(stats != null && e.getSource() == stats.getBack()){
            Dashboard dashboard1 = new Dashboard(stats.getUN(),stats.getPass());
            dashboard1.display();
            stats.dispose();
        }
    }
}
