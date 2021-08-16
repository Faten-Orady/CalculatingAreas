package com.example.calculatingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculate extends AppCompatActivity {
    EditText et_first;
    EditText et_second;
    TextView tv;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

         et_first    =findViewById(R.id.calculate_et_firstNumber);
         et_second =findViewById(R.id.calculate_et_secondNumber);
         tv=findViewById(R.id.calculate_tv_result);
         bt= findViewById(R.id.calculate_bt_sum);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String number_1= et_first.getText().toString();
              String number_2=et_second.getText().toString();
              int num1 = Integer.parseInt(number_1);
              int num2=Integer.parseInt(number_2);
              int result= num1+num2;
              tv.setText("Result: "+result);
            }
        });
    }
}