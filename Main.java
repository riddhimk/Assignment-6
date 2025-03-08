public class Main 
{
    public static void main(String[] args) 
    {
        // Mallard Duck
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performSwim();
        mallard.performFly();
        System.out.println("-------------------");

        // Red Head Duck
        Duck redhead = new RedHeadDuck();
        redhead.display();
        redhead.performQuack();
        redhead.performSwim();
        redhead.performFly();
        System.out.println("-------------------");

