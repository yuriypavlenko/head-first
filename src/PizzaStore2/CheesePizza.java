package PizzaStore2;

import PizzaStore2.ingredients.factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        System.out.println("We taking " + dough.getName());
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
