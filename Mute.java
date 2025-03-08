public class Mute implements QuackBehavior 
{
    // overrides quack method for mute ducks
    @Override
    public void quack() 
    {
        System.out.println("Can't speak!");
    }
}
