package package1.notification;

import package1.forecast.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio : new weather forecast: temperature: " + weatherForecast.getTemperature() + " degree Celsius, " +
                "pressure " + weatherForecast.getPressure() + " hPa");
    }
}
