package behavioral.template;

import behavioral.template.beverage.Coffee;
import behavioral.template.beverage.HotBeverage;
import behavioral.template.beverage.Tea;

public class Main {

    public static void main(String[] args) {
        HotBeverage coffee = new Coffee();
        HotBeverage tea = new Tea();

        System.out.println("Preparando café:");
        coffee.prepare();

        System.out.println("\nPreparando té:");
        tea.prepare();
    }
}
