package org.t13.app.factory;

public class BusTransport implements Transport{

    @Override
    public void deliver() {
        System.out.println("Deliver via bus transport");
    }
}
