package behavioral.strategy.shop.impl;

import behavioral.strategy.shop.DiscountStrategy;

public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price; // Sin descuento
    }
}
