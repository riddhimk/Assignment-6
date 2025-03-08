public class RedHeadDuck extends Duck 
{
    // Constructor for RedHeadDuck
    public RedHeadDuck() 
    {
        // Setting the quack behavior to Quack
        quackBehavior = new Quack();
        // Setting the swim behavior to Swim
        swimBehavior = new Swim();
        // Setting the fly behavior to Fly
        flyBehavior = new Fly();
    }

    // Override the display method to show specific message for RedHeadDuck
    @Override
    void display() 
    {
        System.out.println("I am a Red Head Duck...");
    }
}
