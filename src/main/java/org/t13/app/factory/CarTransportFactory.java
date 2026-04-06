package org.t13.app.factory;

public class CarTransportFactory implements TransportFactory {


    @Override
    public Transport createTransport() {
        return new CarTransport();
    }
}
