package BouncingObjects;

public class Ball extends FlyingObject {

    private double radius;
    
    public Ball() {
        super();
        radius = Math.random() * 0.06;
    }

    public void draw() {
        StdDraw.setPenColor(c);
        StdDraw.filledCircle(rx, ry, radius);
    }
}
