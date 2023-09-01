package com.example.scube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Check_done extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_done);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent check=new Intent(Check_done.this,HomeActivity.class);
                startActivity(check);
                finish();
            }
        },1780);
    }
}