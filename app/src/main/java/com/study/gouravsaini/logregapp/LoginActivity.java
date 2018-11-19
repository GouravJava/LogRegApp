package com.study.gouravsaini.logregapp;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

public class LoginActivity extends AppCompatActivity {


    //Data Field

    private TextInputEditText text_addmission_no;
    private TextInputEditText text_password;
//Login Button
    private AppCompatButton login;

    //Signup Text
    private AppCompatTextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setTitle("Login");


        text_addmission_no = (TextInputEditText) findViewById(R.id.text_addmission_no);
        text_password = (TextInputEditText) findViewById(R.id.text_password);
//Login Button
        login = (AppCompatButton) findViewById(R.id.login);

        //Signup Text
        signup = (AppCompatTextView) findViewById(R.id.signup);
    }

    public void register(View view) {
        startActivity(new Intent(LoginActivity.this,RegistrationActivity.class));
    }
}
