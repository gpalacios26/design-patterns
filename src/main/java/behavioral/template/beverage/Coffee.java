package behavioral.template.beverage;

public class Coffee extends HotBeverage {

    @Override
    protected void brew() {
        System.out.println("Preparando café...");
    }

    @Override
    protected void addExtras() {
        System.out.println("Agregando azúcar y leche...");
    }
}
