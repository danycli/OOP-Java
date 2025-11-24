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
    @Override
    public void calculateSalary() { 
        salary=3000* numberOfProjects; 
    }
    @Override
    public void calculateGpfund (){
        super.calculateGpfund();
        gpfund =gpfund * (numberOfProjects + 8);
    }
    public void calculateBonus (){
        bonus= salary/2;
    }
    @Override
    public void display() {
        System.out.println("Id = "+getsId());
        super.display();
        System.out.println("Number of projects = "+getNumberOfProjects());
        System.out.println("Bonus = "+bonus);
    }
}
