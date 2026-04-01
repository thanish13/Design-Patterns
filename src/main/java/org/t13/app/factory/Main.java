package org.t13.app.factory;

public class Main{

    public static void main() {
        TransportApp carApp = new TransportApp(new CarTransport());
        carApp.deliver();
        TransportApp busApp = new TransportApp(new BusTransport());
        busApp.deliver();
    }
}
