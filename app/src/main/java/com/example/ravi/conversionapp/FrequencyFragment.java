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

import com.example.ravi.conversionapp.ConversionLogic.FrequencyConversionLogic;


public class FrequencyFragment extends Fragment {
    private EditText editText1;
    private TextView tv1;
    private Button button;
    private Spinner spinner1, spinner2;


    public FrequencyFragment() {
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
        View view = inflater.inflate(R.layout.fragment_frequency, container, false);

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
                    if (spinner1.getSelectedItem().toString().equals("Hertz")) {
                        switch (spinner2.getSelectedItem().toString()) {
                            case "Hertz":
                                tv1.setText(inputValue.toString());
                                break;
                            case "Exahertz":
                                tv1.setText(String.valueOf(FrequencyConversionLogic.convertHertzToExaHertz(inputValue)));
                                break;
                            case "Gigahertz":
                                tv1.setText(String.valueOf(FrequencyConversionLogic.convertHertzToGigaHertz(inputValue)));
                                break;
                            case "Kilohertz":
                                tv1.setText(String.valueOf(FrequencyConversionLogic.convertHertzToKiloHertz(inputValue)));
                                break;
                            case "Megahertz":
                                tv1.setText(String.valueOf(FrequencyConversionLogic.convertHertzToMegaHertz(inputValue)));
                                break;
                            case "Microhertz":
                                tv1.setText(String.valueOf(FrequencyConversionLogic.convertHertzToMicroHertz(inputValue)));
                                break;
                            case "Millihertz":
                                tv1.setText(String.valueOf(FrequencyConversionLogic.convertHertzToMilliHertz(inputValue)));
                                break;
                            case "Petahertz":
                                tv1.setText(String.valueOf(FrequencyConversionLogic.convertHertzToPetaHertz(inputValue)));
                                break;
                            case "Terahertz":
                                tv1.setText(String.valueOf(FrequencyConversionLogic.convertHertzToTeraHertz(inputValue)));
                                break;
                        }
                    }

                }
            }
        });

        return view;
    }


}
