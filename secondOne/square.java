package secondOne;

public class square {
    private int ID;
    private float sideLength;
    private float area;
    private float perimeter;
    //Constructor
    public square(int iD, float sideLength) {
        ID = iD;
        this.sideLength = sideLength;
    }
    //Setters
    public void setID(int iD) {
        ID = iD;
    }
    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }
    //Getters
    public int getID() {
        return ID;
    }
    public float getSideLength() {
        return sideLength;
    }
    public float getArea() {
        return area;
    }
    public float getPerimeter() {
        return perimeter;
    }

    public void calculateArea(){
        area = sideLength*sideLength;
    }
    public void calculatePerimeter(){
        perimeter = 4* sideLength;
    }

    public void displayInfo(){
        System.out.println(ID+sideLength+area+perimeter);
    }
}
