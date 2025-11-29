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
    public void setNumberOfPublications(int numberOfResearchPublications){
        this.numberOfResearchPublications = numberOfResearchPublications;
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
    @Override
    public void calculateGpfund (){
        super.calculateGpfund();
        gpfund =gpfund * (numberOfResearchPublications+10);
    }
    @Override
    public void display() {
        System.out.println("id = "+getFid());
        super.display();
        System.out.println("Number of Reaserches = "+getNumberOfResearchPublications());
    }
    
}
