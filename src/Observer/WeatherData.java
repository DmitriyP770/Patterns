package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    float temp;
    float humidity;
    float speed_of_wind;
    float pressure;
    ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
    observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers){
            observer.update(temp,humidity,speed_of_wind,pressure);
        }
    }



    public WeatherData(float temp, float humidity, float speed_of_wind, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.speed_of_wind = speed_of_wind;
        this.pressure =pressure;
    }


    public void setMeasurmentChanged(float temp, float humidity, float speed_of_wind, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.speed_of_wind = speed_of_wind;
        this.pressure =pressure;
        notifyObserver();
    };

    float getTemp(){
        return temp;
    };
    float getHumidity(){
        return humidity;
    };
    float getPressure(){
        return pressure;
    };
}
