package com.cool.sarthak.fakepaytm;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.budiyev.android.codescanner.AutoFocusMode;
import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.budiyev.android.codescanner.ErrorCallback;
import com.google.zxing.Result;


public class Valsarthak extends Activity {

    final int RequestCameraPermissionID = 1001;
    private CodeScanner mCodeScanner;
    boolean a=true;

    EditText name,money,phone;
    String n,m,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valsarthak);
        if (ActivityCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            //Request permission
            ActivityCompat.requestPermissions(Valsarthak.this,
                    new String[]{Manifest.permission.CAMERA},RequestCameraPermissionID);

            return;
        }
        else launch_camera();

    }

        public void launch_camera()
        {
            if(ActivityCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
                 a=false;

                CodeScannerView scannerView = findViewById(R.id.scanner_view);
                // Use builder
                mCodeScanner = CodeScanner.builder()

                        .formats(CodeScanner.ALL_FORMATS)/*List<BarcodeFormat>*/

                        .autoFocus(true).autoFocusMode(AutoFocusMode.SAFE).autoFocusInterval(2000L)

                        .flash(false)

                        .onDecoded(new DecodeCallback() {
                            @Override
                            public void onDecoded(@NonNull final Result result) {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {

//                                        String s = result.getText();
//                                        if (s.equals(predefined)) build_show();

                                    }
                                });
                            }
                        })

                        .onError(new ErrorCallback() {
                            @Override
                            public void onError(@NonNull final Exception error) {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {

                                    }
                                });
                            }
                        }).build(this, scannerView);

                scannerView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mCodeScanner.startPreview();
                    }
                });


                mCodeScanner.startPreview();
            }
        }


    public void harish(View view) {
        Intent intent = new Intent(Valsarthak.this,Prefinal.class);
        intent.putExtra("name","HARISH YADAV");
        intent.putExtra("phone","+919990929003");
        startActivity(intent);
    }

    public void baskit(View view) {

        Intent intent = new Intent(Valsarthak.this,Prefinal.class);
        intent.putExtra("name","BASKIT KUMAR");
        intent.putExtra("phone","+919891166976");
        startActivity(intent);
    }
}

//    public void fuckoff(View view) {
//        name=findViewById(R.id.nameval);
//        money=findViewById(R.id.moneyval);
//        phone=findViewById(R.id.numberval);
//
//        n=name.getText().toString();
//        m=money.getText().toString();
//        p=phone.getText().toString();
//        Intent intent = new Intent(Valsarthak.this,Success.class);
//        intent.putExtra("name",n);
//        intent.putExtra("money",m);
//        intent.putExtra("phone",p);
//        startActivity(intent);
//    }

