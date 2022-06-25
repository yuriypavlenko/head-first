import PizzaStore.ChicagoPizzaStore;
import PizzaStore.NYPizzaStore;
import PizzaStore.PizzaStore;
import PizzaStore.Pizza;

/**
 * Пример реализации паттерна "Фабричный метод"
 *
 * Есть абстрактрный объект "Пицерия", у него есть фабричный абстрактным метод "createPizza()".
 * Фабричный метод принимает "вид пиццы" и возвращает объект типа "Пицца",
 * но он не создает конкретную Пиццу, он абстрактный!
 *
 * Есть разные пицерии, они обязаны реализовать Фабричный метод, где принимают тип пиццы и уже здесь создают и
 * возвращают конкретную пиццу, которая реализует тип Пицца.
 *
 * Этим достигается то, что разные конкретные пиццерии могут создавать свои разновидности объектов пиццы того же типа.
 *
 * Программа создает конкретную Пицерию (покупатель зашел в конкретную пиццерию), у этой пиццерии вызывается
 * метод базового класса "заказ пиццы" которому передается определенный тип пиццы
 * (покупатель выбрал пиццу, например, "с сыром").
 * Внутри метода "заказ пиццы" вызывается фабричный метод "создать пиццу", при этом вызывается метод конкретной пицерии,
 * где и создается конкретный объект пиццы "с сыром" этой конкретной пицеррии.
 * Дальше пиццерия готовит этот вид пиццы.
 *
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStyle = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStyle.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}