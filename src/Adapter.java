import Adapter.EnumarationIterator;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Пример реализация паттерна "Адаптер"
 *
 * Главная задача: преобразование одного интерфейса в другой
 *
 * Адаптер реализует целевой интерфейс, а внутри хранит объект старого интерфейса
 * Клиент обращается к адаптеру в соответствии с новым интерфейсом, а тот в свою очередь обращается к объекту через
 * старый интерфейс.
 *
 */
public class Adapter {
    public static void main(String[] args) {

        // Создаем коллекцию старого интерфейса Enumeration
        Enumeration days;
        Vector dayNames = new Vector();

        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");

        // Коллекция старого интерфейса Enumeration
        days = dayNames.elements();

        // Создаем адаптер нового интерфейса Iterator
        EnumarationIterator adapter = new EnumarationIterator(days);

        // Клиентский код вызывает методы нового интерфейса у адаптера, а он транслирует запрос к объекту старого интерфейса
        while (adapter.hasNext()) {
            System.out.println(adapter.next());
        }
    }
}
