package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertToDollar(View view)
    {
        Log.i("info","button clicked");
        EditText rupeesEditText= (EditText) findViewById(R.id.rupeesEditText);
        String str=rupeesEditText.getText().toString();
        double convertedToDouble= Double.parseDouble(str);
        Toast.makeText(this, rupeesEditText.getText().toString()+" ₹  is  "+convertedToDouble*0.014 +" $", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}