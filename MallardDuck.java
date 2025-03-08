public class MallardDuck extends Duck 
{
    // Constructor for MallardDuck
    public MallardDuck() 
    {
        // Setting the quack behavior to Quack
        quackBehavior = new Quack();
        // Setting the swim behavior to Swim
        swimBehavior = new Swim();
        // Setting the fly behavior to Fly
        flyBehavior = new Fly();
    }

    // Overriding the display method to show specific message for MallardDuck
    @Override
    void display() 
    {
        System.out.println("I am a Mallard Duck...");
    }
}