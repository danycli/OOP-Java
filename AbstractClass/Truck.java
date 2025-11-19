package AbstractClass;

public class Truck extends Vehichle{
        public Truck(int inspectionId, double baseFee, int vehichleModel){
        super(inspectionId,baseFee,vehichleModel);
    }
    public void checkEngineHealth(){
        if(VehichleType.equals("Truck") && average > 4.1){
            System.out.println("Engine Health is Good");
        }else{
            System.out.println("Engine Health is not good");
        }
    }
    public void checkOilLevel(){
        average = (int)Math.random()*(7-3+1)-3;
    }
}
