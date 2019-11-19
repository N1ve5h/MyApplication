package com.nivesh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView name;
    private EditText input;
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (TextView) findViewById(R.id.text_name);
        name.setText("Graphical Calculator");
        input = (EditText) findViewById(R.id.InputText);
        input.setText("0");
        plus = (Button) findViewById(R.id.buttonplus);
        plus.setText("+");
        minus = (Button) findViewById(R.id.buttonminus);
        minus.setText("-");
        multiply = (Button) findViewById(R.id.buttonmultiply);
        multiply.setText("x");
        divide = (Button) findViewById(R.id.buttondivide);
        divide.setText("÷");

    }


}

