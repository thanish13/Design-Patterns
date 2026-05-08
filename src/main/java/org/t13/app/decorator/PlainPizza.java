package org.t13.app.decorator;

public class PlainPizza implements Pizza {

    @Override
    public String description() {
        return "Plain";
    }

    @Override
    public double price() {
        return 8;

    }
}
