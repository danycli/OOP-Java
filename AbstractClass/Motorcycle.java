package AbstractClass;

public class Motorcycle extends Vehichle{
    private int count = 1;
    public Motorcycle(int inspectionId, double baseFee, int vehichleModel){
        super(inspectionId,baseFee,vehichleModel);
        VehichleType = "MotorCycle";
    }

    public void checkEngineHealth(){
        if(average > 33.7){
            System.out.println("Engine Health is Good");
        }else{
            System.out.println("Engine Health is not good");
        }
        count += 3;
    }
    public void checkOilLevel(){
        average = (float)Math.random()*(60-30+1)-30;
        if(average > 46.7){
            System.out.println("Oil level is good");
        }else{
            System.out.println("Oil level is not good");
        }
        count += 2;
    }
    public void calFinalFee(){
        // Along with 1.5% of tax
        FinalFee = (count*BaseFee)*1.5;
    }
}
