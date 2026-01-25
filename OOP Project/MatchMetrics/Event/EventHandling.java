package Event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//For File Handling
import java.io.BufferedReader;//line by line
import java.io.File;//files
import java.io.FileReader;//Characters input
import java.io.FileWriter;//Characters output
import java.io.IOException;//input/output Error Handling
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;//paths
import java.nio.file.StandardCopyOption;//copying
import javax.swing.JFileChooser;//window dialogue
import javax.swing.filechooser.FileNameExtensionFilter;

import java.util.ArrayList;//for players list

//My Own Imports
import Dashboard.Dashboard;
import Dashboard.GettingTeamNames;
import ImportMannually.PlayersEntry;
import ImportMannually.mannualFrame;
import MatchMechanics.CoinResultFrame;
import MatchMechanics.InningsOverFrame;
import MatchMechanics.PopupFrame;
import MatchMechanics.ScoreBoardFrame;
import MatchMechanics.TossFrame;
import MatchMechanics.TossResultFrame;
import MatchMechanics.WicketRuns;
import MatchMechanics.WinnerFrame;

public class EventHandling extends MouseAdapter {
    //the frames of which components are handling
    private Dashboard dashboard;
    private mannualFrame mannual;
    private PlayersEntry entry;
    private TossFrame tossFrame;
    private TossResultFrame tossResultFrame;
    private ScoreBoardFrame scoreFrame;
    private WicketRuns wicketRuns;


    private int playersCount = 0;//Player count while adding team players mannually
    private String teamName;//Use to store the team name which user create manually
    private String teamA;//The team the user will select at the begining 
    private String teamB;
    private String loserTeam;

    // Scoring State
    private int totalRuns = 0;
    private int totalWickets = 0;
    private int ballsBowled = 0;

    // Player Tracking
    private ArrayList<String> battingPlayers = new ArrayList<>();
    private ArrayList<String> bowlingPlayers = new ArrayList<>();
    private int strikerIndex = 0;
    private int nonStrikerIndex = 1;
    private int nextBatsmanIndex = 2;
    private int currentBowlerIndex = 0;
    private boolean wic = false;


    // Individual Stats
    private int strikerRuns = 0;
    private int strikerBalls = 0;
    private int nonStrikerRuns = 0;
    private int nonStrikerBalls = 0;
    private int bowlerRuns = 0;
    private int bowlerWickets = 0;
    private int bowlerBalls = 0;

    // Constructors
    public EventHandling(Dashboard d) {
        dashboard = d;
    }
    public EventHandling(mannualFrame m) {
        mannual = m;
    }
    public EventHandling(PlayersEntry e, String name) {
        entry = e;
        teamName = name;
    }
    public EventHandling(TossFrame tf, String tA, String tB) {
        tossFrame = tf;
        teamA = tA;
        teamB = tB;
    }
    public EventHandling(TossResultFrame trf, String winner, String loser) {
        tossResultFrame = trf;
        teamName = winner;
        loserTeam = loser;
    }
    public EventHandling(ScoreBoardFrame sb) {
        scoreFrame = sb;
        battingPlayers = loadPlayersFromFile(sb.getBattingTeamName());
        bowlingPlayers = loadPlayersFromFile(sb.getBowlingTeamName());
        updatePlayerLabels();
    }
    public EventHandling(WicketRuns w){
        wicketRuns = w;
    }

