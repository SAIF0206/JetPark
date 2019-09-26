package com.example.jetpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class ChangesBooking extends AppCompatActivity {

     private Button share;
     RelativeLayout show;
     private Button confirmB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changes_booking);

        show = findViewById(R.id.linearLayout);
        show.setVisibility(View.INVISIBLE);
        share = findViewById(R.id.ShareB);
         share.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 show.animate().alpha(5.0f).setDuration(9000);
                 show.setVisibility(View.VISIBLE);
                 show.animate().alpha(5.0f).setDuration(9000);
             }
         });

         confirmB = findViewById(R.id.confirm);
         confirmB.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openPayment();
             }
         });
    }

    public  void openPayment()
    {
        Intent paym = new Intent(this,Slot_Booking.class);
        startActivity(paym);
    }
}
