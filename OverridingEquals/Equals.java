package OverridingEquals;

public class Equals extends Object{
    private int h;
    private int y;

    public Equals(int h, int y) {
        this.h = h;
        this.y = y;
    }
    @Override
    public boolean equals(Object e2){
        Equals pov = (Equals)e2;
        boolean chk = false;
        if(this.h == pov.h && this.y == pov.y){
            chk = true;
        }
        return chk;
    }
}
