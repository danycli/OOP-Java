package PlayList;

import java.util.ArrayList;

public class SongsPlayList{

    private String songsPlayListName;
    private ArrayList<Integer> songsNumbers = new ArrayList<>();
    private ArrayList<String> songsTitles = new ArrayList<>();
    private ArrayList<String> singersNames = new ArrayList<>();

    public SongsPlayList(String songsPlayListName) {
        this.songsPlayListName = songsPlayListName;
    }

    public String getSongsPlayListName() {
        return songsPlayListName;
    }
    public void setSongsPlayListName(String songsPlayListName) {
        this.songsPlayListName = songsPlayListName;
    }
    public ArrayList<Integer> getSongsNumbers() {
        return songsNumbers;
    }
    public void setSongsNumbers(ArrayList<Integer> songsNumbers) {
        this.songsNumbers = songsNumbers;
    }
    public ArrayList<String> getSongsTitles() {
        return songsTitles;
    }
    public void setSongsTitles(ArrayList<String> songsTitles) {
        this.songsTitles = songsTitles;
    }
    public ArrayList<String> getSingersNames() {
        return singersNames;
    }
    public void setSingersNames(ArrayList<String> singersNames) {
        this.singersNames = singersNames;
    }

    void addSongInTheList(int songNumber, String songTitle, String singerName){
        songsNumbers.add(songNumber);
        songsTitles.add(songTitle);
        singersNames.add(singerName);
    }

    void removeSongFromTheList(String songtitle){
        int index = songsTitles.indexOf(songtitle);
        songsTitles.remove(songtitle);
        singersNames.remove(index);
        songsNumbers.remove(index);
    }
    void displayInfo(){
        System.out.print("PlayList Name : "+songsPlayListName);
        for(int i = 0; i < songsNumbers.size(); i++){
            System.out.println((1+i)+". "+singersNames.get(i)+"--"+songsTitles.get(i));
        }
    }
    boolean searchSongBySingerNameInTheList(String singername){
        return singersNames.contains(singername);
    }
    boolean searchSongBySongTitleInTheList(String singertitle){
        return songsTitles.contains(singertitle);
    }
    int countSongsSungByASinger(String singername){
        int count = 0;
        for(int i = 0; i < songsNumbers.size(); i++){
            if(singersNames.get(i).equals(singername)){
                count++;
            }
        }
        return count;
    }
    void displaytheSongTitleIfPassedWordIsAppearedInTheTitleOfAnySong(String word){
        for(int i = 0; i < songsNumbers.size(); i++){
            if(songsTitles.get(i).equals(word)){
                System.out.println(songsTitles.get(i));
            }
        }
    }
    void SwapSongTitleAndSingerName(int index1, int index2){
        String t1 = singersNames.get(index1);
        String t2 = singersNames.get(index2);
        
        String f1 = songsTitles.get(index1);
        String f2 = songsTitles.get(index2);

        singersNames.set(index1, t2);
        singersNames.set(index2, t1);

        singersNames.set(index1, f2);
        singersNames.set(index2, f1);
    }
}