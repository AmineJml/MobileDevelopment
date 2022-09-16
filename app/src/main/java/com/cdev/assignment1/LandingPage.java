package com.cdev.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LandingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
    }

    public void LLToD(View v)
    {


        EditText valueLL = (EditText) findViewById(R.id.input_txt_value);
        TextView finalValue = (TextView) findViewById(R.id.txt_finalValue);
        String str_value = valueLL.getText().toString();

        if(str_value.equals(""))
            {
                Toast.makeText(this, "POOP", Toast.LENGTH_LONG).show();
            }
        else{
            Double value_double = Double.parseDouble(str_value)/40000;

            String value_str = String.valueOf(value_double);
            finalValue. setText(value_str + "  $");
        }


    }
    public void DToLL(View v)
    {
        EditText valueLL = (EditText) findViewById(R.id.input_txt_value);
        TextView finalValue = (TextView) findViewById(R.id.txt_finalValue);
        String str_value = valueLL.getText().toString();

        if(str_value.equals(""))
        {
            Toast.makeText(this, "POOP", Toast.LENGTH_LONG).show();
        }
        else{

            int value_int = Integer.parseInt(str_value)*40000;

            String value_str = String.valueOf(value_int);
            finalValue. setText(value_str + "  LL");
        }

    }


}