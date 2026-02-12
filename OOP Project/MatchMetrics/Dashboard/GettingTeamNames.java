package Dashboard;

import java.io.File;
import java.util.ArrayList;

public class GettingTeamNames {

    //this method is basically for getting all the files names in the team folder later used in the event 
    // handilng to check out for the same team selection when start match button is pressed as well for checking the same 
    //name enter by the user for their team name while entering team manually
    public static ArrayList<String> file() {
        ArrayList<String> fileNames = new ArrayList<>();

        String folderName = new File("").getAbsolutePath() + File.separator + "OOP Project/MatchMetrics/Teams";
        File folder = new File(folderName);
        File[] file = folder.listFiles();

        if(file != null){
            for(int i = 0 ; i < file.length; i++){
                String name = file[i].getName();
                name = name.replace(".txt", "");
                fileNames.add(name);
            }
        }
        return fileNames;
    }
}
