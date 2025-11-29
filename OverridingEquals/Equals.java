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
        if(!(e2 instanceof Equals)){
            return false;
        }
        Equals pov = (Equals)e2;
        return this.h == pov.h && this.y == pov.y;
    }
}
