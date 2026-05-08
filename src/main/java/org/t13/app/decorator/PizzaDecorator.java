package org.t13.app.decorator;

public abstract class PizzaDecorator implements Pizza{

    protected Pizza pizza;

    protected PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return pizza.description();

    }

    @Override
    public double price() {
        return pizza.price();
    }
}
