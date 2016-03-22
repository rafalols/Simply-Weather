package eu.rafalolszewski.simplyweather.views.fragments;

import eu.rafalolszewski.simplyweather.model.openweather.WeatherCurrentData;
import eu.rafalolszewski.simplyweather.model.openweather.WeatherFiveDaysData;

/**
 * Created by Rafał Olszewski on 17.03.16.
 */
public interface WeatherViewInterface {

    public void setCurrentWeatherProgressIndicator(boolean active);

    public void setListProgressIndicator(boolean active);

    public void cantConnectWeatherApi();

    public void refreshCurrentWeather(WeatherCurrentData weatherCurrentData);

    public void refreshFiveDaysWeather(WeatherFiveDaysData weatherFiveDaysData);

}