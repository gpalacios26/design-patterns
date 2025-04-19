package structural.decorator.coffee.impl;

import structural.decorator.coffee.Coffee;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Café simple";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}
