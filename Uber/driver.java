package Uber;

public class driver {
    private String Name;
    private int UberID; 
    private int mobileNo;
    private String vehichleNo;
    private String vehichleType;
    private int ammountCharging;


    public void setName(String name){
        Name = name;
    }    
    public void setUberId(int id){
        UberID = id;
    } 
    public void setMobileNo(int number){
        mobileNo = number;
    }
    public void setVehichleNumber(String vehichle){
        vehichleNo = vehichle;
    }
    public void settype(String type){
        vehichleType = type;
    }

    public String getName(){
        return Name;
    }
    public int getId(){
        return UberID;
    }
    public int getMobile(){
        return mobileNo;
    }
    public String getVehichle(){
        return vehichleNo;
    }
    public String getvehichleTyepe(){
        return vehichleType;
    }
    public int getAmmount(){
        return ammountCharging;
    }

    public void calculateAmmount(int km){
        if(km >= 10){
            ammountCharging = 120;
        }else if(km >= 25){
            ammountCharging = 250;
        }else if(km >= 50){
            ammountCharging = 450;
        }else{
            ammountCharging = 1000;
        }
    }
    
}
