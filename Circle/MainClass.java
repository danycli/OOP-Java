package Circle;

public class MainClass {
    public static void main(String [] args){
        circle c1 = new circle();
        c1.setradius(6);
        c1.setarea(67f);
        c1.setcircumference(43f);

        circle c2 = new circle();
        c2.setradius(6);
        c2.setarea(67f);
        c2.setcircumference(43f);



        circle c3 = circle.addCircle(c1,c2);

        circle c4 = new circle(c3);

        
        c4.displayinfo();
    }
}
