package English;
public class EnglishSentence {
    private String Sentence;

    public EnglishSentence(String sentence) {
        Sentence = sentence;
    }

    public String getSentence() {
        return Sentence;
    }

    public void setSentence(String sentence) {
        Sentence = sentence;
    }

    public void concatSentence(String str){
        Sentence = str+" "+Sentence;
    }

    public void displaySubStringBetweenTwoPassedChars(char ch1, char ch2){
        String str = Sentence.substring(Sentence.indexOf(ch1)+1,Sentence.indexOf(ch2));
        System.out.println(str);
    }
    public String createNewString(){
        String str = Sentence.substring(0,Sentence.length()/2) + " Pakistan";
        return str;
    }

    public boolean checkSentencceIsPalindromeOrNot(){
        boolean b = true;
        String str = Sentence.replace(" ", "").toLowerCase();
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                b = false;
                break;
            }
        }
        return b;
    }

    public int countTheWordsInTheSenetence(){
        String[] str = Sentence.split(" ");
        return str.length;
    }
}
