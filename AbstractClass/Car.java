package AbstractClass;

public class Car extends Vehichle{
    public Car(int inspectionId, double baseFee, int vehichleModel, String vehichleType){
        super(inspectionId,baseFee,vehichleModel,vehichleType);
    }


    public void checkEngineHealth(){
        if(VehichleType.equals("Car") && average > 11.4){
            System.out.println("Engine Health is Good");
        }else{
            System.out.println("Engine Health is not good");
        }
    }
    public void checkOilLevel(){
        
    }
}
