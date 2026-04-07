package org.t13.app.registry;

public class App {

    public static void main(String[] args) {
        CustomerRegistry customerRegistry = new CustomerRegistry();
        var john = new Customer("1", "John");
        customerRegistry.addCustomer(john);
        var julia = new Customer("2", "Julia");
        customerRegistry.addCustomer(julia);

    }

}