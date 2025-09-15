package p4;

public class Student{
    private int StudentID;
    private String StudentName;
    private double Marks;
    private double Gpa;
    private int NumberOfScholarships;

    public Student(){ //Using Constructor with public modifier to access it anywhere...
        NumberOfScholarships = 1;
    }

    //Setting and getting both...
    public int getStudentId(int id){
        StudentID = id;
        return id;
    }
    public String getStudentName(String name){
        StudentName = name;
        return name;
    }
    public double getMarks(double marks){
    if(marks >= 49.5 && marks <= 49.9){
        marks = 50;
    }
        Marks = marks;
        return marks;
    }
    public int getGpa(int gpa){
        Gpa = gpa;
        return gpa;
    }
    public int getNumberofScholorship(int scholorship){
        NumberOfScholarships = scholorship;
        return scholorship;
    }

    public void calculateGpa(){
        if(Marks >= 90.00){
            Gpa = 4.0;
        }else if(Marks < 90.00 && Marks >=80.00){
            Gpa = 3.5;
        }else if(Marks < 80.00 && Marks >= 70.00){
            Gpa = 3.0;
        }else if(Marks < 70.00 && Marks >= 60.00){
            Gpa = 2.5;
        }else if(Marks < 60.00 && Marks >= 50.00){
            Gpa = 2.0;
        }else{
            Gpa = 0.0;
        }
    }

    public void calculateNumberOfScholorship(){
        if(Gpa == 4){
            NumberOfScholarships+=2;
        }else if(Gpa > 3.4){
            NumberOfScholarships++;
        }
    }


    public void info(){
        System.out.println(StudentID);
        System.out.println(StudentName);
        System.out.println(Marks);
        System.out.println(Gpa);
        System.out.println(NumberOfScholarships);
    }

}