package org.t13.app.strategy;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Credit card payment started");
    }
}