    //Storing players in ArrayList
    private ArrayList<String> loadPlayersFromFile(String teamName) {
        ArrayList<String> players = new ArrayList<>();
        try {
            String fileLocation = new File("").getAbsolutePath() + File.separator + "MatchMetrics/Teams/"+teamName+".txt";
            BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
            String line;
            while ((line = reader.readLine()) != null) {
                if (!(line.trim().isEmpty())) {
                    players.add(line.trim());
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading team file: " + teamName);
        }
        return players;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Import Team
        if (dashboard != null && e.getSource() == dashboard.getImportTeam()) {
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files (*.txt)", "txt");
            fileChooser.setFileFilter(filter);
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String folderLocation = new File("").getAbsolutePath() + File.separator + "MatchMetrics/Teams/";
                Path destinationPath = Paths.get(folderLocation,selectedFile.getName());
                try {
                    Files.copy(selectedFile.toPath(), destinationPath, StandardCopyOption.REPLACE_EXISTING);
                    PopupFrame successPopup = new PopupFrame("Success", "Team imported successfully!",new java.awt.Color(0, 128, 0));
                    successPopup.display();
                } catch (IOException I) {
                    System.out.println("Error importing file");
                }
            }
        }

        //Add Manually
        else if (dashboard != null && e.getSource() == dashboard.getAddManually()) {
            mannualFrame frame = new mannualFrame();
            frame.display();
        }
        
        //Start Match
        else if (dashboard != null && e.getSource() == dashboard.getStartMatch()) {
            String tA = (String) dashboard.getTeamA().getSelectedItem();
            String tB = (String) dashboard.getTeamB().getSelectedItem();

            if (tA == null || tB == null || tA.equals(tB)) {
                PopupFrame errorPopup = new PopupFrame("Error", "Select two different teams first",new java.awt.Color(180, 0, 0));
                errorPopup.display();
            } else {
                TossFrame toss = new TossFrame(tA, tB);
                toss.display();
                dashboard.dispose();
            }
        }

        //Next Button(Manal frame)
        else if (dashboard == null && mannual != null && e.getSource() == mannual.getNext()) {
            boolean b = false;
            if (mannual.getTName().getText().trim().isEmpty()) {
                b = true;
                mannual.setErrorMessage("Enter a proper Name!");
                mannual.setErrorVisibility(true);
            } else {
                ArrayList<String> check = GettingTeamNames.file();
                for (int i = 0; i < check.size(); i++) {
                    if (check.get(i).equals(mannual.getTName().getText().trim())) {
                        b = true;
                        mannual.setErrorMessage("Team already Exist!");
                        mannual.setErrorVisibility(true);
                        break;
                    }
                }
            }
            if (b != true) {
                mannual.setErrorVisibility(false);
            }
            //Creating new file with users custom name
            if (!(mannual.getTName().getText().equals("")) && b != true){
                String justTheName = mannual.getTName().getText().trim() + ".txt";
                String teamFolder = new File("").getAbsolutePath() + File.separator + "MatchMetrics/Teams";
                File fileFolder = new File(teamFolder);
                File file = new File(fileFolder, justTheName);
                try {
                    fileFolder.mkdirs();
                    file.createNewFile();
                    teamName = justTheName;
                    mannual.dispose();
                    PlayersEntry p = new PlayersEntry(justTheName);
                    p.display();
                } catch (IOException e1) {
                    System.out.println("Something Went Wrong");
                }
            }
        }

        //Refreshing the dashboard
        else if (dashboard != null && e.getSource() == dashboard.getRefresh()) {
            dashboard.dispose();
            Dashboard d = new Dashboard();
            d.display();
        }

        //Next Button(Players entry frame)
        else if (entry != null && e.getSource() == entry.getNext()) {
            if (entry.getPName().getText().trim().equals("")) {
                entry.setErrorMessage("Enter a proper Name!");
                entry.setErrorVisibility(true);
            } else {
                String fileName = new File("").getAbsolutePath() + File.separator + "MatchMetrics/Teams/"+teamName;
                try (FileWriter writeNames = new FileWriter(fileName, true)) {
                    writeNames.write(entry.getPName().getText() + "\n");
                    playersCount++;
                    entry.getPName().setText("");
                    entry.setErrorVisibility(false);
                } catch (IOException r) {
                    System.out.println("Something Went Wrong");
                }
            }
        }

        //Finish Button
        else if (entry != null && e.getSource() == entry.getFinish()) {
            if (playersCount < 11) {
                entry.setErrorMessage("Insufficient Players");
                entry.setErrorVisibility(true);
            } else {
                entry.dispose();
            }
        }

        //toss button
        else if (tossFrame != null && e.getSource() == tossFrame.getTossButton()) {
            String caller = tossFrame.getCallingTeam();
            String call = tossFrame.getCallChoice();
            String other = caller.equals(teamA) ? teamB : teamA;

            tossFrame.dispose();

            //manual toss 
            CoinResultFrame coinFrame = new CoinResultFrame(caller, other, call);
            coinFrame.display();
        }

        //bat/bowl logic
        else if (tossResultFrame != null) {
            String battingTeam = "";
            String bowlingTeam = "";

            if (e.getSource() == tossResultFrame.getBatButton()) {
                battingTeam = teamName;
                bowlingTeam = loserTeam;

                tossResultFrame.dispose();
                ScoreBoardFrame sb = new ScoreBoardFrame(battingTeam, bowlingTeam);
                sb.display();
            } else if (e.getSource() == tossResultFrame.getBowlButton()) {
                battingTeam = loserTeam;
                bowlingTeam = teamName;

                tossResultFrame.dispose();
                ScoreBoardFrame sb = new ScoreBoardFrame(battingTeam, bowlingTeam);
                sb.display();
            }
        }

        // ScoreBoard logic
        else if (scoreFrame != null) {
            boolean validBall = false;
            int runsScored = 0;

            // Run buttons
            if (e.getSource() == scoreFrame.getBtn1()) {
                runsScored = 1;
                validBall = true;
            } else if (e.getSource() == scoreFrame.getBtn2()) {
                runsScored = 2;
                validBall = true;
            } else if (e.getSource() == scoreFrame.getBtn3()) {
                runsScored = 3;
                validBall = true;
            } else if (e.getSource() == scoreFrame.getBtn4()) {
                runsScored = 4;
                validBall = true;
                PopupFrame fourPopup = new PopupFrame("FOUR!", "Brilliant shot!", new java.awt.Color(0, 128, 0));
                fourPopup.display();
            } else if (e.getSource() == scoreFrame.getBtn6()) {
                runsScored = 6;
                validBall = true;
                PopupFrame sixPopup = new PopupFrame("SIX!", "That's massive!", new java.awt.Color(128, 0, 128));
                sixPopup.display();
            } else if (e.getSource() == scoreFrame.getBtnDot()) {
                runsScored = 0;
                validBall = true;
            }
            // Wicket button
            else if (e.getSource() == scoreFrame.getBtnWicket()) {
                wic = true;
                validBall = true;
                totalWickets++;
                bowlerWickets++;
                
                

                WicketRuns runsBeforeDismissal = new WicketRuns();
                runsBeforeDismissal.display();

                if(wicketRuns != null){
                    PopupFrame wicketPopup = new PopupFrame("WICKET!", "Batsman out!", new java.awt.Color(180, 0, 0));
                    if(e.getSource() == wicketRuns.getOne()){
                        runsScored = 1;
                        wicketRuns.dispose();
                    }else if(e.getSource() == wicketRuns.getTwo()){
                        runsScored = 2;
                        wicketRuns.dispose();
                    }else if(e.getSource() == wicketRuns.getThree()){
                        runsScored = 3;
                        wicketRuns.dispose();
                    }else{
                        wicketRuns.dispose();
                    }
                    wicketPopup.display();
                }

                //if all out
                if (totalWickets >= 10) {
                    showInningsOverPopup();
                    return;
                }

                // Replace out batsman with next player
                if (nextBatsmanIndex < battingPlayers.size()) {
                    strikerIndex = nextBatsmanIndex;
                    strikerRuns = 0;
                    strikerBalls = 0;
                    nextBatsmanIndex++;
                }
            }
            // Extras
            else if (e.getSource() == scoreFrame.getBtnWide() || e.getSource() == scoreFrame.getBtnNoBall()) {
                totalRuns++;
                bowlerRuns++;

                // Check if chasing team won with extras
                if (scoreFrame.getInningsNumber() == 2) {
                    int target = scoreFrame.getFirstInningsScore();
                    if (totalRuns > target) {
                        showChasingWin();
                        return;
                    }
                }
            }
            // End Over button
            else if (e.getSource() == scoreFrame.getBtnEndOver()) {
                swapBatsmen();

                // Change bowler
                currentBowlerIndex++;
                if (currentBowlerIndex >= bowlingPlayers.size()) {
                    currentBowlerIndex = 0;
                }
                bowlerRuns = 0;
                bowlerWickets = 0;
                bowlerBalls = 0;

                // Check if 10 overs completed
                int completedOvers = ballsBowled / 6;
                if (completedOvers >= 10) {
                    showInningsOverPopup();
                    return;
                }
            }
            // Swap button
            else if (e.getSource() == scoreFrame.getBtnSwap()) {
                swapBatsmen();
            }

            // Update Game State
            if (validBall == true) {
                totalRuns += runsScored;
                ballsBowled++;
                if(wic == false){
                    strikerBalls++;
                }
                strikerRuns += runsScored;
                bowlerRuns += runsScored;
                bowlerBalls++;

                // Check if chasing team beat the target in 2nd innings
                if (scoreFrame.getInningsNumber() == 2) {
                    int target = scoreFrame.getFirstInningsScore();
                    if (totalRuns > target) {
                        showChasingWin();
                        return;
                    }
                }

                // Swap on odd runs
                if (runsScored == 1 || runsScored == 3) {
                    swapBatsmen();
                }

                // Check if 10 overs completed
                int completedOvers = ballsBowled / 6;
                if (completedOvers >= 10) {
                    showInningsOverPopup();
                    return;
                }
            }

            // Update Text on Screen
            updatePlayerLabels();
            updateScoreBoardUI();
        }
    }

    // Swaping striker and non-striker
    private void swapBatsmen() {
        int temp = strikerIndex;
        strikerIndex = nonStrikerIndex;
        nonStrikerIndex = temp;

        int tempRuns = strikerRuns;
        strikerRuns = nonStrikerRuns;
        nonStrikerRuns = tempRuns;

        int tempBalls = strikerBalls;
        strikerBalls = nonStrikerBalls;
        nonStrikerBalls = tempBalls;
    }

    // Helper to update player labels
    private void updatePlayerLabels() {
        if (scoreFrame != null && battingPlayers.size() > 0 && bowlingPlayers.size() > 0) {
            String strikerName = battingPlayers.get(strikerIndex);
            String nonStrikerName = battingPlayers.get(nonStrikerIndex);
            String bowlerName = bowlingPlayers.get(currentBowlerIndex);

            scoreFrame.getStrikerLabel().setText(strikerName + " * " + strikerRuns + "(" + strikerBalls + ")");
            scoreFrame.getNonStrikerLabel().setText(nonStrikerName + "     " + nonStrikerRuns + "(" + nonStrikerBalls + ")");

            int bowlerOvers = bowlerBalls / 6;
            int bowlerBallsInOver = bowlerBalls % 6;
            scoreFrame.getCurrentBowlerLabel().setText(bowlerName + "    " + bowlerWickets + "/" + bowlerRuns + " ("+ bowlerOvers + "." + bowlerBallsInOver + ")");
        }
    }

    // Helper to update score display
    private void updateScoreBoardUI() {
        int completedOvers = ballsBowled / 6;
        int ballsInCurrentOver = ballsBowled % 6;

        String overDisplay = completedOvers + "." + ballsInCurrentOver;
        String battingTeam = scoreFrame.getBattingTeamName();

        scoreFrame.getScoreLabel().setText(battingTeam + ": " + totalRuns + "/" + totalWickets + " (" + overDisplay + " Overs)");
    }

    // Show chasing team win (when they beat the target)
    private void showChasingWin() {
        String battingTeam = scoreFrame.getBattingTeamName();
        String firstTeam = scoreFrame.getFirstInningsTeam();
        int firstScore = scoreFrame.getFirstInningsScore();

        scoreFrame.dispose();
        WinnerFrame winner = new WinnerFrame(firstTeam, firstScore, battingTeam, totalRuns);
        winner.display();
    }

    // Show innings over popup
    private void showInningsOverPopup() {
        String battingTeam = scoreFrame.getBattingTeamName();
        String bowlingTeam = scoreFrame.getBowlingTeamName();
        int inningsNum = scoreFrame.getInningsNumber();
        int firstScore = scoreFrame.getFirstInningsScore();
        String firstTeam = scoreFrame.getFirstInningsTeam();

        scoreFrame.dispose();

        InningsOverFrame inningsFrame = new InningsOverFrame(battingTeam, bowlingTeam, totalRuns, totalWickets,inningsNum, firstScore, firstTeam);
        inningsFrame.display();
    }
}