package AbstractClass;

public class Motorcycle extends Vehichle{
    public Motorcycle(int inspectionId, double baseFee, int vehichleModel){
        super(inspectionId,baseFee,vehichleModel);
    }

    public void checkEngineHealth(){
        if(average > 33.7){
            System.out.println("Engine Health is Good");
        }else{
            System.out.println("Engine Health is not good");
        }
    }
    public void checkOilLevel(){
        average = (float)Math.random()*(60-30+1)-30;
        if(average > 46.7){
            System.out.println("Oil level is good");
        }else{
            System.out.println("Oil level is not good");
        }
    }
}
