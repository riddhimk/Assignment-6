public class Swim implements SwimBehavior 
{
    // overrides swim method for ducks that can swim
    @Override
    public void swim() 
    {
        System.out.println("I am swimming in water!");
    }
}