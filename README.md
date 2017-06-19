# Temperature App

**Currently the app can:**
* Convert temperature from celsius to fahrenheit
* Convert temperature from fahrenheit to celsius

**Future Enhancements**
* Kelvin Scale Conversion
* Rankine Scale Conversion

**Installation**
1. Clone the repo / Download zip to your local machine
2. Open Project on your Android Studio
3. Build the project
4. Run on your android smartphone.

**Requirements**
1. Android Studio
2. Android smartphone or Emulator runnign on API level 15 to 25

**The screenshot of the app is:**

![Main Activity XML](https://s21.postimg.org/3k6wdtzon/Screenshot_from_2017-06-19_23-19-17.png)

**The component tree view of the main xml is:**

![Component tree](https://s21.postimg.org/4azmjm21z/Screenshot_from_2017-06-19_23-20-13.png)


**The core logic is at `ConvertLogic.java`**
```JAVA
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
```

**And the ``MainActivity.java`` is fairly simple.**
So simple that I decide to put it up on the README file:
```JAVA
public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.input_value);
        button = (Button) findViewById(R.id.button_calc);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().length()==0){
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_LONG).show();
                }
                else {
                    RadioButton toCel,toFah;
                    toCel = (RadioButton) findViewById(R.id.radio_opt1);
                    toFah = (RadioButton) findViewById(R.id.radio_opt2);
                    if(toCel.isChecked()==true){
                        float inputCel = Float.parseFloat(editText.getText().toString());
                        editText.setText(String.valueOf(ConvertLogic.convertFahrenheitToCelsius(inputCel)));
                        toCel.setChecked(false);
                        toFah.setChecked(true);
                    }
                    else if(toFah.isChecked()==true){
                        float inputFah = Float.parseFloat(editText.getText().toString());
                        editText.setText(String.valueOf(ConvertLogic.convertCelsiusToFahrenheit(inputFah)));
                        toFah.setChecked(false);
                        toCel.setChecked(true);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "No Conversion Selected", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
```

The app is a follow along of the tutorial at Vogella: http://www.vogella.com/tutorials/Android/article.html#tutorialtemperature with some minor deviations

