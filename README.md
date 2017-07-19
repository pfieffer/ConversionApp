# Temperature App

**Currently the app can:**
* Convert temperature from celsius to any other unit
* Convert temperature from fahrenheit to any other except Rankine
* Convert temperature from Kelvin to any other except Rankine

**Future Enhancements**
* ~~~Kelvin Scale Conversion~~~
* Rankine Scale Conversion

**Installation**
1. Clone the repo / Download zip to your local machine
2. Open Project on your Android Studio
3. Build the project
4. Run on your android smartphone.

**Requirements**
1. Android Studio
2. Android smartphone or Emulator runnign on API level 15 to 25

**The screenshots of the app are:**

[![Screenshot_20170719-151506.png](https://s4.postimg.org/hwx91b56l/Screenshot_20170719-151506.png)](https://postimg.org/image/wsvs8wgl5/)

[![Screenshot_20170719-151512.png](https://s4.postimg.org/4ha8buwot/Screenshot_20170719-151512.png)]

**The core logic is at `ConvertLogic.java`**
```JAVA
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
```



The initial idea to this app came from this tutorial at Vogella: http://www.vogella.com/tutorials/Android/article.html#tutorialtemperature with some minor deviations

