package Regret;

public class Faculty extends Employee{
    private int fid;
    private int numberOfResearchPublications;

    public Faculty(int fid, String name, String department, int numberOfResearchPublications) {
        super(name,department);
        this.numberOfResearchPublications = numberOfResearchPublications;
        this.fid = fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    private int getFid() {
        return fid;
    }
    private int getNumberOfResearchPublications() {
        return numberOfResearchPublications;
    }

    public void calculateSalary() { 
        salary=2000* numberOfResearchPublications; 
    } 
    public void calculateTax() { 
        tax=salary*0.03; 
    }
    public void calculateGpfund (){
        gpfund = salary *12;
        gpfund =gpfund * (numberOfResearchPublications+10);
    }
    public void displayInfo() {
        System.out.println("id = "+fid);
        super.display();
    }
    
}
