public class NotFly implements FlyBehavior 
{
    // override fly method for ducks that can't fly
    @Override
    public void fly() 
    {
        System.out.println("I can't fly...");
    }
}