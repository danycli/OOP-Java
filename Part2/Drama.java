package Part2;

public class Drama {
    int dramaId;
    String DramaName;
    double[] actorsFee = new double[10];
    static final String CompanyName = "The Random Productions";
    double dramaTotalCost;
    static int totalDramaObjectsCreated = 0;

    Drama(int dramaId, String DramaName){
        this.dramaId = dramaId;
        this.DramaName = DramaName;
        totalDramaObjectsCreated ++;
    }
    void setDramaId (int ID){
        this.dramaId = ID;
    }
    void setDramaName (String name){
        this.DramaName = name;
    }
    void setActorFee (int index, double fee){
        this.actorsFee[index] = fee;
    }

    int getDramaId(){
        return dramaId;
    }
    String getDramaName(){
        return DramaName;
    }
    static String getCompanyName(){
        return CompanyName;
    }
    double getActorFee(int index){
        return actorsFee[index];
    }
    double getDramaTotalCost(){
        return dramaTotalCost;
    }
    static int getTotalDramaObjectsCreated(){
        return totalDramaObjectsCreated;
    }

    void calculateDramaTotalCost(){
        for(int i = 0; i<actorsFee.length; i++){
            dramaTotalCost += actorsFee[i];
        }
    }
    void displayInfo(){
        System.out.println("Drama ID = "+dramaId);
        System.out.println("Drama Name ="+DramaName);
        System.out.println("Company Name ="+CompanyName);
        for(int i = 0; i<actorsFee.length; i++){
            System.out.println("Actor "+(i+1)+" Fee = "+actorsFee[i]);
        }
        System.out.println("Drama Total Cost = "+dramaTotalCost);
    }   
    static void displaytotalDramaObjectsCreated(){
        System.out.println("Total Objects Created = "+totalDramaObjectsCreated);
    }
    int countEqualCosts( Drama D1, Drama D2 ){
        int count = 0;
        if(this.dramaTotalCost == D2.dramaTotalCost){
            count++;
        }
        if(this.dramaTotalCost == D1.dramaTotalCost){
            count++;
        }
        return count;
    }
}   
