package com.example.scube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class PhoneVerifyActivity extends AppCompatActivity {

    MaterialButton home_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_verify);

        home_screen = findViewById(R.id.otp_btn);

        home_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PhoneVerifyActivity.this,Check_done.class);
                startActivity(i);
            }
        });
    }
}
