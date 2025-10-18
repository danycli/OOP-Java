package Part3;

public class VehicleReservation {
    String VehicleID;
    String VehicleOwnerName;
    String VehicleType;
    int TotalTimeInMinutesForParking;
    int ParkingSlotId;
    float Bill;
    float Tax;
    static int CurrentlyTotalVehcilesInTheParking = 0;

    VehicleReservation(String VehichleID, String VehicleOwnerName, String VehicleType, int ParkingSlotId){
        this.VehicleID = VehichleID;
        this.VehicleOwnerName = VehicleOwnerName;
        this.VehicleType = VehicleType;
        this.ParkingSlotId = ParkingSlotId;
        CurrentlyTotalVehcilesInTheParking ++;
    }
    void setId(String Id){
        this.VehicleID = Id;
    }
    void setOwner(String owner){
        this.VehicleOwnerName = owner;
    }
    void setType(String type){
        this.VehicleType = type;
    }
    void setTime(int Time){
        this.TotalTimeInMinutesForParking = Time;
    }
    void setSlot(int Slot){
        this.ParkingSlotId = Slot;
    }

    String getid(){
        return VehicleID;
    }
    String getOwner(){
        return VehicleOwnerName;
    }
    String getType(){
        return VehicleType;
    }
    int getTime(){
        return TotalTimeInMinutesForParking;
    }
    int getSlot(){
        return ParkingSlotId;
    }
    float getBill(){
        return Bill;
    }
    float getTax(){
        return Tax;
    }
    void VehicleExitAndCalculateBill(){
        float bill = (float)TotalTimeInMinutesForParking*20.6f;
        CalculateTax(bill);
        this.Bill = bill + Tax;
        CurrentlyTotalVehcilesInTheParking --;
    }
    private void CalculateTax(float bill){
        if(this.VehicleType == "car" || this.VehicleType == "Car" || this.VehicleType == "CAR" ){
            this.Tax = (2.4f/100)*bill;
        }else if(this.VehicleType == "van" || this.VehicleType == "Van" || this.VehicleType == "VAN"){
            this.Tax = (4.1f/100)*bill;
        }else{
            this.Tax = (6f/100)*bill;
        }
    }
    public static boolean CompareVehiclesSlots(VehicleReservation V1, VehicleReservation V2){
        if(V1.ParkingSlotId == (V2.ParkingSlotId+1) || V1.ParkingSlotId == (V2.ParkingSlotId-1)){
            return true;
        }else{
            return false;
        }
    }

    void DisplayInfo(){
        System.out.println("\nVehichle ID = "+VehicleID);
        System.out.println("Name of the Owner = "+VehicleOwnerName);
        System.out.println("Time spend in Parking = "+TotalTimeInMinutesForParking);
        System.out.println("Parking Slot Id = "+ParkingSlotId);
        if(Bill != 0.0f){
            System.out.println("Tax = Rs: "+Tax);
            System.out.println("Total bill along with Tax = Rs: "+Bill);
        }else{
            System.out.println("Car is still in the ParkingLot");
        }
    }
    public static void DisplayCurrentlyTotalVehcilesInTheParking(){
        System.out.println("The number of Vehichles Currently in the Parking are = "+CurrentlyTotalVehcilesInTheParking);
    }
}