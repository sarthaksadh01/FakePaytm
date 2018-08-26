package com.cool.sarthak.fakepaytm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Valsarthak extends AppCompatActivity {
    EditText name,money,phone;
    String n,m,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valsarthak);

    }

    public void fuckoff(View view) {
        name=findViewById(R.id.nameval);
        money=findViewById(R.id.moneyval);
        phone=findViewById(R.id.numberval);

        n=name.getText().toString();
        m=money.getText().toString();
        p=phone.getText().toString();
        Intent intent = new Intent(Valsarthak.this,Success.class);
        intent.putExtra("name",n);
        intent.putExtra("money",m);
        intent.putExtra("phone",p);
        startActivity(intent);
    }
}
