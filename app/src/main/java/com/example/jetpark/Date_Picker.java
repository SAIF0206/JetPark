package com.example.jetpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.DatePickerDialog;

import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;


import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;


public class Date_Picker extends AppCompatActivity implements View.OnClickListener {

    Button btnDatePicker, btnTimePicker;
    EditText txtDate, txtTime,price;
    private int mYear, mMonth, mDay;
    Button toastconfirm ;
    Button modifyb;
    Button getPrice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date__picker);
        btnDatePicker=findViewById(R.id.btn_date);
        btnTimePicker=findViewById(R.id.btn_outDate);
        txtDate=findViewById(R.id.in_date);
        txtTime=findViewById(R.id.out_date);
        price = findViewById(R.id.price);
        price.setText("$S90");
        toastconfirm = findViewById(R.id.confirm);
        modifyb = findViewById(R.id.modifyB);
        getPrice = findViewById(R.id.price_b);
        btnDatePicker.setOnClickListener(this);
        btnTimePicker.setOnClickListener(this);

        toastconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Booking Confirmed",Toast.LENGTH_SHORT).show();
                openPayment();
            }
        });

        modifyb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ModifyBooking();
            }
        });

        getPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                price.setVisibility(View.VISIBLE);

            }
        });



    }


    public void openPayment()
    {
        Intent pintent = new Intent(this,Slot_Booking.class);
        startActivity(pintent);
    }

    public  void ModifyBooking()
    {
        Intent mintent = new Intent(this,ChangesBooking.class);
        startActivity(mintent);
    }

    @Override
    public void onClick(View v) {

        if (v == btnDatePicker) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();



            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
        if (v == btnTimePicker) {


           // price.setVisibility(View.VISIBLE);
            // Get Current Time
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            // Launch Time Picker Dialog
            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txtTime.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);


                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();


        }




    }

}
