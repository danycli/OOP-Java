package Regret;

import java.text.NumberFormat;

public abstract class Employee {
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

    protected abstract void calculateSalary();
    
    public void calculateTax() { 
        tax=salary*0.03;
    }
    void calculateGpfund (){
        gpfund = salary *12;
    }

    protected void display(){
        System.out.println("Name = "+getName());
        System.out.println("Department = "+getDepartment());
        System.out.println("Salary = "+NumberFormat.getCurrencyInstance().format(getSalary()));
        System.out.println("Tax = "+NumberFormat.getCurrencyInstance().format(getTax()));
        System.out.println("GP Fund = "+getGpfund());
    }
}
