package com.example.arithmeticoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
EditText num1 , num2 , result;
RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1edit);
        num2 = findViewById(R.id.num2edit);
        result = findViewById(R.id.resultedit);
        rg = findViewById(R.id.groupr);

        rg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup rg, int id) {

        double first = 0, second = 0;
        if(num1.getText().toString().equals(""))
            Toast.makeText(this, "Enter first value", Toast.LENGTH_SHORT).show();
        else
            first = Double.parseDouble(num1.getText().toString());

        if(num2.getText().toString().equals(""))
            Toast.makeText(this, "Enter the second number", Toast.LENGTH_SHORT).show();
        else
            second = Double.parseDouble(num2.getText().toString());

        double res = 0;
        switch(id)
        {
            case R.id.radioButton2:
            res = first + second;
            break;

            case R.id.radioButton3:
                res = first - second;
                break;

            case R.id.radioButton4:
                res = first * second;
                break;

            case R.id.radioButton5:
                res = first / second;
                break;

        }
        Double res1 = new Double(res);
        result.setText(res1.toString());
    }
}
