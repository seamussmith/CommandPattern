package main;

import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaCommand implements ICommand {

    Runnable callback;
    public LambdaCommand(Runnable callback) {
        this.callback = callback;
    }
    @Override
    public void execute() {
        callback.run();
    }
    
}
