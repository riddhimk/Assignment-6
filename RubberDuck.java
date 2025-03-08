public class RubberDuck extends Duck 
{
    // Constructor for RubberDuck class
    public RubberDuck() 
    {
        // Setting the quack behavior to Squeak
        quackBehavior = new Squeak();
        // Setting the swim behavior to Float
        swimBehavior = new Float();
        // Setting the fly behavior to NotFly
        flyBehavior = new NotFly();
    }

    // Overriding the display method to show Rubber Duck specific message
    @Override
    void display() 
    {
        System.out.println("I am a Rubber Duck...");
    }
}
