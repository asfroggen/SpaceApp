package com.example.spaceapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Informacion extends AppCompatActivity {

    ImageView ivInicio,ivSatelite,ivEarth,ivPetroleo,ivSal,ivPlancton,ivPeces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        ivInicio=findViewById(R.id.ivInicio);
        ivSatelite=findViewById(R.id.ivSatelite);
        ivEarth=findViewById(R.id.ivEarth);
        ivPetroleo=findViewById(R.id.ivPetroleo);
        ivSal=findViewById(R.id.ivSal);
        ivPlancton=findViewById(R.id.ivPlancton);
        ivPeces=findViewById(R.id.ivPeces);

        ivInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Informacion.this, Video.class);
                intent.putExtra("boton","inicio");
                startActivity(intent);
            }
        });
        ivSatelite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Informacion.this, Video.class);
                intent.putExtra("boton","satelite");
                startActivity(intent);
            }
        });
        ivEarth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Informacion.this, Video.class);
                intent.putExtra("boton","tierra");
                startActivity(intent);
            }
        });
        ivPetroleo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Informacion.this, Video.class);
                intent.putExtra("boton","petroleo");
                startActivity(intent);
            }
        });
        ivSal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Informacion.this, Video.class);
                intent.putExtra("boton","sal");
                startActivity(intent);
            }
        });
        ivPlancton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
        ivPeces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Informacion.this, Video.class);
                intent.putExtra("boton","peces");
                startActivity(intent);
            }
        });

    }
    void showDialog(){
        LayoutInflater inflater = LayoutInflater.from(this);
        View view=inflater.inflate(R.layout.alert_dialog,null);
        view.setBackground(getResources().getDrawable(R.drawable.rounded_corner_square));
        Button bWow = view.findViewById(R.id.bWow);


        final AlertDialog alertDialog= new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.show();
        bWow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });
    }
}