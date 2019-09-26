package com.example.jetpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    private ImageButton backButton;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Back Button
        backButton =findViewById(R.id.imageButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
        //back button function

        //Submit button
        submitButton = findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Successfully Registered",Toast.LENGTH_SHORT).show();
                openMain();
            }
        });

    }
    public void openMain()
    {
        Intent bIntent = new Intent(this, MainActivity.class);
        startActivity(bIntent);
        overridePendingTransition(R.anim.anim_slide_in_right,R.anim.anim_slide_out_left);
        }
}
