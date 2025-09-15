package p3;

class Student{
    String name;
    int age;

    public void print(){
        System.out.println(name);
        System.out.println(age);
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

        Student(){
}

}

public class copyConstructor{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Arman";
        s1.age = 34;

        Student s2 = new Student(s1);

        s2.print();

    }
}