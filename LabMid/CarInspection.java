package LabMid;

public class CarInspection {
    private int CarInspectionId;
    private int CarId;
    private int[] partsID=new int[5];
    private double[] partsPrice=new double[5];
    private double totalCost;


    CarInspection(int carInspectionId, int carID){
        CarInspectionId = carInspectionId;
        CarId = carID;
    }

    void setCarInspectionId(int rpid){
        CarInspectionId = rpid;
    }
    void setCarId(int carid){
        CarId = carid;
    }
    void setpartsID(int index, int pid){
        partsID[index] = pid; 
    }
    void setpartsPrice(int index,double pp){
        partsPrice[index] = pp;
    }


    int getCarInspectionId(){
        return CarInspectionId;
    }
    int getcarId(){
        return CarId;
    }
    int getpartsID(int index){
        return partsID[index];
    }
    double getpartsPrice(int index){
        return partsPrice[index];
    }


    public void CarInspected(int[] partsid, double[] partsprice){
        this.partsID = partsid.clone();
        this.partsPrice = partsprice.clone();
    }


    public void displayInfo(){
        System.out.println("Car Id = "+CarId);
        System.out.println("Car Inscpection Id = "+CarInspectionId);
        System.out.print("Parts Id = [ ");
        for(int i = 0; i < partsID.length; i++){
            if(i!=partsID.length){
                System.out.print(i+", ");
            }else{
                System.out.print(i);
            }
        }
        System.out.print(" ]");

        System.out.print("Parts price according to Id = [ ");
        for(int i = 0; i < partsPrice.length; i++){
            if(i!=partsPrice.length){
                System.out.print(i+", ");
            }else{
                System.out.print(i);
            }
        }
        System.out.print(" ]");

        System.out.println("Total Cost = "+totalCost);
    }

    void CalTotalCost(){
        for(int i = 0; i < partsPrice.length; i++){
            totalCost += partsPrice[i];
        }
    }

    public static double AddTotalCost(CarInspection A, CarInspection B){
        double cost = A.totalCost + B.totalCost;
        return cost;
    }

    public boolean checkArrays(){
        boolean chk = false;
        for(int i = 0; i < partsID.length; i++){
            if(partsID[i] == (int)partsPrice[i]){
                chk = true;
            }else{
                chk = false;
                break;
            }
        }
        return chk;
    }

    public boolean checkSequence(){
        boolean chk = true;
        for(int i = 0; i < partsPrice.length - 1; i++){
            double diff = partsPrice[i + 1] - partsPrice[i];
            if (diff != 0.1) {
                chk = false;
                break; 
            }
        }
        return chk;
    }
    public int[] findRangeOfValues() {
        int[] result = new int[3];
        int Less10 = 0;
        int bw10And15 = 0;
        int great15 = 0;

            for (int i = 0; i < partsID.length; i++) {
                if (partsID[i] < 10) {
                    Less10++;
                } else if (partsID[i] > 10 && partsID[i] < 15) {
                    bw10And15++;
                } else if (partsID[i] > 15) {
                    great15++;
                }
            }

        result [0] = Less10;
        result [1] = bw10And15;
        result [2] = great15;
        return result;
    }

    public int[] searchValueAndReturnIndexes(double value){
        int a = 0;
        for(int i = 0; i < partsPrice.length; i++){
            if(partsPrice[i] == value){
                a++;
            }
        }
        int[] indexes = new int[a];
        int b = -1;
        for(int i = 0; i < partsPrice.length;i++){
            if(partsPrice[i] == value){
                b++;
                indexes[b] = i;
            }
        }
        return indexes;
    }

}
