import PizzaStore2.ChicagoPizzaStore;
import PizzaStore2.NYPizzaStore;
import PizzaStore2.Pizza;
import PizzaStore2.PizzaStore;

/**
 * Пример реализации патерна "Абстрактная фабрика"
 *
 * Есть абстрактная Пицерия. Она принимает заказ в виде "типа пиццы",
 * создает пиццу (вызывает абстрактный метод, который должен быть реализован конкретной пиццерией),
 * и готовит ее.
 *
 * Конкретная пицерия реализует у себя метод создания пиццы.
 * Создается конкретный вид пиццы. Но пицце нужны объекты-ингредиенты, которые используются потом в ее методе "приготовления".
 * Но получает пицца объекты-ингредиенты не на прямую а посредством "абстрактной фабрики".
 *
 * Сделано так, что конкретная пицеррия при создании конкретной пиццы передает ей конкретную реализацию
 * "абстрактной фабрики ингредиентов".
 * Пицца у себя умеет работать с "абстрактной фабрикой" (PizzaIngredientFactory)
 * и получить от нее конкретные объекты-ингредиенты (ingredientFactory.createDough()).
 */

public class PizzaTestDrive2 {
    public static void main(String[] args) {
        PizzaStore nyStyle = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStyle.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
