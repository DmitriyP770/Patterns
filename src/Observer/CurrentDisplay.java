package Observer;

public class CurrentDisplay implements Observer, DisplayElement {
    float temp;
    float humidity;
    float speed_of_wind;
    float pressure;

    @Override
    public void display() {
        System.out.println("temp:" + temp + ", pressure: " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float speed_of_wind, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.speed_of_wind = speed_of_wind;
        this.pressure = pressure;
    }
}
