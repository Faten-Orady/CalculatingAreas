package com.example.calculatingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Areas extends AppCompatActivity {
    Spinner sp;
     EditText et_rectangle_width;
     EditText et_rectangle_height;
     EditText et_circle_radius;
    EditText et_triangle_base;
    EditText et_triangle_height;
    Button bt_areas;
    TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);
        sp = findViewById(R.id.area_sp_shapes);
        et_rectangle_width = findViewById(R.id.areas_et_rectangle_width);
        et_rectangle_height = findViewById(R.id.areas_et_rectangle_height);
        et_circle_radius = findViewById(R.id.areas_et_circle);
        et_triangle_base = findViewById(R.id.areas_et_triange_base);
        et_triangle_height = findViewById(R.id.areas_et_triangle_height);
        bt_areas = findViewById(R.id.areas_bt_calculate);
        tv_result = findViewById(R.id.areas);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(), "Hi, Ften" + i, Toast.LENGTH_SHORT).show();
                switch (i) {
                    case 1:
                        et_rectangle_width.setVisibility(View.VISIBLE);
                        et_rectangle_height.setVisibility(View.VISIBLE);
                        et_circle_radius.setVisibility(View.GONE);
                        et_triangle_base.setVisibility(View.GONE);
                        et_triangle_height.setVisibility(View.GONE);
                        break;
                    case 2:
                        et_rectangle_width.setVisibility(View.GONE);
                        et_rectangle_height.setVisibility(View.GONE);
                        et_circle_radius.setVisibility(View.VISIBLE);
                        et_triangle_base.setVisibility(View.GONE);
                        et_triangle_height.setVisibility(View.GONE);
                        break;
                    case 3:
                        et_rectangle_width.setVisibility(View.GONE);
                        et_rectangle_height.setVisibility(View.GONE);
                        et_circle_radius.setVisibility(View.GONE);
                        et_triangle_base.setVisibility(View.VISIBLE);
                        et_triangle_height.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        bt_areas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index=sp.getSelectedItemPosition();
                double area=0;
                switch(index){

                    case 1:

                        double final_rec_width =Double.parseDouble(et_rectangle_width.getText().toString());

                        double final_rec_height= Double.parseDouble(et_rectangle_height.getText().toString());
                        area= final_rec_width*final_rec_height;
                        break;
                    case 2:

                        double final_cir_radius =Double.parseDouble(et_circle_radius.getText().toString());
                        area= Math.PI*Math.pow(final_cir_radius,2);
                        break;


                    case 3:

                        double final_tria_base =Double.parseDouble(et_triangle_base.getText().toString());

                        double final_tria_height= Double.parseDouble(et_rectangle_height.getText().toString());
                        area= 0.5*final_tria_base*final_tria_height;
                        break;


                }
                tv_result.setText(area+"");
            }
        });


    }}


