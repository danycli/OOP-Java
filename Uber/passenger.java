package Uber;

public class passenger {
    private String Name;
    private String Location;
    private int MobileNo;
    
    public void setName(String name){
        Name = name;
    }
    public void setLocation(String location){
        Location = location;
    }
    public void setMobileNo(int number){
        MobileNo = number;
    }
    public String getName(){
        return Name;
    }
    public String getLocation(){
        return Location;
    }
    public int getMobileNo(){
        return MobileNo;
    }

}
