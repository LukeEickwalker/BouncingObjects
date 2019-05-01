package BouncingObjects;

public class Ellipse extends FlyingObject {

    private double lx, ly;

    public Ellipse() {
        super();
        lx = Math.random() * 0.06;
        ly = Math.random() * 0.06;
    }

    public void draw() {
        StdDraw.setPenColor(c);
        StdDraw.filledEllipse(rx, ry, lx, ly);
    }
}
