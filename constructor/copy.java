package constructor;

public class copy {
    private int id;
    private float salary;
    private String Name;

    void setID(int id){
        this.id = id;
    }
    void setsalary(float salary){
        this.salary = salary;
    }
    void setName(String Name){
        this.Name = Name;
    }

    int getId(){
        return id;
    }
    float getsalary(){
        return salary;
    }
    String getName(){
        return Name;
    }

    void displayInfo(){
        System.out.println("Name = "+Name);
        System.out.println("Id = "+id);
        System.out.println("Salary = "+salary);
    }

    public static copy assign(copy c1){
        int A = c1.id +543;
        String B = c1.Name+" & Saad Khan";
        float C = c1.salary+343548.654f;

        copy c3 = new copy();
        c3.id = A;
        c3.Name = B;
        c3.salary = C;

        return c3;
    }
}
