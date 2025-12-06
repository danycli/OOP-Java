package Assignment03.Program1;

public class MainClass {
    public static void main(String [] args){
        Student S1 = new Student(1, "Danial Ahmed", 5);
        Student S2 = new Student(2, "Saad Khan", 6);
        S2.setMarks(4, 89);
        //No Errr
        S1.setMarks(4, 89);
        System.out.println(S1.getMarks(4));
        //Array Out of Bound
        S1.setMarks(6, 32);
        System.out.println(S1.getMarks(6));
        //Marks Exception(User Defined)
        S1.setMarks(2, 101);
        System.out.println(S1.getMarks(2));
        //Getter Exception error for Array Out of bound
        System.out.println(S2.getMarks(7));
        //The static method(No error)
        Student.sumOfTwoStudentsMarks(S1, S2, 4);
        //Nul pointer Error
        System.out.println(Student.sumOfTwoStudentsMarks(S1, S2, 1));
        //Arra bound Exception
        System.out.println(Student.sumOfTwoStudentsMarks(S1, S2, 5));
    }
}
