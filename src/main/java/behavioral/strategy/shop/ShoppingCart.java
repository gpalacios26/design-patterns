package behavioral.strategy.shop;

/**
 * Patrón Strategy
 * Propósito: Definir una familia de algoritmos, encapsular cada uno, y hacerlos intercambiables.
 */
public class ShoppingCart {

    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(double price) {
        return discountStrategy.applyDiscount(price);
    }
}
