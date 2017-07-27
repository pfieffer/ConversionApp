package com.example.ravi.conversionapp.ConversionLogic;

/**
 * Created by ravi on 7/27/17.
 */

public class FrequencyConversionLogic {
    //convert hertz to others
    public static Double convertHertzToExaHertz(Float hertz){
        return (hertz * 0.000000000000000001);
    }
    public static Double convertHertzToGigaHertz(Float hertz){
        return (hertz * 0.000000001);
    }
    public static Double convertHertzToKiloHertz(Float hertz){
        return (hertz * 0.001);
    }
    public static Double convertHertzToMegaHertz(Float hertz){
        return (hertz * 0.000001);
    }
    public static float convertHertzToMicroHertz(Float hertz){
        return (hertz * 1000000);
    }
    public static Double convertHertzToMilliHertz(Float hertz){
        return (hertz * 0.1000);
    }
    public static Double convertHertzToPetaHertz(Float hertz){
        return (hertz * 0.000000000000001);
    }
    public static Double convertHertzToTeraHertz(Float hertz){
        return (hertz * 0.000000000001);
    }


}
