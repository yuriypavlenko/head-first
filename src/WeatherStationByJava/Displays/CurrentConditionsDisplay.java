package WeatherStationByJava.Displays;

import WeatherStationByJava.DisplayElement;
import WeatherStationByJava.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float heatIndex;
    private final Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumididty();
            this.heatIndex = weatherData.getHeatIndex();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
        System.out.println("Heat index is " + heatIndex);
    }
}
