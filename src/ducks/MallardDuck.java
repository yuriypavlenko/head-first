package ducks;

import ducks.behaviors.fly.FlyWithWings;
import ducks.behaviors.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
