package org.t13.app.factory;

public class BusTransportFactory implements TransportFactory{

    @Override
    public void deliver() {
        System.out.println("Deliver via bus transport");
    }
}
