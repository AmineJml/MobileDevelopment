package com.cdev.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login(View v)
    {
        EditText username = (EditText) findViewById(R.id.input_txt_username);
        EditText password = (EditText) findViewById(R.id.input_txt_password);

        String username_val = username.getText().toString();
        String password_val = password.getText().toString();

        if(username_val.equals("") && password_val.equals(""))
        {
            Toast.makeText(this, "Hello" + username_val, Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, LandingPage.class);

            startActivity(i);
        }
        else
        {
            Toast.makeText(this, "Invalid username", Toast.LENGTH_LONG).show();

        }


    }
}