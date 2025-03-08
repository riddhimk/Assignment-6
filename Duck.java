abstract public class Duck 
{
    // Behavior interfaces for flying, quacking, and swimming
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    // Setter for fly behavior
    public void setFlyBehavior(FlyBehavior flyBehavior) 
    {
        this.flyBehavior = flyBehavior;
    }

