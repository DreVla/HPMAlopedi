package com.hpmtutorial.hpmalopedi.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hpmtutorial.hpmalopedi.R;

public class ConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
    }

    public void startHome(View view) {
        Intent validation = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(validation);
        finish();
    }
}