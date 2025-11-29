package OverridingEquals;

public class MainClass {
    public static void main (String [] args){
        Equals e1 = new Equals(7, 2);
        Equals e2 = new Equals(7, 2);
        System.out.println(e1.equals(e2));
    }  
}
