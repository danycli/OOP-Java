package LabMid;
import java.util.Scanner;
public class MainClass {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car ID : ");
        int ID = sc.nextInt();
        System.out.print("Enter Inspection ID :");
        int IID = sc.nextInt();
        CarInspection C1 = new CarInspection(ID,IID);

        System.out.print("Enter Id for the next Car :");
        int nextID = sc.nextInt();
        System.out.print("Enter Inspection next Inspection ID :");
        int nextIID = sc.nextInt();
        CarInspection C2 = new CarInspection(nextID, nextIID);

        int[] pp = new int[5];
        for(int i = 0; i < pp.length; i++){
            System.out.print("Enter the price for the "+i+" part :");
            int price = sc.nextInt();
            pp[i] = price;
        }
        for(int i = 0; i < pp.length; i++){
            C1.setpartsPrice(i, pp[i]);
        }

        int[] pID = new int[5];
        for(int i = 0; i < pID.length; i++){
            System.out.print("Enter the ID for the "+i+" part :");
            int id = sc.nextInt();
            pID[i] = id;
        }
        for(int i = 0; i < pID.length; i++){
            C1.setpartsPrice(i, pID[i]);
        }

        int[] price2 = {2400,4500,1200,400,600};
        for(int i = 0; i < price2.length; i++){
            C2.setpartsPrice(i, price2[i]);
        }

        int[] id2 = {23,12,53,65,23};
        for(int i = 0; i < id2.length; i++){
            C2.setpartsID(i, id2[i]);
        }

        int[] inspectedPartsID1 = {23,54,76,98,12};
        double[] inspectedPrice1 = {1200,450,340,1200,600};
        for(int i = 0; i < inspectedPartsID1.length; i++){
            C1.CarInspected(inspectedPartsID1, inspectedPrice1);
        }

        int[] inspectedPartsID2 = {22,51,46,38,12};
        double[] inspectedPrice2 = {120,460,140,100,200};
        for(int i = 0; i < inspectedPartsID2.length; i++){
            C1.CarInspected(inspectedPartsID2, inspectedPrice2);
        }

        C1.CalTotalCost();
        C2.CalTotalCost();
        C1.displayInfo();
        C2.displayInfo();

        boolean checkArray = C1.checkArrays();
        if(checkArray == true){
            System.out.println("They are similar");
        }else{
            System.out.println("They are not similar");
        }
        
        boolean checkArray2 = C2.checkArrays();
        if(checkArray2 == true){
            System.out.println("They are similar");
        }else{
            System.out.println("They are not similar");
        }

        boolean checkSequence = C1.checkSequence();
        if(checkSequence == true){
            System.out.println("They are in sequence");
        }else{
            System.out.println("They are not in sequence");
        }

        int[] range = C1.findRangeOfValues();
        for(int i = 0; i < range.length; i++){
            System.out.println(range[i]);
        }

        int[] range2 = C2.findRangeOfValues();
        for(int i = 0; i < range2.length;i++){
            System.out.println(range2[i]);
        }

        System.out.print("Enter a price to get its indexes :");
        double val = sc.nextDouble();
        int[] Indexes = C1.searchValueAndReturnIndexes(val);
        for(int i = 0; i < Indexes.length; i++){
            System.out.println(Indexes[i]);
        }

        System.out.print("Enter a price to get its indexes :");
        double val2 = sc.nextDouble();
        int[] Indexes2 = C2.searchValueAndReturnIndexes(val2);
        for(int i = 0; i < Indexes2.length; i++){
            System.out.println(Indexes2[i]);
        }

        double totalCost = CarInspection.AddTotalCost(C1, C2);
        System.out.println("Total cost = "+totalCost);

        sc.close();

    }
}
