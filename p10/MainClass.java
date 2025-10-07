package p10;
import java.util.Scanner;
public class MainClass{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Id = ");
        int id = sc.nextInt();
        BankAccount b1 = new BankAccount(id);
        
        b1.DisplayAccountInformation();
        
        sc.nextLine();
        System.out.print("Enter Holders Name = ");
        String name = sc.nextLine();
        b1.setAccHolderName(name);
        
        System.out.print("Enter Account Type = ");
        String type = sc.nextLine();
        b1.setAccType(type);
        
        System.out.print("Enter the amount you want to Deposit = ");
        double depoAmount = sc.nextDouble();
        b1.DepositAmount(depoAmount);
        
        System.out.print("Enter the amount you want to Withdraw = ");
        double WithAmount = sc.nextDouble();
        b1.WithdrawAmount(WithAmount);
        
        b1.DisplayAccountInformation();
        b1.checkBalanceThresholdValueandDisplayAlert();
        
        System.out.print("Now for Holder 2 = ");
        
        System.out.print("Enter Account Id = ");
        int ID = sc.nextInt();
        
        System.out.print("Enter Account Holder Name = ");
        String holderName = sc.nextLine();
        
        System.out.print("Enter Account Type = ");
        String TYPE = sc.nextLine();
        
        System.out.print("Enter the balance = ");
        double BALANCE = sc.nextDouble();
        
        BankAccount b2 = new BankAccount(ID,holderName,TYPE,BALANCE);
        b2.DisplayAccountInformation();
        
        System.out.print("Enter the amount you want to Withdraw = ");
        double WITH = sc.nextDouble();
        b2.WithdrawAmount(WITH);
        b2.DisplayAccountInformation();
        
        System.out.print("Enter the amount you want to Deposit = ");
        double DEP = sc.nextDouble();
        b2.DepositAmount(DEP);
        b2.DisplayAccountInformation();
        
        b2.checkBalanceThresholdValueandDisplayAlert();

        sc.close();
    }
}