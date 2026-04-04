package org.t13.app.adaptor;

public class CircleClient {

    private final Circle circle;

    public CircleClient(Circle circle) {
        this.circle = circle;
    }

    public void run() {
        System.out.println("Circle run");
        circle.area();
    }
}
