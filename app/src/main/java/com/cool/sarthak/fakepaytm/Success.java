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

public class Success extends Activity {
    TextView amnt,nm,phn,dt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        name = name+"'s";
        String phone = intent.getExtras().getString("phone");
        String money = intent.getExtras().getString("money");
        amnt =findViewById(R.id.amnt);
        nm = findViewById(R.id.name);
        phn = findViewById(R.id.number);
        dt =findViewById(R.id.date);
        amnt.setText("\u20B9"+money);
        phn.setText(phone);
        nm.setText(name+" "+"Wallet linked to");
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = sdf.format(c.getTime());
        dt.setText(strDate);



    }
}
