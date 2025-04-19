package behavioral.strategy.shop.impl;

import behavioral.strategy.shop.DiscountStrategy;

public class MembershipDiscountStrategy implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price * 0.8; // 20% de descuento
    }
}
