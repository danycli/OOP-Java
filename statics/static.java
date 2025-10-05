package statics;
public class static{
    static int NOofStudents = 0;
    String Name;

    public void addStudent(String name){
        this.Name = name;
    }
    public String getStudentName(){
        return Name;
    }
    public int getStudentNo(){
        return NOofStudents;
    }

    void display(){
        System.out.println("Name of the Student is : "+Name);
        System.out.println("Number of the Students are : "+Name);
    }

    public stat {
        NOofStudents++;
    }
    
}