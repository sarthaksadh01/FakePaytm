package com.cool.sarthak.fakepaytm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Success extends Activity {
    TextView amnt,nm,phn,dt,tid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent intent = getIntent();

        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        String name = intent.getExtras().getString("name");
        name = name+"'s";
        String phone = intent.getExtras().getString("phone");
        String money = intent.getExtras().getString("money");
        amnt =findViewById(R.id.amnt);
        nm = findViewById(R.id.name);
        phn = findViewById(R.id.number);
        dt =findViewById(R.id.date);
        amnt.setText(String.format("₹%s", money));
        phn.setText(phone);
        tid = findViewById(R.id.trans);
        tid.setText("Transaction ID: "+number);
        nm.setText(String.format("%s Wallet linked to", name));
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm yyyy-MM-dd ");
        String strDate = sdf.format(c.getTime());
        dt.setText(strDate);



    }
}
