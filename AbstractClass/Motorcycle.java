package AbstractClass;

public class Motorcycle extends Vehichle{
    public Motorcycle(int inspectionId, double baseFee, int vehichleModel, String vehichleType){
        super(inspectionId,baseFee,vehichleModel,vehichleType);
    }

    public void checkEngineHealth(){
        if(VehichleType.equals("Motorcycle") && average > 13.8){
            System.out.println("Engine Health is Good");
        }else{
            System.out.println("Engine Health is not good");
        }
    }
}
