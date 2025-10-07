package constructor;

public class MainClass {
    public static void main(String [] args){
        copy c1 = new copy();
        c1.setID(34);
        c1.setName("Danial");
        c1.setsalary(234887.6f);

        copy c2 = copy.assign(c1);

        c2.displayInfo();

    }

}
