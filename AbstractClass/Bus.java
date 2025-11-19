package AbstractClass;

public class Bus extends Vehichle{
        public Bus(int inspectionId, double baseFee, int vehichleModel, String vehichleType){
        super(inspectionId,baseFee,vehichleModel,vehichleType);
    }
    public void checkEngineHealth(){
        if(VehichleType.equals("Truck") && average > 7.2){
            System.out.println("Engine Health is Good");
        }else{
            System.out.println("Engine Health is not good");
        }
    }
}
