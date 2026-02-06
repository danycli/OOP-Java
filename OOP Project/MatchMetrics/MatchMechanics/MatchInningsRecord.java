package MatchMechanics;

import java.util.ArrayList;

public class MatchInningsRecord {
    private String battingTeam;
    private String bowlingTeam;
    private int totalRuns;
    private int totalWickets;
    private int ballsBowled;
    private ArrayList<String> battingPlayers;
    private ArrayList<String> bowlingPlayers;
    private int[] battingRuns;
    private int[] battingBalls;
    private int[] bowlingRuns;
    private int[] bowlingWickets;
    private int[] bowlingBalls;

    public MatchInningsRecord(String batting, String bowling, int runs, int wickets, int balls, ArrayList<String> batters,
                              ArrayList<String> bowlers, int[] batRuns, int[] batBalls, int[] bowlRuns,
                              int[] bowlWickets, int[] bowlBalls) {
        battingTeam = batting;
        bowlingTeam = bowling;
        totalRuns = runs;
        totalWickets = wickets;
        ballsBowled = balls;
        battingPlayers = batters;
        bowlingPlayers = bowlers;
        battingRuns = batRuns;
        battingBalls = batBalls;
        bowlingRuns = bowlRuns;
        bowlingWickets = bowlWickets;
        bowlingBalls = bowlBalls;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public String getBowlingTeam() {
        return bowlingTeam;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public int getTotalWickets() {
        return totalWickets;
    }

    public int getBallsBowled() {
        return ballsBowled;
    }

    public ArrayList<String> getBattingPlayers() {
        return battingPlayers;
    }

    public ArrayList<String> getBowlingPlayers() {
        return bowlingPlayers;
    }

    public int[] getBattingRuns() {
        return battingRuns;
    }

    public int[] getBattingBalls() {
        return battingBalls;
    }

    public int[] getBowlingRuns() {
        return bowlingRuns;
    }

    public int[] getBowlingWickets() {
        return bowlingWickets;
    }

    public int[] getBowlingBalls() {
        return bowlingBalls;
    }

    public String getOvers() {
        int overs = ballsBowled / 6;
        int ballsInOver = ballsBowled % 6;
        return overs + "." + ballsInOver;
    }
}
