package com.google.training.helloworld;

/**
 * Created by yaroslav on 2/3/16.
 */
public class Weather {

    private String weather = "Weather for selected city";


    public Weather(String city) {

       this.weather = "Must see weather for city " + city;

    }


    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }


}
