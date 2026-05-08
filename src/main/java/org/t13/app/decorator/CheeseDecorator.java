package org.t13.app.decorator;

public class CheeseDecorator extends PizzaDecorator{

    protected CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String description() {
        return super.description() + ", cheese";
    }

    @Override
    public double price() {
        return super.price() + 1.5; // Cost of cheese topping
    }
}
