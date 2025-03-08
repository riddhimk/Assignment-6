public class Squeak implements QuackBehavior 
{
    // overrides quack method for ducks that squeak
    @Override
    public void quack() 
    {
        System.out.println("Squeeeaaak!!");
    }
}
