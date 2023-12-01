package com.deelaka.virtuafit.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.deelaka.virtuafit.Authentication.LoginActivity;
import com.deelaka.virtuafit.MainActivity;
import com.deelaka.virtuafit.R;
import com.google.ar.core.ArCoreApk;

public class SplashActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              //  startActivity(new Intent(SplashActivity.this, LoginActivity.class));

            }
        },300000);




    }


}