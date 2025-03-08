public class Quack implements QuackBehavior 
{
    // overrides quack method for ducks that quack
    @Override
    public void quack() 
    {
        System.out.println("Quack Quack!!");
    }
}
