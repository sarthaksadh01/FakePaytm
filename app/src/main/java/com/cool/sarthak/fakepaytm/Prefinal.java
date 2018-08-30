package com.cool.sarthak.fakepaytm;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Prefinal extends Activity {
    TextView a,b;
    EditText c;
    String name,phone;
    LottieAnimationView lottieAnimationView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prefinal);
        Intent intent = getIntent();
        name = intent.getExtras().getString("name");
        phone = intent.getExtras().getString("phone");
        a=findViewById(R.id.no);
        b=findViewById(R.id.nm);
        a.setText(phone);
        b.setText(name);
        c=findViewById(R.id.c);
        lottieAnimationView = findViewById(R.id.paytmload);
        button=findViewById(R.id.pay);

    }

    public void paym(View view) {

        button.setClickable(false);
        button.setAlpha(.2f);
        lottieAnimationView.setVisibility(View.VISIBLE);



        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, "hasbuiasgd")
                .setSmallIcon(R.drawable.paytmlogo)
                .setContentTitle("Payed successfully "+c.getText().toString()+ name)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {




                Intent intent = new Intent(Prefinal.this,Success.class);
                intent.putExtra("name",name);
                intent.putExtra("phone",phone);
                intent.putExtra("money",c.getText().toString());
                startActivity(intent);
                finish();

            }
        }, 3300);




    }
}
