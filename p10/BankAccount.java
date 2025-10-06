package p10;
public class BankAccount{
    private int Account_ID;
    private String Account_Holder_Name;
    private String Account_Type;//Saving or Current
    private double Balance;
    
    BankAccount (int acc_ID){
    this.Account_ID = acc_ID;
    this.Account_Holder_Name = "Unknown";
    this.Account_Type = "Unknown";
    this.Balance = 0.0;
    }
    BankAccount(int acc_ID, String acc_holder_name, String acc_type, double balance){
    this.Account_ID = acc_ID;
    this.Account_Holder_Name = acc_holder_name;
    this.Account_Type = acc_type;
    this.Balance = balance;
    }
    
    void setAcc_ID(int ID){
    this.Account_ID = ID;
    }
    void setAccHolderName(String name){
    this.Account_Holder_Name = name;
    }
    void setAccType(String type){
    this.Account_Type = type;
    }
    public int getAccID(){
    return Account_ID;
    }
    public String getAccHolderName(){
    return Account_Holder_Name;
    }
    public String getAccType(){
    return Account_Type;
    }
    public double getBalance(){
    return Balance;
    }
    
    void DepositAmount(double amount){
     Balance += amount;
    }
    void WithdrawAmount(double amount){
    this.Balance -= amount;
    }
    void DisplayAccountInformation(){
    System.out.println("Account ID = "+Account_ID);
    System.out.println("Account Holder Name = "+Account_Holder_Name);
    System.out.println("Account Type = "+Account_Type);
    System.out.println("Current Balance = "+Balance);
    }
    void checkBalanceThresholdValueandDisplayAlert(){
    if(Balance<100){
    System.out.println("Below Threshold");
    }else{
    System.out.println("Above Threshold");
    }
    }
}