package MatchMechanics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MatchHistoryManager {
    private static MatchInningsRecord firstInnings;
    private static MatchInningsRecord secondInnings;

    public static void resetMatch() {
        firstInnings = null;
        secondInnings = null;
    }

    public static void storeInnings(MatchInningsRecord record, int inningsNumber) {
        if (inningsNumber == 1) {
            firstInnings = record;
        } else {
            secondInnings = record;
        }
    }

    public static void saveMatchHistory() {
        if (firstInnings == null || secondInnings == null) {
            return;
        }

        String teamA = firstInnings.getBattingTeam();
        String teamB = secondInnings.getBattingTeam();

        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String matchFolderName = sanitizeName(teamA + "_vs_" + teamB + "_" + timestamp);
        String folderLocation = new File("").getAbsolutePath() + File.separator + "MatchMetrics/MatchHistory";
        File matchFolder = new File(folderLocation, matchFolderName);
        if (!matchFolder.exists()) {
            matchFolder.mkdirs();
        }

        File summaryFile = new File(matchFolder, "match_summary.txt");
        File inningsOneFile = new File(matchFolder, "innings1.txt");
        File inningsTwoFile = new File(matchFolder, "innings2.txt");
        try (FileWriter writer = new FileWriter(summaryFile)) {
            writer.write("Match: " + teamA + " vs " + teamB + "\n");
            writer.write("Result: " + buildResultText() + "\n\n");

            writeInningsSummary(writer, "1st Innings", firstInnings);
            writer.write("\n");
            writeInningsSummary(writer, "2nd Innings", secondInnings);
        } catch (IOException e) {
            System.out.println("Error writing match history");
        }

        writeInningsFile(inningsOneFile, "1st Innings", firstInnings);
        writeInningsFile(inningsTwoFile, "2nd Innings", secondInnings);
    }

    private static String buildResultText() {
        int firstRuns = firstInnings.getTotalRuns();
        int secondRuns = secondInnings.getTotalRuns();

        if (firstRuns > secondRuns) {
            int margin = firstRuns - secondRuns;
            return firstInnings.getBattingTeam() + " wins by " + margin + " runs!";
        } else if (secondRuns > firstRuns) {
            int wicketsLeft = 10 - secondInnings.getTotalWickets();
            if (wicketsLeft < 0) {
                wicketsLeft = 0;
            }
            return secondInnings.getBattingTeam() + " wins by " + wicketsLeft + " wickets!";
        }
        return "Match Tied!";
    }

    private static void writeInningsSummary(FileWriter writer, String title, MatchInningsRecord record) throws IOException {
        writer.write(title + " - " + record.getBattingTeam() + " " + record.getTotalRuns() + "/" + record.getTotalWickets()
            + " (" + record.getOvers() + " overs)\n");
        writer.write("Bowling Team: " + record.getBowlingTeam() + "\n\n");

        writer.write("Batting Scorecard:\n");
        int[] batRuns = record.getBattingRuns();
        int[] batBalls = record.getBattingBalls();
        for (int i = 0; i < record.getBattingPlayers().size(); i++) {
            String player = record.getBattingPlayers().get(i);
            int runs = (i < batRuns.length) ? batRuns[i] : 0;
            int balls = (i < batBalls.length) ? batBalls[i] : 0;
            writer.write((i + 1) + ". " + player + " - " + runs + "(" + balls + ")\n");
        }

        writer.write("\nBowling Scorecard:\n");
        int[] bowlRuns = record.getBowlingRuns();
        int[] bowlWickets = record.getBowlingWickets();
        int[] bowlBalls = record.getBowlingBalls();
        for (int i = 0; i < record.getBowlingPlayers().size(); i++) {
            String player = record.getBowlingPlayers().get(i);
            int runs = (i < bowlRuns.length) ? bowlRuns[i] : 0;
            int wickets = (i < bowlWickets.length) ? bowlWickets[i] : 0;
            int balls = (i < bowlBalls.length) ? bowlBalls[i] : 0;
            String overs = (balls / 6) + "." + (balls % 6);
            writer.write((i + 1) + ". " + player + " - " + wickets + "/" + runs + " (" + overs + ")\n");
        }
    }

    private static void writeInningsFile(File file, String title, MatchInningsRecord record) {
        try (FileWriter writer = new FileWriter(file)) {
            writeInningsSummary(writer, title, record);
        } catch (IOException e) {
            System.out.println("Error writing innings record");
        }
    }

    private static String sanitizeName(String name) {
        return name.replace(" ", "_");
    }
}
