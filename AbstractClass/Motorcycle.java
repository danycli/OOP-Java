package AbstractClass;

public class Motorcycle extends Vehichle{
    private int count = 1;
    public Motorcycle(int inspectionId, double baseFee, int vehichleModel){
        super(inspectionId,baseFee,vehichleModel);
        VehichleType = "MotorCycle";
    }

    @Override
    public void checkEngineHealth(){
        super.checkEngineHealth();
        count += 4;
    }
    @Override
    public void checkOilLevel(){
        average = (float)(30+Math.random()*(60-30));
        super.checkOilLevel();
        count += 6;
    }
    public void calFinalFee(){
        // Along with 1.5% of tax
        FinalFee = (count*BaseFee)*1.5;
    }
}
