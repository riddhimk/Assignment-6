public class Float implements SwimBehavior 
{
    // overrides swim method for ducks that can float
    @Override
    public void swim() 
    {
        System.out.println("I am floating on water...");
    }
}
