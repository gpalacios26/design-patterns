package behavioral.strategy;

import behavioral.strategy.shop.ShoppingCart;
import behavioral.strategy.shop.impl.MembershipDiscountStrategy;
import behavioral.strategy.shop.impl.NoDiscountStrategy;
import behavioral.strategy.shop.impl.SeasonalDiscountStrategy;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setDiscountStrategy(new NoDiscountStrategy());
        System.out.println("Precio final (sin descuento): " + cart.calculateTotal(100));

        cart.setDiscountStrategy(new SeasonalDiscountStrategy());
        System.out.println("Precio final (descuento estacional): " + cart.calculateTotal(100));

        cart.setDiscountStrategy(new MembershipDiscountStrategy());
        System.out.println("Precio final (descuento por membresía): " + cart.calculateTotal(100));
    }
}
