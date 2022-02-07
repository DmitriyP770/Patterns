package Observer;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(30, 28, 5,728);
        CurrentDisplay currentDisplay = new CurrentDisplay();
        weatherData.registerObserver(currentDisplay);
        weatherData.setMeasurmentChanged(28,15,3,730);
        currentDisplay.display();
        weatherData.setMeasurmentChanged(25,5,7,740);
        currentDisplay.display();
    }
}
