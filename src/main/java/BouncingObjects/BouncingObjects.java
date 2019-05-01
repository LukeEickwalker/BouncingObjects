package BouncingObjects;

public class BouncingObjects { 

    public static void main(String[] args) {

        Ball b = new Ball();
        System.out.println(b.c);
        
        // setup graphic window
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setXscale(-1.0, +1.0);  // set boundary between -1 and +1
        StdDraw.setYscale(-1.0, +1.0);

        // the bouncing object
        int N = 150;
        FlyingObject[] objs = new FlyingObject[N];
        for (int i = 0; i<N; i++) {
            if (Math.random() < 0.33) {
                objs[i] = new Ball();
            }
            else if (Math.random() >= 0.33 && Math.random() < 0.67){
                objs[i] = new Box();
            }
            else objs[i] = new Ellipse();
        }
        
        // do the animation loop
        while (true) {
            StdDraw.clear(StdDraw.GRAY);
            for (int i = 0; i<N; i++) {
                objs[i].move();
                objs[i].draw();
            }
            StdDraw.show(10);
        }
    }

    public String getGreeting() {
        return "Hello!";
    }
}
