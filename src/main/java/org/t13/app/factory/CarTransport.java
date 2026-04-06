package org.t13.app.factory;

public class CarTransport implements Transport{

    @Override
    public void deliver() {
        System.out.println("Deliver via car transport");
    }
}
