package com.example.ravi.conversionapp.ConversionLogic;

/**
 * Created by ravi on 7/20/17.
 */

public class LengthConversionLogic {
    //convert meter to centimeter
    public static float convertMeterToCentimeter(Float meter){
        return (meter * 100);
    }
    //convert meter to kilometer
    public static float convertMeterToKilometer(float meter){
        return (meter / 1000);
    }
    public static float convertMeterToMillimeter(float meter){return (meter * 1000);}
    //convert meter to feet
    //convert meter to inch


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


}
