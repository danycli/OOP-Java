package p11;

public class MainClass {
    Circle C1 = new Circle();
    Circle C2 = new Circle();
    
    C1.setRadius(8);
    C1.calculateArea();
    C1.calculateCircumference();

    C2.calculateArea();
    C2.calculateCircumference();

    Circle C3 = new Circle(C1);
    boolean result = C1.equalRadius(C2,C3);
    
    Circle C4 = new Circle();
    Circle C4 = Circle.AddCircles(C1,C2);

    C4.displayInfo();

}
