package package1;

import package1.notification.TvNews;
import package1.notification.InternetNews;
import package1.notification.RadioNews;
import package1.forecast.WeatherForecast;

public class Main {

    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(25, 1012);

        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();
        InternetNews internetNews = new InternetNews();

        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.registerObserver(internetNews);

        weatherForecast.notifyObservers();
        System.out.println("");

        weatherForecast.unregisterObserver(tvNews);
        System.out.println("");

        weatherForecast.notifyObservers();
        System.out.println("");

        weatherForecast.updateForecast(20,12);




    }
}
