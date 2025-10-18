package Part3;
import java.util.Scanner;
public class MainClass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //First Vehichle
        VehicleReservation[] V = new VehicleReservation[2];
            System.out.println("Inputing Data for first Vehichle");
            System.out.print("Enter the Id for the Vehichle :");
            String id = sc.nextLine();
            System.out.print("Enter the Name of the owner :");
            String name = sc.nextLine();
            System.out.print("Enter Vehichle Type :");
            String type = sc.nextLine();
            System.out.print("Enter the total time Vehichle spend in the parkingLot :");
            int time = sc.nextInt();
            System.out.print("Enter the ParkingSlot Id :");
            int slot = sc.nextInt();

            V[0] = new VehicleReservation(id, name, type, slot);
            V[0].setTime(time);
            V[0].DisplayInfo();

            //Second Vehichle
            System.out.println("\nInputing Data for second Vehichle");
            sc.nextLine();
            System.out.print("Enter the Id for the Vehichle :");
            String id2 = sc.nextLine();
            System.out.print("Enter the Name of the owner :");
            String name2 = sc.nextLine();
            System.out.print("Enter Vehichle Type :");
            String type2 = sc.nextLine();
            System.out.print("Enter the total time Vehichle spend in the parkingLot :");
            int time2 = sc.nextInt();
            System.out.print("Enter the ParkingSlot Id :");
            int slot2 = sc.nextInt();

            V[1] = new VehicleReservation(id2, name2, type2, slot2);
            V[1].setTime(time2);
            V[1].VehicleExitAndCalculateBill();
            V[1].DisplayInfo();

            boolean result = VehicleReservation.CompareVehiclesSlots(V[0],V[1]);
            if(result == true){
                System.out.println("The Vehicles are beside eachother");
            }else{
                System.out.println("The Vehichles are not beside eachother");
            }
            VehicleReservation.DisplayCurrentlyTotalVehcilesInTheParking();

            sc.close();
    }
}
