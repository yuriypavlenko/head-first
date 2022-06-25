package PizzaStore2;

public abstract class PizzaStore {

    /**
     * Приготовление пиццы
     * @param type Type of pizza
     * @return Pizza
     */
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * Создание пиццы определенного типа
     * @param type Type of pizza
     * @return Pizza
     */
    abstract Pizza createPizza(String type);
}
