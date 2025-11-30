package PurePloymorphism;

public class circle extends shape{
    private int ID;
    private float radius;
    private float area;
    private float circumference;
    //Constructors
    public circle(int iD, float radius) {
        ID = iD;
        this.radius = radius;
    }
    //Setters
    public void setID(int iD) {
        ID = iD;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    //Getters
    public int getID() {
        return ID;
    }
    public float getRadius() {
        return radius;
    }
    public float getArea() {
        return area;
    }
    public float getCircumference() {
        return circumference;
    }
    @Override
    public void calculateArea(){
        area = 3.142f*radius*radius;
    }
    public void calculateCircumference(){
        circumference = 2*3.142f*radius;
    }
    @Override
    public void displayInfo(){
        System.out.println(ID+radius+area+circumference);
    }
}
