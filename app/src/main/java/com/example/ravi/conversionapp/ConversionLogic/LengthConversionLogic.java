package com.example.ravi.conversionapp.ConversionLogic;

/**
 * Created by ravi on 7/20/17.
 */

public class LengthConversionLogic {
    //convert meter to others
    public static float convertMeterToCentimeter(Float meter){
        return (meter * 100);
    }
    public static float convertMeterToKilometer(float meter){
        return (meter / 1000);
    }
    public static float convertMeterToMillimeter(float meter){return (meter * 1000);}
    public static Double convertMeterToFeet(float meter){return  (meter * 3.28084);}
    public static Double convertMeterToInch(float meter){return (meter * 39.37008);}


    //convert Kilometer to others
    public static float convertKiloMeterToCentimeter(float kiloMeter){return (kiloMeter * 100000);}
    public static float convertKiloMeterToMillimeter(float kiloMeter){return (kiloMeter * 1000000);}
    public static Double convertKiloMeterToFeet(float kiloMeter){return (kiloMeter * 3280.84);}
    public static Double convertKilometerToInch(float kiloMeter){return (kiloMeter * 39370.08);}


}
