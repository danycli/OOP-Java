package AbstractClass;

public class Car extends Vehichle{
    public Car(int inspectionId, double baseFee, int vehichleModel){
        super(inspectionId,baseFee,vehichleModel);
    }


    public void checkEngineHealth(){
        VehichleType = "Car";
        if(average > 12.3){
            System.out.println("Engine Health is Good");
        }else{
            System.out.println("Engine Health is not good");
        }
    }
    public void checkOilLevel(){
        average = (float)Math.random()*(30-10+1)-10;
        if(average > 12.3){
            System.out.println("Oil level is good");
        }else{
            System.out.println("Oil level is not good");
        }
    }
}
