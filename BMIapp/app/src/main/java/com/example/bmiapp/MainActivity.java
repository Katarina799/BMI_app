package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText height=(EditText)findViewById(R.id.getheight);
        final EditText weight=(EditText)findViewById(R.id.getweight);
        final TextView txBMI=(TextView) findViewById(R.id.result);
        Button btnCalc=(Button)findViewById(R.id.button);
        btnCalc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Double myHeight=0.0;
                Double myWeight=0.0;
                Double myBMI=0.0;
                myHeight=Double.parseDouble(height.getText().toString());
                myWeight=Double.parseDouble(weight.getText().toString());
                myHeight=myHeight/100;
                myBMI=myWeight/(myHeight*myHeight);
                String result = String.format("%.1f", myBMI);
                txBMI.setText(result);
            }
        });
    }
}