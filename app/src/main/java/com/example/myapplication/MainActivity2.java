package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String name=intent.getStringExtra("Name");
        String phone=intent.getStringExtra("Phonenum");
        String email=intent.getStringExtra("Email");
        String gender=intent.getStringExtra("Gender");
        TextView InformationSummary=findViewById(R.id.textView);
        InformationSummary.setText("Name: "+name +"\n Phone number:"+phone +"\n Email-Address:"+email+
                "\n Gender:"+ gender);


    }
}