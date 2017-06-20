package com.example.ravi.temperatureapp;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1,editText2;
    private Button button;
    Spinner spinner1, spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.input_value);
        editText2 = (EditText) findViewById(R.id.output_value);
        button = (Button) findViewById(R.id.button_calc);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().length()==0){
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_LONG).show();
                }
                else {
                    Double inputValue = Double.parseDouble(editText1.getText().toString());

                    if(spinner1.getSelectedItem().toString().equals("Fahrenheit")){
                        if (spinner2.getSelectedItem().toString().equals("Celsius")){
                            editText2.setText(String.valueOf(ConvertLogic.convertFahrenheitToCelsius(inputValue)));
                        }
                        else if(spinner2.getSelectedItem().toString().equals("Kelvin")){
                            editText2.setText(String.valueOf(ConvertLogic.convertFahrenheitToKelvin(inputValue)));
                        }
                        else if(spinner2.getSelectedItem().toString().equals("Rankine")){

                        }
                        else {
                            editText2.setText(inputValue.toString());
                        }
                    }
                    else if(spinner1.getSelectedItem().toString().equals("Celsius")){
                        if (spinner2.getSelectedItem().toString().equals("Fahrenheit")){
                            editText2.setText(String.valueOf(ConvertLogic.convertCelsiusToFahrenheit(inputValue)));
                        }
                        else if(spinner2.getSelectedItem().toString().equals("Kelvin")){
                            editText2.setText(String.valueOf(ConvertLogic.convertCelsiusToKelvin(inputValue)));
                        }
                        else if(spinner2.getSelectedItem().toString().equals("Rankine")){
                            editText2.setText(String.valueOf(ConvertLogic.convertCelsiusToRankine(inputValue)));
                        }
                        else {
                            editText2.setText(inputValue.toString());
                        }
                    }
                    else if(spinner1.getSelectedItem().toString().equals("Kelvin")){
                        if (spinner2.getSelectedItem().toString().equals("Celsius")){
                            editText2.setText(String.valueOf(ConvertLogic.convertKelvinToCelsius(inputValue)));
                        }
                        else if(spinner2.getSelectedItem().toString().equals("Fahrenheit")){
                            editText2.setText(String.valueOf(ConvertLogic.convertKelvinToFahrenheit(inputValue)));
                        }
                        else if(spinner2.getSelectedItem().toString().equals("Rankine")){

                        }
                        else {
                            editText2.setText(inputValue.toString());
                        }
                    }
                    else if(spinner1.getSelectedItem().toString().equals("Rankine")){
                        if (spinner2.getSelectedItem().toString().equals("Celsius")){
//                            editText2.setText(String.valueOf(ConvertLogic.convertRankineToCelsius(inputValue)));
                        }
                        else if(spinner2.getSelectedItem().toString().equals("Kelvin")){

                        }
                        else if(spinner2.getSelectedItem().toString().equals("Fahrenheit")){

                        }
                        else {
                            editText2.setText(inputValue.toString());
                        }
                    }
                }
            }
        });
    }
}
