package structural.decorator.coffee.impl;

import structural.decorator.coffee.Coffee;
import structural.decorator.coffee.CoffeeDecorator;

public class SugarCoffeeDecorator extends CoffeeDecorator {

    public SugarCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", con azúcar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.2;
    }
}
