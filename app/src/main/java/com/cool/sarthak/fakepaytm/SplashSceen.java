package com.cool.sarthak.fakepaytm;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashSceen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_sceen);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */



                    Intent intent = new Intent(SplashSceen.this,Valsarthak.class);
                    startActivity(intent);
                    finish();

            }
        }, 3300);


    }
}
