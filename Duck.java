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

    // Setter for quack behavior
    public void setQuackBehavior(QuackBehavior quackBehavior) 
    {
        this.quackBehavior = quackBehavior;
    }

    // Setter for swim behavior
    public void setSwimBehavior(SwimBehavior swimBehavior) 
    {
        this.swimBehavior = swimBehavior;
    }

    // Abstract method to display the duck
    abstract void display();

