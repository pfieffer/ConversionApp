package com.example.ravi.conversionapp.ConversionLogic;

/**
 * Created by ravi on 7/20/17.
 */

public class TemperatureConversionLogic {
    //convert fahrenheit to celsius
    public static Double convertFahrenheitToCelsius(Double fahrenheit){
        return ((fahrenheit - 32)*5 / 9);
    }
    //convert fah to kelvin
    public static Double convertFahrenheitToKelvin(Double fahrenheit){
        return (((fahrenheit - 32) * 5/9) + 273.15 );
    }
    //convert fah to rankine
    public static Double convertFahrenheitToRankine(Double fahrenheit){
        return(fahrenheit + 459.67);
    }


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
    //kelvin to rankine
    public static  Double convertKelvinTORankine (Double kelvin){
        return(kelvin * (9/5));
    }


    //convert Rankine to all others
    public static  Double convertRankineToKelvin (Double rankine){
        return (rankine * 5/9);
    }
    public static  Double convertRankineToCelsius (Double rankine){
        return ((rankine- 491.67) * 5/9);
    }
    public static  Double convertRankineToFahrenheit (Double rankine){
        return (rankine - 459.67);
    }

}
