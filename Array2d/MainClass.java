package Array2d;

public class MainClass {
    public static void main(String [] args){
        aray a1 = new aray();
        aray a2 = new aray();
        aray a3 = new aray();
        aray a4 = new aray();
        int[][] r = {{1,1},{1,1}};
        int[][] c = {{2,2},{2,2}};

        a1.seta(r, r.length, r.length);
        a1.setb(c, c.length, c.length);
        a1.calSum(r.length, r.length);
        a1.calMult(r.length);
        a1.display();
        a2.display();
        a3.display();
        a4.display();
    }   
}
