import WeatherStationByJava.Displays.CurrentConditionsDisplay;
import WeatherStationByJava.WeatherData;

/**
 * Пример реализации паттерна "Слушатель" с использованием встроенных в Java средств
 */
public class WeatherStationByJava {
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
