package org.t13.app.strategy;

public class DebitCardPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Debit card payment started");
    }
}
