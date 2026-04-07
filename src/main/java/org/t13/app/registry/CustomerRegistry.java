package org.t13.app.registry;

import java.util.HashMap;
import java.util.Map;

public class CustomerRegistry {

    private final Map<String, Customer> customerMap;

    public CustomerRegistry() {
        this.customerMap = new HashMap<>();
    }

    public Customer addCustomer(Customer customer) {
        System.out.println("Adding customer " + customer);
        return customerMap.put(customer.id(), customer);
    }

    public Customer getCustomer(String id) {
        System.out.println("Getting customer " + id);
        return customerMap.get(id);
    }
}
