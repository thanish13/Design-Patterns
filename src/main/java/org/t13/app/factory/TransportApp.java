package org.t13.app.factory;

public class TransportApp {

    private final TransportFactory transportFactory;

    public TransportApp(TransportFactory transportFactory) {
        this.transportFactory = transportFactory;
    }

    public void deliver() {
        transportFactory.deliver();
    }

}
