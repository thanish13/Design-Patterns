package org.t13.app.factory;

public class Main{

    public static void main() {

        TransportFactory carTransportFactory = new CarTransportFactory();
        Transport car = carTransportFactory.createTransport();
        car.deliver();
        TransportFactory busTransportFactory = new BusTransportFactory();
        Transport bus = busTransportFactory.createTransport();
        bus.deliver();
    }
}
