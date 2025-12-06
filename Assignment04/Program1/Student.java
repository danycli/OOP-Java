package Assignment04.Program1;

public class Student {
    private int studentid;
    private String SName;
    private int[] marks;
    private double[] gpa;
    
    public Student(int studentid, String sName, int numberOfSubjects) {
        this.studentid = studentid;
        SName = sName;
        marks = new int[numberOfSubjects];
        gpa = new double[numberOfSubjects];
    }
    //Setters
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public void setSName(String sName) {
        SName = sName;
    }
    public void setMarks(int index, int mark) {
        try{
            if(mark < 100 && mark >= 0){
                marks[index] = mark;
            }else{
                throw new MarksException("Invalid Entry!\nThe marks needs to be between 0 and 100");
            }
        }
        catch(RuntimeException e){
            if(e instanceof MarksException){
                ((MarksException) e).display();
            }else if(e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("Index size out of range.Array Size = "+marks.length);
            }
        }
    }
    //Getters
    public int getStudentid() {
        return studentid;
    }
    public String getSName() {
        return SName;
    }
    public int getMarks(int index) {
        try{
            return marks[index];
        }
        catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index size out of range.Array Size = "+marks.length);
                return 0;
        }
    }
    public double[] getGpa() {
        return gpa;
    }
    //Remaining Methods
    public static int sumOfTwoStudentsMarks(Student S1, Student S2, int index){
        try{
            return S1.marks[index] + S1.marks[index];
        }
        catch(RuntimeException e){
            if(e instanceof ArrayIndexOutOfBoundsException){
                String student = (S2.marks.length > index) ? (S1.SName+" and "+S2.SName+" as well") : S2.SName+"`s" ;
                System.out.println("Array size out of bound for "+student+" Marks Array");
                return 0;
            }else if(e instanceof NullPointerException){
                System.out.println("Any one or both of the students do not have marks for "+index+" subject");
                return 0;
            }
            return 0;
        }
    }
}
