package PurePloymorphism;

public class MainClass {
    public static void main(String [] args){
        shape c1 = new circle(4, 43);
        c1.calculateArea();
        circle s = (circle)c1;
        s.calculateCircumference();
        c1.displayInfo();
    }
}
