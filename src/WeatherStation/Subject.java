package WeatherStation;

import WeatherStation.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

    float getTemperature();
    float getHumididty();
    float getPressure();
    float getHeatIndex();
}