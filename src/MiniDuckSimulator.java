import MiniDuckSimulator.ducks.Duck;
import MiniDuckSimulator.ducks.behaviors.fly.FlyRocketPowered;
import MiniDuckSimulator.ducks.MallardDuck;
import MiniDuckSimulator.ducks.ModelDuck;

/**
 * Пример реализации паттерна "Стратегия"
 *
 * Суть в том, что изменяющееся поведение утки вынесено отдельно от утки.
 * Поведение у утки появляется не путем наследования, а с помощью компоновки.
 * У созданной утки есть поведение по умолчанию, но при таком подхоже есть возможность изменить его "на лету"
 * из набора взаимозаменяемых поведений.
 * Можно менять поведение уток не зависимо от уток.
 * Можно добавлять варианты поведения уток походу, добавлять их только к новым уткам, не трогая ранее созданные
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}