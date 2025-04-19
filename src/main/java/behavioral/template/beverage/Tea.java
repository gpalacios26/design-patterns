package behavioral.template.beverage;

public class Tea extends HotBeverage {

    @Override
    protected void brew() {
        System.out.println("Preparando té...");
    }

    @Override
    protected void addExtras() {
        System.out.println("Agregando miel...");
    }
}
