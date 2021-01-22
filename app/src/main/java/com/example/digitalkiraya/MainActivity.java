package com.example.digitalkiraya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=4000;
    ImageView imageview1,imageview2,imageview3,imageview4,imageview5,imageview6;
    Animation phn_anim,hut_anim,text1_anim,text2_anim,line1_anim,line2_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeintent=new Intent(MainActivity.this,WelcomeScreen.class);
                startActivity(homeintent);
                finish();
            }
        },SPLASH_TIME_OUT);

        imageview1 = findViewById(R.id.phone_id);
        imageview2 = findViewById(R.id.hut_id);
        imageview3 = findViewById(R.id.digital_id);
        imageview4 = findViewById(R.id.kiraya_id);
        imageview5 = findViewById(R.id.line1_id);
        imageview6 = findViewById(R.id.line2_id);

        phn_anim = AnimationUtils.loadAnimation(this, R.anim.phone_anim);
        hut_anim = AnimationUtils.loadAnimation(this, R.anim.hut_anim);
        text1_anim = AnimationUtils.loadAnimation(this, R.anim.text1_anim);
        text2_anim = AnimationUtils.loadAnimation(this, R.anim.text2_anim);
        line1_anim = AnimationUtils.loadAnimation(this, R.anim.line1_anim);
        line2_anim = AnimationUtils.loadAnimation(this, R.anim.line2_anim);

        imageview1.setAnimation(phn_anim);
        imageview2.setAnimation(hut_anim);
        imageview3.setAnimation(text1_anim);
        imageview4.setAnimation(text2_anim);
        /*imageview5.setAnimation(line1_anim);
        imageview6.setAnimation(line2_anim);*/

    }
}