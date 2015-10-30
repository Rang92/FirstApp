package com.example.rang.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pressSend(View v) {
        EditText name = (EditText)findViewById(R.id.nameID);
        EditText age = (EditText)findViewById(R.id.ageID);
        Toast yourToast = Toast.makeText(getApplicationContext(), name.getText() + " is " + age.getText() + " years old!", LENGTH_LONG);
        yourToast.show();
    }

    public void pressWWT(View v) {
        EditText name = (EditText)findViewById(R.id.nameID);
        EditText ageText = (EditText)findViewById(R.id.ageID);
        int age = Integer.parseInt(ageText.getText().toString());

        if (age >= 50) {
            Toast yourToast = Toast.makeText(getApplicationContext(), "Damn " + name.getText() + " you are old!", LENGTH_LONG);
            yourToast.show();
        } else {
            Toast yourToast = Toast.makeText(getApplicationContext(), "Damn " + name.getText() + " you are young!", LENGTH_LONG);
            yourToast.show();
        }
    }
}
