package com.study.gouravsaini.logregapp;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.util.Log;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {



    private TextInputEditText text_name;
    private TextInputEditText text_course;
    private TextInputEditText text_addmission_no;
    private TextInputEditText text_password;

    private AppCompatButton signup;
    private AppCompatTextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        getSupportActionBar().setTitle("Registration");


        //Data Field
        text_name = (TextInputEditText) findViewById(R.id.text_name);
        text_course = (TextInputEditText) findViewById(R.id.text_course);
        text_addmission_no = (TextInputEditText) findViewById(R.id.text_addmission_no);
        text_password = (TextInputEditText) findViewById(R.id.text_password);

        //Signup Button
        signup = (AppCompatButton) findViewById(R.id.signup);

        //Login Text
        login = (AppCompatTextView) findViewById(R.id.login);


    }

    public void login(View view) {
        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
    }
}
