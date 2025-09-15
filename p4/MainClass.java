package p4;
public class MainClass{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.getStudentName("Danial");
        s1.getStudentId(331);
        s1.getMarks(49.6);
        s1.calculateGpa();
        s1.calculateNumberOfScholorship();
        s1.info();
    }
}