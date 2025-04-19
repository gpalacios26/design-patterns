package structural.decorator;

import structural.decorator.coffee.Coffee;
import structural.decorator.coffee.impl.MilkCoffeeDecorator;
import structural.decorator.coffee.impl.SimpleCoffee;
import structural.decorator.coffee.impl.SugarCoffeeDecorator;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkCoffeeDecorator(coffee);
        coffee = new SugarCoffeeDecorator(coffee);

        System.out.println("Descripción: " + coffee.getDescription());
        System.out.println("Costo: " + coffee.getCost());
    }
}
