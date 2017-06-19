package com.example.ravi.temperatureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

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
