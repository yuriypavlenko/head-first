package WeatherStation.Displays;

import WeatherStation.DisplayElement;
import WeatherStation.Observer;
import WeatherStation.Subject;
import WeatherStation.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float heatIndex;
    private final Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        WeatherData weatherData = (WeatherData) this.weatherData;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumididty();
        this.heatIndex = weatherData.getHeatIndex();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
        System.out.println("Heat index is " + heatIndex);
    }
}
