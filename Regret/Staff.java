package Regret;


public class Staff extends Employee{
    private int sId;
    private int numberOfProjects;
    private double bonus;

    public Staff(int sId, String name, String departmentName, int numberOfProjects) {
        super(name, departmentName);
        this.numberOfProjects = numberOfProjects;
        this.sId = sId;
    }
    public void setsId(int sId) {
        this.sId = sId;
    }
    public void setNumberOfProjects(int numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }

    private int getsId() {
        return sId;
    }
    private int getNumberOfProjects() {
        return numberOfProjects;
    }

    void calculateSalary() { 
        salary=3000* numberOfProjects; 
    } 
    void calculateTax() { 
        tax=salary*0.03; 
    }
    void calculateGpfund (){
        gpfund = salary *12;
        gpfund =gpfund * (numberOfProjects+8);
    }
    void calculateBonus (){
        bonus= salary/2;
    }
    void displayInfo() {
        System.out.println("Id = "+sId);
        super.display();
        System.out.println("Bonus = "+bonus);
    }
}
