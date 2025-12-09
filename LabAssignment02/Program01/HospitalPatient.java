package LabAssignment02.Program01;

public class HospitalPatient {
    int patientid;
    String patientName;
    double[] testResults;
    String[] healthStatus;

    //Constructors
    public HospitalPatient(int id, int arraySize){
        try{
            if(id > 0){
                this.patientid = id;
            }else{
                throw new HospitalException("The Patient ID can't be negative or zero(By Constructor)");
            }
            testResults = new double[arraySize];
            healthStatus = new String[arraySize];
        }
        catch(RuntimeException e){
            if(e instanceof HospitalException){
                ((HospitalException)e).display();
            }else if(e instanceof NegativeArraySizeException){
                System.out.println("The array size can't be negative (By Constructor)");
            }
        }
    }
    //Setters
    public void setName(String name){
        this.patientName = name;
    }
    
    public void setId(int id){
        try{
            if(id > 0){
                this.patientid = id;
            }else{
                throw new HospitalException("The Patient ID can't be negative or zero(By Setter)");
            }
        }
        catch(HospitalException e){
            e.display();
        }
    }
    public void setArraySize(int size){
        try{
            testResults = new double[size];
            healthStatus = new String[size];
        }
        catch(NegativeArraySizeException e){
            System.out.println("The array size can't be negative(By Setter)");
        }
    }
    public void setTestResult(int index, double value){
        try{
            testResults[index] = value;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The size of the array is "+testResults.length+" unable to store data in "+index+" index");
        }
    }

    //Getters
    public int getPatientid() {
        return patientid;
    }
    public String getPatientName() {
        return patientName;
    }
    public double getTestResults(int index) {
        try{
            return testResults[index];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The size of the array is "+testResults.length+" unable to extract data from "+index+" index");
            return 0;
        }
    }
    public String getHealthStatus(int index) {
        return healthStatus[index];
    }
    //Other Methods
    public void calculateHealthStatus(){
        for(int i = 0; i < healthStatus.length; i++){
            String type = (Math.random() < 0.5) ? "Excellent" : "Weak";
            healthStatus[i] = type;
        }
    }
    public void displayInfo(){
        System.out.println("Patient ID = "+patientid);
        System.out.println("Patient Name = "+patientName);
        System.out.print("Patient Test Resutlt = ");
        for(int i = 0; i < testResults.length; i++){
            System.out.print(testResults[i]);
        }
        System.out.print("Patient Health Status = ");
        for(int i = 0; i < testResults.length; i++){
            System.out.print(healthStatus[i]);
        }
    }
 
}
