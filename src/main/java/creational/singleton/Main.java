package creational.singleton;

public class Main {

    public static void main(String[] args) {
        Config config = Config.getInstance();
        System.out.println("Nombre de la aplicación 1: " + config.getAppName());

        Config config2 = Config.getInstance();
        System.out.println("Nombre de la aplicación 2: " + config2.getAppName());
    }
}
