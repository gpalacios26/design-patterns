package behavioral.strategy.shop.impl;

import behavioral.strategy.shop.DiscountStrategy;

public class SeasonalDiscountStrategy implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price * 0.9; // 10% de descuento
    }
}
