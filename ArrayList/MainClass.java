package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class MainClass{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(0);
        list.add(5);

        Collections.sort(list);
        System.out.println(list);

        list.remove(5);
        System.out.println(list);

        list.set(4,6);
        list.add(2,9);
        System.out.println(list);

        //Object removal
        Integer v = 6;
        list.remove(v);
        System.out.println(list+"   "+list.size());
    }
}