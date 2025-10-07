package pp;

public class MainClass {
    public static void main(String[] args) {
        Circle C1 = new Circle(5);
        Circle C2 = new Circle(8);

        C1.calculateArea();
        C1.calculateCircumference();

        C2.calculateArea();
        C2.calculateCircumference();

        Circle C3 = new Circle(C1);

        boolean result = C1.equalRadius(C2, C3);
        System.out.println("Equal Radius Result: " + result);

        Circle C4 = Circle.AddCircles(C1, C2);
        C4.displayInfo();
    }
}
