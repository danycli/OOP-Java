package Array1d;

public class array {
    float[] marks;

    void setMarks(int indexes, float[] mark){
        marks = new float[indexes];
        marks = mark.clone();
    }
}
