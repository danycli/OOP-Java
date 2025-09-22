package P8;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        patient p1 = new patient();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient's Name :");
        String Name = sc.nextLine();

        System.out.print("Enter Patient's ID :");
        int id = sc.nextInt();

        p1.setPatientId(id);
        p1.setPatientName(Name);

        p1.findCondition(250);
        p1.findNumberofDaysAdmitted();
        p1.findDiseaseName(1,0);
        p1.calculateFee();

        System.out.println();

        // Donation
        p1.displayInfo();
        double donation = p1.getFee()*(3.0/100.0);
        System.out.println(donation+" is the 3% of "+p1.getFee()+" and will be used for donations.");

        // Counting days
        for(int i = 1; i <= p1.getNoOfDaysAdmitted(); i++){
            System.out.print(i+" ");
            if(i == p1.getNoOfDaysAdmitted()){
                System.out.println("Days");
            }
        }
        // Updating Patient ID
        if(p1.getPatientID() < 100){
            int last = p1.getPatientID()%10;
            System.out.println("Updated Patient ID ="+last + p1.getPatientID());
        }
        // Next Prime
        if(p1.getNoOfDaysAdmitted() % 2 != 0){
            int prime = 1;
            if(p1.getNoOfDaysAdmitted() <= 1){
                prime = 0;
            }
            for (int i = 2; i * i <= p1.getNoOfDaysAdmitted(); i++){
                if(p1.getNoOfDaysAdmitted() % i == 0){
                    prime = 0;
                }
            }
            if(prime == 1){
                for(int i = p1.getNoOfDaysAdmitted()+1; i * i <=p1.getNoOfDaysAdmitted()+200; i++){
                    if((p1.getNoOfDaysAdmitted()+1)%i != 0){
                        System.out.println("The Number of days were prime "+p1.getNoOfDaysAdmitted()+" and the next prime number after it is "+i);
                        break;
                    }
                }
            }
        }

        sc.close();

    }
}
