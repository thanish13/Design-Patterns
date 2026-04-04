package org.t13.app.adaptor;

public class Main {

    static void main() {
        System.out.println("Main run");
        Square square = new Square();
        ShapeAdapter shapeAdapter = new ShapeAdapter();
        CircleClient client = new CircleClient(shapeAdapter.adapt(square));
        client.run();
    }
}
