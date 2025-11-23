package AbstractClass;

public class Car extends Vehichle{
    //Initialize as one so the final fee didnt become zero
    private int count = 1;
    public Car(int inspectionId, double baseFee, int vehichleModel){
        super(inspectionId,baseFee,vehichleModel);
        VehichleType = "Car";
    }
    @Override
    public void checkEngineHealth(){
        super.checkEngineHealth();
        count += 4;
    }
    @Override
    public void checkOilLevel(){
        average =(float)(10+ Math.random()*(30-10));
        super.checkOilLevel();
        count += 6;
    }
    public void calFinalFee(){
        // Along with 3.2% of tax
        FinalFee = (count*BaseFee)*3.2;
    }
}
