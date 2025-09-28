package GPT;

public class student {
    private int student_ID;
    private String student_Name;
    private double marks1;
    private double marks2;
    private double percentage;
    private char grade;

    public void setStudentID(int ID) {
        this.student_ID = ID;
    }

    public void setstudentName(String Name) {
        this.student_Name = Name;
    }

    public void setMarks1(double marks) {
        this.marks1 = marks;
    }

    public void setMarks2(double marks) {
        this.marks2 = marks;
    }

    public int getStudentId() {
        return this.student_ID;
    }

    public String getStudentName() {
        return this.student_Name;
    }

    public double getMarks1() {
        return this.marks1;
    }

    public double getmarks2() {
        return this.marks2;
    }

    public double getPercentage() {
        return this.percentage;
    }

    public char getGrade() {
        return this.grade;
    }

    void calculatePercentage() {
        percentage = ((marks1 + marks2) / 200.0) * 100.0;
    }

    void assignGrade() {
        int cal = (int) percentage;
        if (cal >= 90) {
            grade = 'A';
        } else if (cal >= 75) {
            grade = 'B';
        } else if (cal >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
    }

    void findHighestMarks() {
        System.out.println("Highest Marks = " + Math.max(marks1, marks2));
    }

    void assignStatus() {
        if (grade == 'F') {
            System.out.println("Status = Fail");
        } else {
            System.out.println("Status = Pass");
        }
    }

    void diplayinfo() {
        System.out.println("\nStudent ID = " + student_ID);
        System.out.println("Student Name = " + student_Name);
        System.out.printf("Percentage = %.2f\n", percentage);
        System.out.println("Grade = " + grade);
        findHighestMarks();
        assignStatus();
    }
}