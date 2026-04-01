package org.t13.app.factory;

public class BusTransport implements TransportFactory{

    @Override
    public void deliver() {
        System.out.println("Deliver via bus transport");
    }
}
