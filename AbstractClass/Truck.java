package AbstractClass;
public class Truck extends Vehichle{
    private int count = 1;
        public Truck(int inspectionId, double baseFee, int vehichleModel){
        super(inspectionId,baseFee,vehichleModel);
        VehichleType = "Truck";
    }
    @Override
    public void checkEngineHealth(){
        super.checkEngineHealth();
        count += 5;
    }
    @Override
    public void checkOilLevel(){
        average = (float)(3+Math.random()*(7-3));
        super.checkOilLevel();
        count += 7;
    }
    public void calFinalFee(){
        // Along with 4.7% of tax
        FinalFee = (count*BaseFee)*4.7;
    }
}
