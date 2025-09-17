package p1;

public class Student{
    private int StudentID;
    private String StudentName;
    private double Marks;
    private double Gpa;
    private int NumberOfScholarships;

    public Student() {
        NumberOfScholarships = 1; // initial value instead of 0
    }

    public void setStudentName(String Name) {
        StudentName = Name;
    }

    public void setStudentID(int id) {
        StudentID = id;
    }

    public void setMarks(double m) {
        Marks = m;
    }

    public String getStudentName() {
        return StudentName;
    }

    public int getStudentID() {
        return StudentID;
    }

    public double getMarks() {
        return Marks;
    }

    public double getGpa() {
        return Gpa;
    }

    public int getNumberOfScholarships() {
        return NumberOfScholarships;
    }

    public void calculateGpa() {
        if (Marks >= 90)
            Gpa = 4.0;
        else if (Marks >= 80)
            Gpa = 3.7;
        else if (Marks >= 70)
            Gpa = 3.3;
        else if (Marks >= 60)
            Gpa = 2.7;
        else if (Marks >= 50)
            Gpa = 2.0;
        else
            Gpa = 0.0;
    }

    public void calculateNumberOfScholarships() {
        if (Gpa == 4.0) {
            NumberOfScholarships += 2;
        } else if (Gpa >= 3.3) {
            NumberOfScholarships += 1;
        }
    }

    public void DisplayStudent() {
        System.out.printf("Student Name = %s\n", StudentName);
        System.out.printf("Student ID = %d\n", StudentID);
        System.out.printf("Student Marks = %.2f\n", Marks);
        System.out.printf("Student GPA = %.2f\n", Gpa);
        System.out.printf("Number of Scholarships = %d\n", NumberOfScholarships);
    }
}