package org.t13.app.factory;

public class BusTransportFactory implements TransportFactory {


    @Override
    public Transport createTransport() {
        return new BusTransport();
    }
}
