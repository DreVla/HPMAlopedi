package com.hpmtutorial.hpmalopedi.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.hpmtutorial.hpmalopedi.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    }

    public void startValidation(View view) {
        Intent validation = new Intent(getApplicationContext(), ValidationActivity.class);
        startActivity(validation);
        finish();
    }
}
