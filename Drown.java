public class Drown implements SwimBehavior 
{
    // overrides swim method for ducks that can't swim
    @Override
    public void swim() 
    {
        System.out.println("Hello! I am under the water!");
    }
}
