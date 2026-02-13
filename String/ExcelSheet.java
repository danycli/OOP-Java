package String;
public class ExcelSheet {
    public static void main(String[] args) {
        // int col = 28;
        // String res = "";
        // while(col > 0){
        //     col--;
        //     res += (char)(col%26 + 'A');
        //     col /=26;
        // }
        // System.out.println(res);

        int count = 0;
        String str = "Y";
        String[] sp = str.split("");
        for(int i = 0; i < sp.length; i++){
            
            count += str.charAt(i);
        }
        System.out.println(count);
    }
}
