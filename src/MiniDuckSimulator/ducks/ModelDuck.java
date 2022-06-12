package MiniDuckSimulator.ducks;

import MiniDuckSimulator.ducks.behaviors.fly.FlyNoWay;
import MiniDuckSimulator.ducks.behaviors.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
