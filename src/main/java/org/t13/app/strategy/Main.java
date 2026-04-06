package org.t13.app.strategy;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        PaymentStrategy ccPayment = new CreditCardPayment();
        order.completePay(ccPayment);
        PaymentStrategy dcPayment = new DebitCardPayment();
        order.completePay(dcPayment);
    }
}
