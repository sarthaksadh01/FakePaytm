package com.cool.sarthak.fakepaytm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void pay(View view) {
        Intent  intent = new Intent(Home.this,Valsarthak.class);
        startActivity(intent);
    }
}
