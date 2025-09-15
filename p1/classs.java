package p1;

class pen {
    String color;
    String type;

    public void write(){
        System.out.println("Nigah");
    }

    public void color(){
        System.out.println(this.color);
    }
}

public class classs{
    public static void main(){
        pen pen1 = new pen();
        pen1.color = "Blue";
        pen1.type = "Marker";

        pen1.write();
        pen1.color();
    }
}