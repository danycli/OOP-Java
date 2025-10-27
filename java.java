import java.util.Arrays;
public class java {
    public static void main(String [] args){
        String x = "Danial";
        int a = -5;
        int b = Math.abs(a);
        System.out.println(a+" "+b);



        // Lts suppose e have to draw random nuim bw 2-100
        int t = (int)(Math.random()*99)+2;
        System.out.println(t);
        System.out.println("hi");


        int[] o = {2,3,1,4,10}; 
        int[] p = {2,3,1,4,9}; 
        int[] i = new int[5];
        System.out.println(Arrays.compare(o,p));
        Arrays.fill(i, 89);
        System.out.println(Arrays.toString(i));
        Arrays.sort(p);
        System.out.println(Arrays.toString(p));
    }
}
