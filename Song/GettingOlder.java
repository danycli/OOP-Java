package Song;
public class GettingOlder{
    public static void main(String [] args){

        System.out.print("\033[H\033[2J");
        System.out.flush();

        String lyrics;

        lyrics = "I'm getting older, I've got more on my shoulders\n" +
                          "But I am getting better at admitting when I am wrong\n" +
                          "I am happier then ever, at least that's my endeavor\n" +
                          "To keep myself together and prioritize my pleasure\n" +
                          "'Cause to be honest, I just wish that what I promise\n" +
                          "Would depend on what I'm given (not on his permission)\n" +
                          "(Wasn't my decision)\n" +
                          "to be abused, mmm";
        for (int i = 0; i < lyrics.length(); i++) {
            System.out.print(lyrics.charAt(i));
            if(i == 48){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if(i == 100){
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else if(i == 152){
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else if(i == 203){
                try {
                    Thread.sleep(1400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else if(i == 256){
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if(i == 284){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if(i == 311){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else if(i == 346){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else if(i == 332){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else{
                try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        }
        try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
