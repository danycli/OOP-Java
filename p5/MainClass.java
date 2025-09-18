package p5;
public class MainClass{
    public static void main(String args[]){
        Employee e1 = new Employee();
        e1.setID(136);
        e1.setName("Danial Ahmed");
        e1.setSalary(34.56);
        e1.setYearsofExperience(23);
        e1.display();

        System.out.println();
        Employee e2 = new Employee();
        e2.setID(107);
        e2.setName("Saad Khan");
        e2.setSalary(440);
        e2.setYearsofExperience(20);
        e2.display();
    }
}