package mooc.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class WeatherForecaster {
    private Random random;

    public WeatherForecaster() {
        this.random = new Random();
    }

    public String forecastWeather() {
        double probability = this.random.nextDouble();

        if (probability <= 0.1) {
            return "Sleet";
        } else if (probability <= 0.4) { // 0.1 + 0.3
            return "Snow";
        } else { // the rest, 1.0 - 0.4 = 0.6
            return "Sunny";
        }
    }

    public int forecastTemperature() {
        return (int) ( 4 * this.random.nextGaussian() - 3 );
    }
}

class Runner{

    public static void main(String[] args) {

        WeatherForecaster myWeatherForecaster = new WeatherForecaster();
        ArrayList<String> days = new ArrayList<>();
        Collections.addAll(days,"Mon","Tue", "Wed", "Thu", "Fri", "Sat", "Sun");

        System.out.println("Weather forecast for the next week:");

        for(String day : days) {
            String weatherForecast = myWeatherForecaster.forecastWeather();
            int temperatureForecast = myWeatherForecaster.forecastTemperature();

            System.out.println(day + ": " + weatherForecast + " " +
                    temperatureForecast + " degrees.");
        }
    }
}
