package pp;

public class Circle {
    private int radius;
    private float area;
    private float circumference;

    Circle() {
        this.radius = 0;
        this.area = 0.0f;
        this.circumference = 0.0f;
    }

    Circle(int Radius) {
        this.radius = Radius;
        this.area = 0.0f;
        this.circumference = 0.0f;
    }

    public Circle(Circle C) {
        radius = C.radius;
        area = C.area;
        circumference = C.circumference;
    }

    void calculateArea() {
        area = 3.142f * radius * radius;
    }

    void calculateCircumference() {
        circumference = 2 * 3.142f * radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    int getRadius() {
        return radius;
    }

    float getArea() {
        return area;
    }

    float getCircumference() {
        return circumference;
    }

    void displayInfo() {
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }

    public static Circle AddCircles(Circle Cx, Circle Cy) {
        int R = Cx.radius + Cy.radius;
        float A = Cx.area + Cy.area;
        float Cir = Cx.circumference + Cy.circumference;

        Circle C5 = new Circle(R);
        C5.area = A;
        C5.circumference = Cir;
        return C5;
    }

    public boolean equalRadius(Circle Cx, Circle Cy) {
        return (this.radius == Cx.radius && this.radius == Cy.radius);
    }
}
