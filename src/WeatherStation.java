import WeatherStation.Displays.CurrentConditionsDisplay;
import WeatherStation.WeatherData;

/**
 * Пример реализации паттерна "Слушатель"
 *
 * Аналогия из жизни: издатель газеты и подписчики
 *
 * Есть вещатель, есть слушатели.
 * Вещатель реализует интерфейс вещателя, слушатели - слушателя.
 * Может быть сколько угодно и каких угодно слушателей, главное - они должны реализовывать интерфейс слушателя.
 * Слушатели регистрируются у вещателя, пользуясь методами интерфейса вещателя.
 * Вещатель сообщает об изменении своего состояния каждому из зарегистрарированных у него слушателей,
 * путем вызова у каждого из слушателей метода update() интерфейса слушателя.
 *
 * Таким образом достигается слабая связность объектов Вещателя и Слушателей.
 * Вещателю все равно сколько слушателей, и не важна особенность обработки события у слушателя,
 * он просто вызовет метод оповещения у слушателя.
 * Слушатель может в любой момент зарегистрироваться у вещателя и начать слушать.
 */
public class WeatherStation {
    public static void main(String[] args) {
        // Создаем вещателя
        WeatherData weatherData = new WeatherData();

        // Создаем одного из слушателей и регистрируем его у вещателя (через конструктор)
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        // В случае изменения состояния вещателя,
        // у него внутри будет вызвано оповещение зарегистрированных слушателей
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
