package org.t13.app.factory;

public class CarTransport implements TransportFactory{

    @Override
    public void deliver() {
        System.out.println("Deliver via car transport");
    }
}
