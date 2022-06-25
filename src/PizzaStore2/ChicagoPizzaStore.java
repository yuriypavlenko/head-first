package PizzaStore2;

import PizzaStore2.ingredients.factories.ChicagoPizzaIngredientFactory;
import PizzaStore2.ingredients.factories.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }

        return pizza;
    }
}
