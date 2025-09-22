package P8;

public class patient {
    private int Pateint_ID;
    private String Patient_Name;
    private String Disease_Name;
    private int Condition;
    private double Fee;
    private int Number_Of_Days_Admitted;

    public void setPatientId(int patient_id){
        Pateint_ID = patient_id;
    }
    public void setPatientName(String name){
        Patient_Name = name;
    }

    public int getPatientID(){
        return Pateint_ID;
    }
    public String getPatientName(){
        return Patient_Name;
    }
    public String getDiseaseName(){
        return Disease_Name;
    }
    public double getFee(){
        return Fee;
    }
    public int getNoOfDaysAdmitted(){
        return Number_Of_Days_Admitted;
    }

    public void findCondition(int BloodPressure){
        if(BloodPressure < 200){
            Condition = 0;
        }else{
            Condition = 1;
        }
    }

    public void findNumberofDaysAdmitted(){
    if(Condition == 0){
        Number_Of_Days_Admitted = 1;
    }else{
	Number_Of_Days_Admitted = 3;
    }
}
    public void calculateFee(){
	if(Number_Of_Days_Admitted == 1){
        Fee = 1000.52;
    }else if(Number_Of_Days_Admitted > 1 && Number_Of_Days_Admitted < 5){
        Fee = 6407.66;
    }else{
        Fee = 10000.37;
    }
	}
    public void findDiseaseName(int Test1, int Test2){
        if (Test1 == 1) {
        Disease_Name = "Malaria";
    } else if (Test2 == 1) {
        Disease_Name = "Kidney Stone";
    } else {
        Disease_Name = "No Disease";
    }
    }    

    public void displayInfo(){
        System.out.println("Patient ID = "+Pateint_ID);
        System.out.println("Patient Name = "+Patient_Name);
        System.out.println("Disease = "+Disease_Name);
        if(Condition == 0){
            System.out.println("Condition = Normal");
        }else{
            System.out.println("Condition = Critical");
        }
        System.out.println("No of Days Admitted = "+Number_Of_Days_Admitted);
        System.out.println("Total fee = "+Fee);
    }

}
