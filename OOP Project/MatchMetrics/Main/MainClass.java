package Main;
import Dashboard.Dashboard;
import MatchMechanics.WicketRuns;

public class MainClass {
    public static void main(String [] args){
        Dashboard dashboard = new Dashboard();
        dashboard.display();
        // WicketRuns runsBeforeDismissal = new WicketRuns();
        // runsBeforeDismissal.display();
    }
}