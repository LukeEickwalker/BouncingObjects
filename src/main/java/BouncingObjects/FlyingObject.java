package BouncingObjects;

import java.awt.Color;

public abstract class FlyingObject implements Flying {
    double rx, ry;
    private double vx, vy;
    Color  c;
    FlyingObject() {
        rx = 0.0;  ry = 0.0;
        vx = Math.random()*0.01;  vy = Math.random()*0.01;
        c = new Color((int)(255.0*Math.random()),
                      (int)(255.0*Math.random()),(int)(255.0*Math.random()));
    }

    public void move() {
        if (Math.abs(rx + vx) > 1.0) vx = -vx;
        if (Math.abs(ry + vy) > 1.0) vy = -vy;
        rx = rx + vx;   ry = ry + vy;
    }

    public abstract void draw();
}
