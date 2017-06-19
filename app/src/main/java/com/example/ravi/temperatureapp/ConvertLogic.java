package com.example.ravi.temperatureapp;

/**
 * Created by ravi on 6/19/17.
 */

public class ConvertLogic {
    //convert to celsius
    public static float convertFahrenheitToCelsius(float fahrenheit){
        return ((fahrenheit - 32)*5 / 9);
    }

    //converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius){
        return ((celsius*9) / 5) +32;
    }
}
