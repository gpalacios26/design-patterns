package creational.singleton;

/**
 * Patrón Singleton
 * Propósito: Garantizar que una clase tenga solo una instancia y proporcionar un punto de acceso global a ella.
 */
public class Config {

    private static Config instance;
    private final String appName;

    // Constructor privado
    private Config() {
        this.appName = "Mi-App-Name";
    }

    // Método estático para obtener la instancia
    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getAppName() {
        return appName;
    }
}
