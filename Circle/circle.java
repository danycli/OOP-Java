package Circle;

public class circle {
    private int radius;
    private float area;
    private float circumference;
    
    void setradius(int radius){
        this.radius = radius;
    }
    
    int getradius(){
        return radius;
    }
    float getarea(){
        return area;
    }
    float getcircumference(){
        return circumference;
    }

    public static circle addCircle(circle c1, circle c2){
        int A = c1.radius+c2.radius;
        float B = c1.area+c2.area;
        float C = c1.circumference+c2.circumference;

        circle c3 = new circle();
        c3.radius = A;
        c3.area = B;
        c3.circumference = C;

        return c3;
    }
}
