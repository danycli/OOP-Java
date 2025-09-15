//There are three methods to make constructors....

package p2;

class Students{
    String name;
    int studentId;
    int age;

    public void printInfo(){
        System.out.println(name);
        System.out.println(studentId);
        System.out.println(age);
    }
    //First one..(Without parameters)
//     Students(){
//         System.out.println("We are manually makking this constructor....");
// }
    //Second one..(With parameters)
    Students(String newname, int newstudentId, int newage){
        this.name = newname;
        this.studentId = newstudentId;
        this.age = newage;
    }
}

public class constructors{
    public static void main(String args []){
        Students s1 = new Students("Lenovo", 2345, 8);//We will pass the arguments for 2nd type of constructor
        // s1.name = "Saad Khan";//for first type of constructor
        // s1.age = 21;
        // s1.studentId = 131;
        s1.printInfo();
        //Third type is copy constructor defined in package 3
    }
}