package com.example.scube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Animation topanim,btmanim;
    ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        topanim= AnimationUtils.loadAnimation(this,R.anim.top_anim);
        btmanim= AnimationUtils.loadAnimation(this,R.anim.btm_anim);
        img1 = findViewById(R.id.corner);
        img2 = findViewById(R.id.imageView);
        img1.setAnimation(topanim);
        img2.setAnimation(btmanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent welcome=new Intent(MainActivity.this,WelcomeActivity.class);
                startActivity(welcome);
                finish();
            }
        },3100);
    }
}
