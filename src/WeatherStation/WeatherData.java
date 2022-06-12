package WeatherStation;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private final ArrayList<Observer> observers;
    private float temperature;
    private float humididty;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humididty, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humididty, float pressure) {
        this.temperature = temperature;
        this.humididty = humididty;
        this.pressure = pressure;
        measurementsChanged();
    }

    //Другие методы WeatherData
}
