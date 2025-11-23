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
        super.checkEngineHealth(12.3f);
        count += 4;
    }
    public void checkOilLevel(){
        average = (float)Math.random()*(30-10+1)-10;
        if(average > 12.3){
            System.out.println("Oil level is good");
        }else{
            System.out.println("Oil level is not good");
        }
        count += 6;
    }
    public void calFinalFee(){
        // Along with 3.2% of tax
        FinalFee = (count*BaseFee)*3.2;
    }
}
