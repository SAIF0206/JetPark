package com.example.jetpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button subutton;
    private Button lbutton;
    private Button fbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Sign Up Button Code
        subutton = findViewById(R.id.singup);
        subutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUpActivity();
            }
        });

        //Login Button Code
        lbutton = findViewById(R.id.login);
        lbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginButton();
            }
        });

        //Forget Password Button
        fbutton = findViewById(R.id.forgetpassword);
        fbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openForgetButton();
            }
        });


    }


    //sign up button method
    public void openSignUpActivity()
    {
        Intent suintent = new Intent(this, SignUp.class);
        startActivity(suintent);

    }

    //login button method
    public  void openLoginButton()
    {
        Intent lintent = new Intent(this, MapsActivity.class);
        startActivity(lintent);

    }

    //Forget Button
    public void openForgetButton()
    {
        Intent fpintent = new Intent(this, ForgetActivity.class);
        startActivity(fpintent);
    }
}
