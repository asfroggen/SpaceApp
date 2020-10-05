package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Menu extends AppCompatActivity {

    LinearLayout bOurOcean, bChallenge, bExit;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        name = getIntent().getStringExtra("name");

        bOurOcean=findViewById(R.id.bOurOcean);
        bChallenge=findViewById(R.id.bChallenge);
        bExit=findViewById(R.id.bExit);

        bOurOcean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Menu.this, OurOcean.class);
                Intent intent = new Intent(Menu.this, Informacion.class);
                startActivity(intent);
            }
        });
        bChallenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Challenge.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
        bExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}