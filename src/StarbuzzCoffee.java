import Starbuzz.beverages.Beverage;
import Starbuzz.beverages.DarkRoast;
import Starbuzz.beverages.Espresso;
import Starbuzz.beverages.HouseBlend;
import Starbuzz.condiments.Mocha;
import Starbuzz.condiments.Soy;
import Starbuzz.condiments.Whip;

/**
 * Пример реализации патерна "Декоратор"
 *
 * Есть компоненты (Вид кофе-напитка), субклассы от абстрактного класса (или интерфейса) Напиток
 *
 * Есть декораторы (Добавки), субклассы от абстрактного класса Добавка,
 * который(важно!) тоже является наследником класса (или интерфейса) Напиток
 *
 * Следовательно у всех есть свойства и реализация методов Напитка
 * Теперь можно создать компонент (Вид Кофе), а потом его вложить в декоратор, а его в другой декоратор
 * и так сколько угодно декораторов - получится цепочка вложенных объектов
 *
 * Теперь вызвав метод у самого верхнего декоратора, тот может обратится к вложенному декоратору,
 * тот к своему вложенному декоратору и в самом конце обращение будет к конечному компоненту.
 * В ответ компонент(Кофе) вернет свое значение (стоимость Кофе) в декоратор (Первую добавку), в котором он находится,
 * тот добавит свою стоимость к стоимости Кофе и сумму вернет декоратору, в котором он находится, и так далее,
 * пока не вернемся к самому верхнему декоратору, и тот в свою очередь вернет от себя стоимость.
 *
 * Таким образом: к Кофе можно добавить любое количество любых добавок.
 * И можно легко посчитать стоимость кофе и всех добавок вызвав метод cost() у самого верхнего декоторатора.
 *
 * Точно так же формируется строка Description составленная из названий каждого декоратора и компонента: кофе и добавок
 *
 * По сути патерн Декоратор явно реализует принцип "закрытости/открытости" - т.е.
 * класс должен быть закрыт для изменения, но открыт для расширения
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.GRANDE);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
