package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.nio.charset.MalformedInputException;

public class MainActivity extends AppCompatActivity {

    Button start;
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start=findViewById(R.id.bStart);
        etName=findViewById(R.id.etName);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!etName.getText().toString().isEmpty()){
                    Intent intent = new Intent(MainActivity.this, Menu.class);
                    intent.putExtra("name",etName.getText().toString());
                    startActivity(intent);
                }else{
                    etName.setError("Name is necessary");
                }

            }
        });
    }
}