package lab;

public class square {
    private int sideLength;
    private float area;
    private float perimeter;

    square(int sideLength){
        this.sideLength = sideLength;
        this.area = 0.0f;
        this.perimeter = 0.0f;
    }
    square(square sq2){
        this.sideLength = sq2.sideLength;
        this.area = sq2.area;
        this.perimeter = sq2.perimeter;
    }
    void setsideLenth(int length){
        this.sideLength = length;
    }
    int getSideLength(){
        return sideLength;
    }
    float getArea(){
        return area;
    }
    float getPerimeter(){
        return perimeter;
    }
    void calculateArea(){
        int formula = sideLength*sideLength;
        area = formula;
    }
    void calculatePerimeter(){
        int formula = 4*sideLength;
        perimeter = formula;
    }
    void displayInfo(){
        System.out.println("Side Length = "+sideLength);
        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+perimeter);
    }
    boolean equalSquares(square sq2, square sq3){
        if(sq2.sideLength == sq3.sideLength){
            return true;
        }else{
            return false;
        }
    }
    public static float averageLength(square sq1, square sq2, square sq3){
        float average = (sq1.sideLength + sq2.sideLength + sq3.sideLength)/3;
        return average;
    }
    
}
