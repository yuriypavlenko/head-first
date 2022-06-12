package MiniDuckSimulator.ducks;

import MiniDuckSimulator.ducks.behaviors.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
