package main;

public class App
{
    public static void main(String[] args) 
    {
        var l = new Light();
        var c = new LambdaCommand(() -> l.on());
        c.execute();
    }
}
