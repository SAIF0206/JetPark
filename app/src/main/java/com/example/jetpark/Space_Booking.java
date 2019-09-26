package com.example.jetpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;

public class Space_Booking extends AppCompatActivity {

    //Linear layout Show
    LinearLayout show;
    Switch switchButton;

    private Button toastButton1;
    private Button toastButton2;
    private Button datePicker;
    private Button datePicker2;
    private Button datePicker1;
    private Button redButton;
    private Button GreenButton;
    private Button Wheelchair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space__booking);

        //Switch Code
        switchButton = findViewById(R.id.switch1);
        show = findViewById(R.id.SeasonalLinear);
        switchButton.setChecked(false);
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    show.setVisibility(View.INVISIBLE);
                }
                else{
                        show.setVisibility(View.VISIBLE);
                }
            }
        });



        GreenButton = findViewById(R.id.Green);
        Wheelchair = findViewById(R.id.wheelChair);
        toastButton1 = findViewById(R.id.parkNotAva);
        toastButton2 = findViewById(R.id.parkNotAva2);



        toastButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(getApplicationContext(),"Parking Not Available",Toast.LENGTH_SHORT).show();
            }
        });


        toastButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(getApplicationContext(),"Parking Not Available",Toast.LENGTH_SHORT).show();
            }
        });



        GreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Electric Cars Only",Toast.LENGTH_SHORT).show();
            }
        });

        Wheelchair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"SPECIAL ASSISTANT",Toast.LENGTH_SHORT).show();
            }
        });



        redButton = findViewById(R.id.Priority);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Priority Parking",Toast.LENGTH_SHORT).show();
            }
        });



        datePicker1 = findViewById(R.id.parkAva);
        datePicker2 = findViewById(R.id.parkAva2);
        datePicker = findViewById(R.id.parkAva4);
        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDatePicker();
            }
        });
        datePicker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDatePicker();
            }
        });
        datePicker2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDatePicker();
            }
        });

    }

    public void openDatePicker()
    {
        Intent dintent = new Intent(this, Date_Picker.class);
        startActivity(dintent);

    }
}
