package p1;

class pen{
    String color;
    String type;

    public void writing(){
        System.out.println("We are writing....");
    }

    public void peninfo(){
        System.out.println(color);
        System.out.println(type);
    }

}

public class classs{
    public static void main(String args []){
        pen p1 = new pen();
        p1.color = "Purple";
        p1.type = "Marker";
        p1.writing();
        p1.peninfo();
    }
}