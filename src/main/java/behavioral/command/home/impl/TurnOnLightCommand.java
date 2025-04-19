package behavioral.command.home.impl;

import behavioral.command.home.Command;
import behavioral.command.home.Light;

public class TurnOnLightCommand implements Command {

    private final Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
