package behavioral.template.beverage;

/**
 * Patrón Template
 * Propósito: Clase abstracta que define el esqueleto del algoritmo.
 */
public abstract class HotBeverage {

    public final void prepare() {
        boilWater();
        brew();
        pourIntoCup();
        addExtras();
    }

    private void boilWater() {
        System.out.println("Hirviendo agua...");
    }

    private void pourIntoCup() {
        System.out.println("Sirviendo en taza...");
    }

    // Métodos que serán implementados por las subclases
    protected abstract void brew();
    protected abstract void addExtras();
}
