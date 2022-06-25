package PizzaStore2;


import PizzaStore2.ingredients.factories.PizzaIngredientFactory;
import PizzaStore2.ingredients.ingredients.*;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    protected String cutMethod = "diagonal";

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into " + cutMethod + " slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCutBy(String method) {
        if(method.equals("diagonal")) {
            this.cutMethod = "diagonal";
        } else if (method.equals("square")) {
            this.cutMethod = "square";
        }
    }
}
