package org.t13.app.strategy;

public class Order {


    public void completePay(PaymentStrategy strategy)  {
        strategy.pay();
    }
}
