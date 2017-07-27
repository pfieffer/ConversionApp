package com.example.ravi.conversionapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ravi.conversionapp.ConversionLogic.TemperatureConversionLogic;


public class TemperatureFragment extends Fragment {
    private EditText editText1;
    private TextView tv1;
    private Button button;
    private Spinner spinner1, spinner2;

    public TemperatureFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_temperature, container, false);

        editText1 = (EditText) view.findViewById(R.id.input_value);
        tv1 = (TextView) view.findViewById(R.id.output_value);
        button = (Button) view.findViewById(R.id.button_calc);
        spinner1 = (Spinner) view.findViewById(R.id.spinner1);
        spinner2 = (Spinner) view.findViewById(R.id.spinner2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().length() == 0) {
                    Toast.makeText(getActivity(), "Please enter a valid number", Toast.LENGTH_LONG).show();
                } else {
                    Double inputValue = Double.parseDouble(editText1.getText().toString());

                    if (spinner1.getSelectedItem().toString().equals("Fahrenheit")) {
                        switch (spinner2.getSelectedItem().toString()) {
                            case "Celsius":
                                tv1.setText(String.valueOf(TemperatureConversionLogic.convertFahrenheitToCelsius(inputValue)));
                                break;
                            case "Kelvin":
                                tv1.setText(String.valueOf(TemperatureConversionLogic.convertFahrenheitToKelvin(inputValue)));
                                break;
                            case "Rankine":
                                tv1.setText(String.valueOf(TemperatureConversionLogic.convertFahrenheitToRankine(inputValue)));
                                break;
                            default:
                                tv1.setText(inputValue.toString());
                                break;
                        }
                    } else if (spinner1.getSelectedItem().toString().equals("Celsius")) {
                        switch (spinner2.getSelectedItem().toString()) {
                            case "Fahrenheit":
                                tv1.setText(String.valueOf(TemperatureConversionLogic.convertCelsiusToFahrenheit(inputValue)));
                                break;
                            case "Kelvin":
                                tv1.setText(String.valueOf(TemperatureConversionLogic.convertCelsiusToKelvin(inputValue)));
                                break;
                            case "Rankine":
                                tv1.setText(String.valueOf(TemperatureConversionLogic.convertCelsiusToRankine(inputValue)));
                                break;
                            default:
                                tv1.setText(inputValue.toString());
                                break;
                        }
                    } else if (spinner1.getSelectedItem().toString().equals("Kelvin")) {
                        switch (spinner2.getSelectedItem().toString()) {
                            case "Fahrenheit":
                                tv1.setText(String.valueOf(TemperatureConversionLogic.convertKelvinToFahrenheit(inputValue)));
                                break;
                            case "Celsius":
                                tv1.setText(String.valueOf(TemperatureConversionLogic.convertKelvinToCelsius(inputValue)));
                                break;
                            case "Rankine":
                                tv1.setText(String.valueOf(TemperatureConversionLogic.convertKelvinTORankine(inputValue)));
                                break;
                            default:
                                tv1.setText(inputValue.toString());
                                break;
                        }
                    } else if (spinner1.getSelectedItem().toString().equals("Rankine")) {
                        switch (spinner2.getSelectedItem().toString()) {
                            case "Fahrenheit":
                                tv1.setText(String.valueOf(TemperatureConversionLogic.convertRankineToFahrenheit(inputValue)));
                                break;
                            case "Celsius":
                                tv1.setText(String.valueOf(TemperatureConversionLogic.convertRankineToCelsius(inputValue)));
                                break;
                            case "Kelvin":
                                tv1.setText(String.valueOf(TemperatureConversionLogic.convertRankineToKelvin(inputValue)));
                                break;
                            default:
                                tv1.setText(inputValue.toString());
                                break;
                        }
                    }
                }
            }
        });

        return view;
    }


}


