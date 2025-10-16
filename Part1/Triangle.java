package Part1;
public class Triangle{
    private float LengthOfSide1;
    private float LengthOfSide2;
    private float LengthOfSide3;
    private float Area;
    private float Perimeter;
    private String TypeOfATriangle;

    Triangle(float LengthOfSide1, float LenghtOfSide2, float LengthOfSide3){
        this.LengthOfSide1 = LengthOfSide1;
        this.LengthOfSide2 = LenghtOfSide2;
        this.LengthOfSide3 = LengthOfSide3;
    }
    Triangle(Triangle t1){
        this.LengthOfSide1 = t1.LengthOfSide1;
        this.LengthOfSide2 = t1.LengthOfSide2;
        this.LengthOfSide3 = t1.LengthOfSide3;
        this.Area = t1.Area;
        this.Perimeter = t1.Perimeter;
        this.TypeOfATriangle = t1.TypeOfATriangle;
    }

    void setLength1(float length1){
        this.LengthOfSide1 = length1;
    }
    void setLength2(float length2){
        this.LengthOfSide2 = length2;
    }
    void setLength3(float length3){
        this.LengthOfSide3 = length3;
    }
    float getSide1(){
        return LengthOfSide1;
    }
    float getSide2(){
        return LengthOfSide2;
    }
    float getSide3(){
        return LengthOfSide3;
    }
    float getArea(){
        return Area;
    }
    float getPerimeter(){
        return Perimeter;
    }

    void CalArea(){
        float s = (this.LengthOfSide1+this.LengthOfSide2+this.LengthOfSide3)/2;
        float cal = s*(s-this.LengthOfSide1)*(s-this.LengthOfSide2)*(s-this.LengthOfSide3);
        this.Area = (float)Math.sqrt(cal);
    }
    void CalPerimeter(){
        this.Perimeter = (this.LengthOfSide1+this.LengthOfSide2+this.LengthOfSide3);
    }
    String TypeOfTriangle(){
        if(this.LengthOfSide1 == this.LengthOfSide2 && this.LengthOfSide1 == this.LengthOfSide3){
            this.TypeOfATriangle = "Equilateral";
            return this.TypeOfATriangle;
        }else if(this.LengthOfSide1 == this.LengthOfSide2 || this.LengthOfSide1 == this.LengthOfSide3 || this.LengthOfSide2 == this.LengthOfSide3){
            this.TypeOfATriangle = "Isosceles";
            return this.TypeOfATriangle;
        }else{
            this.TypeOfATriangle = "Scalene";
            return this.TypeOfATriangle;
        }
    }
    void displayInfo(){
        System.out.println("Length of Side 1 = "+this.LengthOfSide1);
        System.out.println("Length of Side 2 = "+this.LengthOfSide2);
        System.out.println("Length of Side 3 = "+this.LengthOfSide3);
        System.out.println("Area of the Triangel is ="+this.Area);
        System.out.println("Perimeter of the triangle ="+this.Perimeter);
        System.out.println("It is "+this.TypeOfATriangle+" triangle");
    }
    // I use to compare the strings directly but later on discovered it and write a correct method for it downl bellow
    // public static boolean compare(Triangle t1, Triangle t2, Triangle t3){
    //     if(t1.TypeOfATriangle == t2.TypeOfATriangle && t1.TypeOfATriangle == t3.TypeOfATriangle){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // Corrected it using .equals to surely compare the string not its references(memory addresses)
    public static boolean compare(Triangle t1, Triangle t2, Triangle t3){
        if(t1.TypeOfATriangle.equals(t2.TypeOfATriangle) && t1.TypeOfATriangle.equals(t3.TypeOfATriangle)){
            return true;
        }else{
            return false;
        }
    }
}