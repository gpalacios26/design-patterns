package behavioral.command.home.impl;

import behavioral.command.home.Command;
import behavioral.command.home.Light;

public class TurnOffLightCommand implements Command {

    private final Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
