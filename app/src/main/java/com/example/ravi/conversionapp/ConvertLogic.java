package com.example.ravi.conversionapp;

/**
 * Created by ravi on 6/19/17.
 */

public class ConvertLogic {
    //convert fahrenheit to celsius
    public static Double convertFahrenheitToCelsius(Double fahrenheit){
        return ((fahrenheit - 32)*5 / 9);
    }
    //convert fah to kelvin
    public static Double convertFahrenheitToKelvin(Double fahrenheit){
        return (((fahrenheit - 32) * 5/9) + 273.15 );
    }
    //convert fah to


    //convert celsius to fahrenheit
    public static Double convertCelsiusToFahrenheit(Double celsius){
        return ((celsius*9) / 5) +32;
    }
    //convert celsius to rankine
    public static  Double convertCelsiusToRankine(Double celsius){
        return ((celsius*1.8)+491.67);
    }
    //convert celsius to Kelvin
    public static Double convertCelsiusToKelvin(Double celsius){
        return (celsius + 273.15);
    }


    //convert Kelvin to Celsius
    public static  Double convertKelvinToCelsius(Double kelvin){
        return  (kelvin - 273.15);
    }
    //kelvin to fahrenheit
    public static  Double convertKelvinToFahrenheit(Double kelvin){
        return (((kelvin - 273.15) * 9/5) + 32 );
    }

}
