package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Challenge extends AppCompatActivity {

    CardView bOpcion1,bOpcion2,bOpcion3,bOpcion4;
    Button bSummit;
    TextView tvOpcion1,tvOpcion2,tvOpcion3,tvOpcion4,pregunta,tvNumeroPregunta;
    ProgressBar pbNumeroPregunta;
    ImageView ivPregunta;

    Integer numeroPregunta=1;
    Integer score=0;
    Integer opcion;
    Boolean validacion=false;

    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);

        name=getIntent().getStringExtra("name");

        tvNumeroPregunta=findViewById(R.id.tvNumeroPregunta);
        pbNumeroPregunta=findViewById(R.id.pbNumeroPregunta);
        ivPregunta=findViewById(R.id.ivPregunta);

        tvOpcion1=findViewById(R.id.tvOpcion1);
        tvOpcion2=findViewById(R.id.tvOpcion2);
        tvOpcion3=findViewById(R.id.tvOpcion3);
        tvOpcion4=findViewById(R.id.tvOpcion4);

        pregunta=findViewById(R.id.pregunta);

        bOpcion1=findViewById(R.id.bOpcion1);
        bOpcion2=findViewById(R.id.bOpcion2);
        bOpcion3=findViewById(R.id.bOpcion3);
        bOpcion4=findViewById(R.id.bOpcion4);

        bSummit=findViewById(R.id.bSubmit);

        bOpcion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validacion=true;
                opcion=1;
                tvOpcion1.setTextColor(getColor(R.color.white));
                tvOpcion2.setTextColor(getColor(R.color.gray));
                tvOpcion3.setTextColor(getColor(R.color.gray));
                tvOpcion4.setTextColor(getColor(R.color.gray));

                bOpcion1.setCardBackgroundColor(getColor(R.color.colorPrimary));
                bOpcion2.setCardBackgroundColor(getColor(R.color.white));
                bOpcion3.setCardBackgroundColor(getColor(R.color.white));
                bOpcion4.setCardBackgroundColor(getColor(R.color.white));
            }
        });
        bOpcion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validacion=true;
                opcion=2;
                tvOpcion1.setTextColor(getColor(R.color.gray));
                tvOpcion2.setTextColor(getColor(R.color.white));
                tvOpcion3.setTextColor(getColor(R.color.gray));
                tvOpcion4.setTextColor(getColor(R.color.gray));

                bOpcion1.setCardBackgroundColor(getColor(R.color.white));
                bOpcion2.setCardBackgroundColor(getColor(R.color.colorPrimary));
                bOpcion3.setCardBackgroundColor(getColor(R.color.white));
                bOpcion4.setCardBackgroundColor(getColor(R.color.white));
            }
        });
        bOpcion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validacion=true;
                opcion=3;
                tvOpcion1.setTextColor(getColor(R.color.gray));
                tvOpcion2.setTextColor(getColor(R.color.gray));
                tvOpcion3.setTextColor(getColor(R.color.white));
                tvOpcion4.setTextColor(getColor(R.color.gray));

                bOpcion1.setCardBackgroundColor(getColor(R.color.white));
                bOpcion2.setCardBackgroundColor(getColor(R.color.white));
                bOpcion3.setCardBackgroundColor(getColor(R.color.colorPrimary));
                bOpcion4.setCardBackgroundColor(getColor(R.color.white));
            }
        });
        bOpcion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validacion=true;
                opcion=4;
                tvOpcion1.setTextColor(getColor(R.color.gray));
                tvOpcion2.setTextColor(getColor(R.color.gray));
                tvOpcion3.setTextColor(getColor(R.color.gray));
                tvOpcion4.setTextColor(getColor(R.color.white));

                bOpcion1.setCardBackgroundColor(getColor(R.color.white));
                bOpcion2.setCardBackgroundColor(getColor(R.color.white));
                bOpcion3.setCardBackgroundColor(getColor(R.color.white));
                bOpcion4.setCardBackgroundColor(getColor(R.color.colorPrimary));
            }
        });
        bSummit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validacion){
                    validacion=false;
                    puntaje(numeroPregunta);
                    numeroPregunta++;
                    preguntas(numeroPregunta);
                }else{
                    Toast.makeText(getApplicationContext(),"You must select one option!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void puntaje(Integer numeroPregunta) {
        if (numeroPregunta==1 && opcion==3){
            score++;
        }else if (numeroPregunta==2 && opcion==4){
            score++;
        }else if (numeroPregunta==3 && opcion==2){
            score++;
        }else if (numeroPregunta==4 && opcion==2){
            score++;
        }else if (numeroPregunta==5 && opcion==3){
            score++;
        }else if (numeroPregunta==6 && opcion==1){
            score++;
        }else if (numeroPregunta==7 && opcion==2){
            score++;
        }else if (numeroPregunta==8 && opcion==2){
            score++;
        }
    }

    private void preguntas(Integer numeroPregunta) {
        if (numeroPregunta==2){

            tvNumeroPregunta.setText("2/8");
            pbNumeroPregunta.setProgress(24);
            ivPregunta.setImageResource(R.mipmap.question2);

            bOpcion1.setCardBackgroundColor(getColor(R.color.white));
            bOpcion2.setCardBackgroundColor(getColor(R.color.white));
            bOpcion3.setCardBackgroundColor(getColor(R.color.white));
            bOpcion4.setCardBackgroundColor(getColor(R.color.white));

            tvOpcion1.setTextColor(getColor(R.color.gray));
            tvOpcion2.setTextColor(getColor(R.color.gray));
            tvOpcion3.setTextColor(getColor(R.color.gray));
            tvOpcion4.setTextColor(getColor(R.color.gray));

            pregunta.setText(getString(R.string.pregunta2));
            tvOpcion1.setText(getString(R.string.opcion2_1));
            tvOpcion2.setText(getString(R.string.opcion2_2));
            tvOpcion3.setText(getString(R.string.opcion2_3));
            tvOpcion4.setText(getString(R.string.opcion2_4));

        }else if (numeroPregunta==3){
            tvNumeroPregunta.setText("3/8");
            pbNumeroPregunta.setProgress(36);
            ivPregunta.setImageResource(R.mipmap.question3);

            bOpcion1.setCardBackgroundColor(getColor(R.color.white));
            bOpcion2.setCardBackgroundColor(getColor(R.color.white));
            bOpcion3.setCardBackgroundColor(getColor(R.color.white));
            bOpcion4.setCardBackgroundColor(getColor(R.color.white));

            tvOpcion1.setTextColor(getColor(R.color.gray));
            tvOpcion2.setTextColor(getColor(R.color.gray));
            tvOpcion3.setTextColor(getColor(R.color.gray));
            tvOpcion4.setTextColor(getColor(R.color.gray));

            pregunta.setText(getString(R.string.pregunta3));
            tvOpcion1.setText(getString(R.string.opcion3_1));
            tvOpcion2.setText(getString(R.string.opcion3_2));
            tvOpcion3.setText(getString(R.string.opcion3_3));
            tvOpcion4.setText(getString(R.string.opcion3_4));
        }else if (numeroPregunta==4){
            tvNumeroPregunta.setText("4/8");
            pbNumeroPregunta.setProgress(48);
            ivPregunta.setImageResource(R.mipmap.question4);

            bOpcion1.setCardBackgroundColor(getColor(R.color.white));
            bOpcion2.setCardBackgroundColor(getColor(R.color.white));
            bOpcion3.setCardBackgroundColor(getColor(R.color.white));
            bOpcion4.setCardBackgroundColor(getColor(R.color.white));

            tvOpcion1.setTextColor(getColor(R.color.gray));
            tvOpcion2.setTextColor(getColor(R.color.gray));
            tvOpcion3.setTextColor(getColor(R.color.gray));
            tvOpcion4.setTextColor(getColor(R.color.gray));

            pregunta.setText(getString(R.string.pregunta4));
            tvOpcion1.setText(getString(R.string.opcion4_1));
            tvOpcion2.setText(getString(R.string.opcion4_2));
            tvOpcion3.setText(getString(R.string.opcion4_3));
            tvOpcion4.setText(getString(R.string.opcion4_4));
        }
        else if (numeroPregunta==5){
            tvNumeroPregunta.setText("5/8");
            pbNumeroPregunta.setProgress(60);
            ivPregunta.setImageResource(R.mipmap.question5);

            bOpcion1.setCardBackgroundColor(getColor(R.color.white));
            bOpcion2.setCardBackgroundColor(getColor(R.color.white));
            bOpcion3.setCardBackgroundColor(getColor(R.color.white));
            bOpcion4.setCardBackgroundColor(getColor(R.color.white));

            tvOpcion1.setTextColor(getColor(R.color.gray));
            tvOpcion2.setTextColor(getColor(R.color.gray));
            tvOpcion3.setTextColor(getColor(R.color.gray));
            tvOpcion4.setTextColor(getColor(R.color.gray));

            pregunta.setText(getString(R.string.pregunta5));
            tvOpcion1.setText(getString(R.string.opcion5_1));
            tvOpcion2.setText(getString(R.string.opcion5_2));
            tvOpcion3.setText(getString(R.string.opcion5_3));
            tvOpcion4.setText(getString(R.string.opcion5_4));
        }
        else if (numeroPregunta==6){
            tvNumeroPregunta.setText("6/8");
            pbNumeroPregunta.setProgress(72);
            ivPregunta.setImageResource(R.mipmap.question6);

            bOpcion1.setCardBackgroundColor(getColor(R.color.white));
            bOpcion2.setCardBackgroundColor(getColor(R.color.white));
            bOpcion3.setCardBackgroundColor(getColor(R.color.white));
            bOpcion4.setCardBackgroundColor(getColor(R.color.white));

            tvOpcion1.setTextColor(getColor(R.color.gray));
            tvOpcion2.setTextColor(getColor(R.color.gray));
            tvOpcion3.setTextColor(getColor(R.color.gray));
            tvOpcion4.setTextColor(getColor(R.color.gray));

            pregunta.setText(getString(R.string.pregunta6));
            tvOpcion1.setText(getString(R.string.opcion6_1));
            tvOpcion2.setText(getString(R.string.opcion6_2));
            tvOpcion3.setText(getString(R.string.opcion6_3));
            tvOpcion4.setText(getString(R.string.opcion6_4));
        }
        else if (numeroPregunta==7){
            tvNumeroPregunta.setText("7/8");
            pbNumeroPregunta.setProgress(84);
            ivPregunta.setImageResource(R.mipmap.question7);

            bOpcion1.setCardBackgroundColor(getColor(R.color.white));
            bOpcion2.setCardBackgroundColor(getColor(R.color.white));
            bOpcion3.setCardBackgroundColor(getColor(R.color.white));
            bOpcion4.setCardBackgroundColor(getColor(R.color.white));

            tvOpcion1.setTextColor(getColor(R.color.gray));
            tvOpcion2.setTextColor(getColor(R.color.gray));
            tvOpcion3.setTextColor(getColor(R.color.gray));
            tvOpcion4.setTextColor(getColor(R.color.gray));

            pregunta.setText(getString(R.string.pregunta7));
            tvOpcion1.setText(getString(R.string.opcion7_1));
            tvOpcion2.setText(getString(R.string.opcion7_2));
            tvOpcion3.setText(getString(R.string.opcion7_3));
            tvOpcion4.setText(getString(R.string.opcion7_4));
        }
        else if (numeroPregunta==8){
            tvNumeroPregunta.setText("8/8");
            pbNumeroPregunta.setProgress(100);
            ivPregunta.setImageResource(R.mipmap.question8);

            bOpcion1.setCardBackgroundColor(getColor(R.color.white));
            bOpcion2.setCardBackgroundColor(getColor(R.color.white));
            bOpcion3.setCardBackgroundColor(getColor(R.color.white));
            bOpcion4.setCardBackgroundColor(getColor(R.color.white));

            tvOpcion1.setTextColor(getColor(R.color.gray));
            tvOpcion2.setTextColor(getColor(R.color.gray));
            tvOpcion3.setTextColor(getColor(R.color.gray));
            tvOpcion4.setTextColor(getColor(R.color.gray));

            pregunta.setText(getString(R.string.pregunta8));
            tvOpcion1.setText(getString(R.string.opcion8_1));
            tvOpcion2.setText(getString(R.string.opcion8_2));
            tvOpcion3.setText(getString(R.string.opcion8_3));
            tvOpcion4.setText(getString(R.string.opcion8_4));
        }else if (numeroPregunta==9){
            Intent intent = new Intent(Challenge.this, Result.class);
            intent.putExtra("score",score.toString());
            intent.putExtra("name",name);
            startActivity(intent);
        }
    }
}