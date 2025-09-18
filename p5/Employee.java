package p5;

public class Employee{
    private int ID;
    private String Name;
    private double Salary;
    private int YearsofExperience;
//Setters
    public void setID(int id){
        ID = id;
    }
    public void setName(String name){
        Name = name;
    }
    public void setSalary(double salary){
        Salary = salary;
    }
    public void setYearsofExperience(int yearsofexperience){
        YearsofExperience = yearsofexperience;
    }

    public int getID(){
        return ID;
    }
    public String getName(){
        return Name;
    }
    public double getSalary(){
        return Salary;
    }
    public int getYearsofExperience(){
        return YearsofExperience;
    }

    public void display(){
        System.out.println("Employee Id = "+ID);
        System.out.println("Employee name = "+Name);
        System.out.println("Emplyee Salary = "+Salary);
        System.out.println("Employee Experiennce "+YearsofExperience+" years");
    }

}