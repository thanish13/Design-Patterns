package org.t13.app.factory;

public class Main{

    public static void main() {
        TransportApp carApp = new TransportApp(new CarTransportFactory());
        carApp.deliver();
        TransportApp busApp = new TransportApp(new BusTransportFactory());
        busApp.deliver();
    }
}
