package org.t13.app.decorator;

public class Main {

    static void main() {

        Pizza pizza = new PlainPizza();
        System.out.println(pizza.description() + " Pizza costing : $" + pizza.price());
        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.description() + " Pizza costing : $" + pizza.price());
        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.description() + " Pizza costing : $" + pizza.price());

    }
}
