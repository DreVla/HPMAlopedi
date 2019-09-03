package com.hpmtutorial.hpmalopedi.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hpmtutorial.hpmalopedi.R;

public class ValidationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);

    }

    public void startConfirm(View view) {
        Intent validation = new Intent(getApplicationContext(), ConfirmActivity.class);
        startActivity(validation);
        finish();
    }
}
