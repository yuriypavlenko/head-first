package PizzaStore2;

import PizzaStore2.ingredients.factories.NYPizzaIngredientFactory;
import PizzaStore2.ingredients.factories.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
            pizza.setCutBy("diagonal");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
            pizza.setCutBy("diagonal");
        }

        return pizza;
    }
}
