package behavioral.command;

import behavioral.command.home.Command;
import behavioral.command.home.Light;
import behavioral.command.home.RemoteControl;
import behavioral.command.home.impl.TurnOffLightCommand;
import behavioral.command.home.impl.TurnOnLightCommand;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remote = new RemoteControl();

        Command turnOn = new TurnOnLightCommand(light);
        remote.setCommand(turnOn);
        remote.pressButton();

        Command turnOff = new TurnOffLightCommand(light);
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
