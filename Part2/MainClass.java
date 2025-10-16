package Part2;
import java.util.Scanner;
public class MainClass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //Drama 1
        System.out.print("Enter the Drama ID :");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Name of the Drama :");
        String name = sc.nextLine();

        Drama D1 = new Drama(id, name);
        for(int i = 0; i<10; i++){
            System.out.print("Enter actor "+(i+1)+" Fee :");
            double a = sc.nextDouble();
            D1.setActorFee(i,a);
        }
        D1.getDramaId();
        D1.getDramaName();
        D1.getDramaTotalCost();
        for(int i = 0; i<10; i++){
            D1.getActorFee(i);
        }
        D1.getDramaTotalCost();
        D1.calculateDramaTotalCost();
        System.out.println("\nInfo of First Drama");
        D1.displayInfo();

        // Drama 2
        System.out.print("\nEnter the Drama ID :");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Name of the Drama :");
        String name2 = sc.nextLine();

        Drama D2 = new Drama(id2, name2);
        for(int i = 0; i<10; i++){
            System.out.print("Enter actor "+(i+1)+" Fee :");
            double a = sc.nextDouble();
            D2.setActorFee(i,a);
        }
        D2.getDramaId();
        D2.getDramaName();
        D2.getDramaTotalCost();
        for(int i = 0; i<10; i++){
            D2.getActorFee(i);
        }
        D2.getDramaTotalCost();
        D2.calculateDramaTotalCost();
        System.out.println("\nInfo of Second Drama");
        D2.displayInfo();
        System.out.println();

        // Drama 3
        System.out.print("\nEnter the Drama ID :");
        int id3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Name of the Drama :");
        String name3 = sc.nextLine();

        Drama D3 = new Drama(id3, name3);
        for(int i = 0; i<10; i++){
            System.out.print("Enter actor "+(i+1)+" Fee :");
            double a = sc.nextDouble();
            D3.setActorFee(i,a);
        }
        D3.getDramaId();
        D3.getDramaName();
        D3.getDramaTotalCost();
        for(int i = 0; i<10; i++){
            D3.getActorFee(i);
        }
        D3.getDramaTotalCost();
        D3.calculateDramaTotalCost();
        System.out.println("\nInfo of Third Drama");
        D3.displayInfo();

        Drama.displaytotalDramaObjectsCreated();
        System.out.println();
        int result = D1.countEqualCosts(D2,D3);
        System.out.println("Number of equal Costs = "+result);

        sc.close();
    }
}
