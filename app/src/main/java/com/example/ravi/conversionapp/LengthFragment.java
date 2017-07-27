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

import com.example.ravi.conversionapp.ConversionLogic.LengthConversionLogic;
import com.example.ravi.conversionapp.ConversionLogic.TemperatureConversionLogic;


public class LengthFragment extends Fragment {
    private EditText editText1;
    private TextView tv1;
    private Button button;
    private Spinner spinner1, spinner2;


    public LengthFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_length, container, false);

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
                    Float inputValue = Float.parseFloat(editText1.getText().toString());

                    //switch cases would be better maybe?
                    if (spinner1.getSelectedItem().toString().equals("Meter")) {
                        switch (spinner2.getSelectedItem().toString()) {
                            case "Meter":
                                tv1.setText(inputValue.toString());
                                break;
                            case "Kilometer":
                                tv1.setText(String.valueOf(LengthConversionLogic.convertMeterToKilometer(inputValue)));
                                break;
                            case "Centimeter":
                                tv1.setText(String.valueOf(LengthConversionLogic.convertMeterToCentimeter(inputValue)));
                                break;
                            case "Millimeter":
                                tv1.setText(String.valueOf(LengthConversionLogic.convertMeterToMillimeter(inputValue)));
                                break;
                            case "Feet":
                                tv1.setText(String.valueOf(LengthConversionLogic.convertMeterToFeet(inputValue)));
                                break;
                            case "Inches":
                                tv1.setText(String.valueOf(LengthConversionLogic.convertMeterToInch(inputValue)));
                                break;
                        }
                    } else if (spinner1.getSelectedItem().toString().equals("Kilometer")) {
                        switch (spinner2.getSelectedItem().toString()) {
                            case "Meter":
                                tv1.setText(inputValue.toString());
                                break;
                            case "Kilometer":
                                tv1.setText(String.valueOf(LengthConversionLogic.convertMeterToKilometer(inputValue)));
                                break;
                            case "Centimeter":
                                tv1.setText(String.valueOf(LengthConversionLogic.convertMeterToCentimeter(inputValue)));
                                break;
                            case "Millimeter":
                                tv1.setText(String.valueOf(LengthConversionLogic.convertMeterToMillimeter(inputValue)));
                                break;
                            case "Feet":
                                tv1.setText(String.valueOf(LengthConversionLogic.convertKiloMeterToFeet(inputValue)));
                                break;
                            case "Inches":
                                tv1.setText(String.valueOf(LengthConversionLogic.convertKilometerToInch(inputValue)));
                                break;
                        }
                    }
//                    else if(spinner1.getSelectedItem().toString().equals("Kelvin")){
//                        if (spinner2.getSelectedItem().toString().equals("Celsius")){
//                            tv1.setText(String.valueOf(TemperatureConversionLogic.convertKelvinToCelsius(inputValue)));
//                        }
//                        else if(spinner2.getSelectedItem().toString().equals("Fahrenheit")){
//                            tv1.setText(String.valueOf(TemperatureConversionLogic.convertKelvinToFahrenheit(inputValue)));
//                        }
//                        else if(spinner2.getSelectedItem().toString().equals("Rankine")){
//
//                        }
//                        else {
//                            tv1.setText(inputValue.toString());
//                        }
//                    }
//                    else if(spinner1.getSelectedItem().toString().equals("Rankine")){
//                        if (spinner2.getSelectedItem().toString().equals("Celsius")){
////                            editText2.setText(String.valueOf(ConversionLogic.convertRankineToCelsius(inputValue)));
//                        }
//                        else if(spinner2.getSelectedItem().toString().equals("Kelvin")){
//
//                        }
//                        else if(spinner2.getSelectedItem().toString().equals("Fahrenheit")){
//
//                        }
//                        else {
//                            tv1.setText(inputValue.toString());
//                        }
//                    }
                }
            }
        });

        return view;
    }


}
