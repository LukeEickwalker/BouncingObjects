package BouncingObjects;

public class Box extends FlyingObject {

    private double lx, ly;
    
    public Box() {
        super();
        this.lx = Math.random() * 0.06;
        this.ly = Math.random() * 0.06;
    }
    
    public void draw() {
        StdDraw.setPenColor(c);
        StdDraw.filledRectangle(rx, ry, lx, ly);
    }
}
