public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void desplay() {
        System.out.println("I'm a real Mallard duck!");
    }
}
