package com.hpmtutorial.hpmalopedi.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.hpmtutorial.hpmalopedi.R;
import com.hpmtutorial.hpmalopedi.view.fragments.ContainerActivity;

public class ConfirmActivity extends AppCompatActivity {
    
    private TextInputEditText digit1,digit2,digit3,digit4,digit5,digit6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
    
        digit1 = findViewById(R.id.validation_code_1);
        digit2 = findViewById(R.id.validation_code_2);
        digit3 = findViewById(R.id.validation_code_3);
        digit4 = findViewById(R.id.validation_code_4);
        digit5 = findViewById(R.id.validation_code_5);
        digit6 = findViewById(R.id.validation_code_6);
        
        addDigitsListener();

    }

    private void addDigitsListener() {

        digit1.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(digit1.getText().toString().length()==1)     //size as per your requirement
                {
                    digit2.requestFocus();
                }
            }

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                // TODO Auto-generated method stub
                if(digit1.getText().toString().length()==1)     //size as per your requirement
                {
                    digit2.requestFocus();
                } else if(digit1.getText().toString().length()==0){
                    digit1.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        digit2.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if(digit2.getText().toString().length()==1)     //size as per your requirement
                {
                    digit3.requestFocus();
                } else if(digit2.getText().toString().length()==0){
                    digit1.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        digit3.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if(digit3.getText().toString().length()==1)     //size as per your requirement
                {
                    digit4.requestFocus();
                } else if(digit3.getText().toString().length()==0){
                    digit2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        digit4.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if(digit4.getText().toString().length()==1)     //size as per your requirement
                {
                    digit5.requestFocus();
                } else if(digit4.getText().toString().length()==0){
                    digit3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        digit5.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if(digit5.getText().toString().length()==1)     //size as per your requirement
                {
                    digit6.requestFocus();
                } else if(digit5.getText().toString().length()==0){
                    digit4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        digit6.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                if(digit6.getText().toString().length()==1)     //size as per your requirement
                {
                    digit6.requestFocus();
                } else if(digit6.getText().toString().length()==0){
                    digit5.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    public void startHome(View view) {
        Intent validation = new Intent(getApplicationContext(), ContainerActivity.class);
        startActivity(validation);
        finish();
    }
}
