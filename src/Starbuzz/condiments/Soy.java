package Starbuzz.condiments;

import Starbuzz.beverages.Beverage;

public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += .10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .40;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .60;
        }
        return cost;
    }
}
