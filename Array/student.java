package Array;

public class student {
    private String Name;
    private int id;
    private int[] MobileNum;
    private String[] address;

    student(String Name, int id, int[] MobileNum, String[] address){
        this.id = id;
        this.Name = Name;
        this.MobileNum = MobileNum;
        this.address = address;
    }

    int  getID(){
        return id;
    }
    String getName(){
        return Name; 
    }
    int[] getMobile(){
        return MobileNum;
    }
    String[] getAddress(){
        return address;
    }
    
}
