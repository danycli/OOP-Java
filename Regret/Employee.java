package Regret;

public class Employee {
    private String name;
    private String department;
    protected double salary;
    protected double tax;
    protected double gpfund;

    protected Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    private String getName() {
        return name;
    }

    private String getDepartment() {
        return department;
    }

    private double getSalary() {
        return salary;
    }

    private double getTax() {
        return tax;
    }

    private double getGpfund() {
        return gpfund;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public void display(){
        System.out.println("Name = "+name);
        System.out.println("Department = "+department);
        System.out.println("Salary = "+salary);
        System.out.println("Tax = "+tax);
        System.out.println("GP Fund = "+gpfund);
    }
}
