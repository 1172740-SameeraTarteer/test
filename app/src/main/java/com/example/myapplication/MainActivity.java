package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private EditText edtName;
    private EditText edtPhone;
    private EditText edtEmail;
    private Spinner spGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
        edtPhone = findViewById(R.id.edtPhone);
        edtEmail = findViewById(R.id.edtEmail);
        spGender= findViewById(R.id.spGender);

    }

    public void save(View view) {
        String name=edtName.getText().toString();
        String phone=edtPhone.getText().toString();
        String email=edtEmail.getText().toString();
        String gender=spGender.getSelectedItem().toString();

        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("Name",name);
        intent.putExtra("Phonenum",phone);
        intent.putExtra("Email",email);
        intent.putExtra("Gender",gender);
        startActivity(intent);


    }
    public void spinner(){
        String data []={"Male","Female"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, data);
        spGender.setAdapter(adapter);

    }
}