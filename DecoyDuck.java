public class DecoyDuck extends Duck 
{
    // Constructor for DecoyDuck
    public DecoyDuck() 
    {
        // DecoyDuck does not quack
        quackBehavior = new Mute();
        // DecoyDuck does not swim
        swimBehavior = new Drown();
        // DecoyDuck does not fly
        flyBehavior = new NotFly();
    }

    // Display method to show the type of duck
    @Override
    void display() 
    {
        System.out.println("I am a Decoy Duck...");
    }
}
