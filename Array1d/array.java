package Array1d;

import java.util.Arrays;

public class array {
    float[] marks;

    void setMarks(int indexes, float[] mark){
        marks = new float[indexes];
        marks = mark.clone();
    }
    void display(){
        System.out.println(Arrays.toString(marks));
    }
}
