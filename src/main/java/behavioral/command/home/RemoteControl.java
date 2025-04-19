package behavioral.command.home;

/**
 * Patrón Command
 * Propósito: El patrón Command encapsula una solicitud como un objeto, lo que permite parametrizar a los clientes con diferentes solicitudes.
 */
public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
