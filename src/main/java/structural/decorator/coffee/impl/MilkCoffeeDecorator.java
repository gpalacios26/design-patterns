package structural.decorator.coffee.impl;

import structural.decorator.coffee.Coffee;
import structural.decorator.coffee.CoffeeDecorator;

public class MilkCoffeeDecorator extends CoffeeDecorator {

    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", con leche";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;
    }
}
