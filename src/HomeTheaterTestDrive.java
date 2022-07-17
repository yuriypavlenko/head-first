import HomeTheater.HomeTheaterFacade;
import HomeTheater.Light;
import HomeTheater.Projector;
import HomeTheater.Screen;

/**
 * Пример реализация паттерна "Фасад"
 *
 * Главная задача: скрыть детали использования сложной системы за простыми и понятными методами (более общие команды),
 * а также отделить клиента от подробностей сложной системы
 *
 * Тем не менее фасад не запрещает вызовы методов системы напрямую, если в этом есть необходимость
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Light light = new Light();
        Projector projector = new Projector();
        Screen screen = new Screen();

        // Фасад, скрывает подробности
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(light,
                projector,
                screen);

        // Используем методы фасада
        System.out.println("Lets see movie...\n---");

        homeTheater.watchMovie();
        System.out.println("---\nCool movie. Lets finish...");
        homeTheater.endMovie();
    }
}
