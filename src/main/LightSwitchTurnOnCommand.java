package main;

public class LightSwitchTurnOnCommand implements ICommand {
    Light light;
    public LightSwitchTurnOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {

    }
    
}
