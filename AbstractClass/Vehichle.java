package AbstractClass;
import java.util.Scanner;
public abstract class Vehichle {
    private int InspectionId;
    protected String VehichleType;
    protected int VehichleModel;
    private double BaseFee;
    private double FinalFee;
    protected float average;
    //Constructor
    protected Vehichle(int inspectionId, double baseFee, int vehichleModel){
        setBaseFee(baseFee);
        setVehichleModel(vehichleModel);
        setInspectionId(inspectionId);
    }

    Scanner sc = new Scanner(System.in);

    //Setters
    public void setBaseFee(double baseFee) {
        while(baseFee < 0){
            System.out.print("Invalid Input!\nThe base fee cant be negative\nTry Again...");
            baseFee = sc.nextDouble();
        }
        BaseFee = baseFee;
    }
    public void setVehichleModel(int vehichleModel) {
        while(vehichleModel > 2025 || vehichleModel < 1985){
            if(vehichleModel > 2025){
                System.out.print("Is your vehichle imported from the future\nTry again while entering the correct model...");
                vehichleModel = sc.nextInt();
            }else if(vehichleModel < 1985){
                System.out.print("We don't deal with ancient antiques better to take it to the museum\nTry again while entering the correct model this time.....");
                vehichleModel = sc.nextInt();
            }
        }
        VehichleModel = vehichleModel;
    }
    public void setInspectionId(int inspectionId) {
        while(inspectionId < 100 || inspectionId > 9999){
            System.out.print("The Inspection Id must be greater than two digit number and less than 5 digit number!\nTry again.....");
            inspectionId = sc.nextInt();
        }
        InspectionId = inspectionId;
    }  
    // public void setVehichleType(String vehichleType) {
    //     if(!vehichleType.equals("Truck") || !vehichleType.equals("Car") || !vehichleType.equals("Motorcycle")){
    //         System.out.println("We dont service "+vehichleType+" we only service 'Truck','Car' & 'Motorcycle'\nTry again If you miss spelled the Vehichle Type");
    //     }
    //     VehichleType = vehichleType;
    // }

    //Getters
    public int getInspectionId() {
        return InspectionId;
    }
    public String getVehichleType() {
        return VehichleType;
    }
    public int getVehichleModel() {
        return VehichleModel;
    }
    public double getBaseFee() {
        return BaseFee;
    }
    public double getFinalFee() {
        return FinalFee;
    }
    public float getAverage() {
        return average;
    }
    //OilLevel
    protected abstract void checkOilLevel();
    //Health Check
    protected abstract void checkEngineHealth();

    public void displayInfo(){
        System.out.println("Inspection Id number = "+InspectionId);
        System.out.println("Vehichle type = "+VehichleType);
        System.out.println("Vehichle Model = "+VehichleModel);
        System.out.println("Average of your car is : "+average);
    }
        
}   