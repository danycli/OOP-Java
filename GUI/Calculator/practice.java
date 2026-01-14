package GUI.Calculator;

import java.util.ArrayList;

public class practice {
    public static void main(String [] args){
        ArrayList <String> pa = new ArrayList<>();
        pa.add(0, "dany");
        pa.add(1, "Ahmed");
        pa.add(2, "Name");
        pa.add(3, "Sumair");
        pa.add(4, "Khan");
        System.out.println(pa);

        pa.remove(2);
        pa.add(1,"kala");
        System.out.println(pa);
    }
}
