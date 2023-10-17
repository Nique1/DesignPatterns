package package1.notification;

import package1.forecast.WeatherForecast;

public class TvNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast){
        System.out.println("TV: new weather forecast: temperature: " + weatherForecast.getTemperature() + " degree Celsius, " +
                "pressure " + weatherForecast.getPressure() + " hPa");
    }
}
