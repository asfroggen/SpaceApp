package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView tvResultDesc,tvName,tvScore;
    Button bFinish;
    ImageView ivResult;

    String name;
    Integer score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvName=findViewById(R.id.tvName);
        tvResultDesc=findViewById(R.id.tvResultDesc);
        tvScore=findViewById(R.id.tvScore);

        bFinish=findViewById(R.id.bFinish);
        ivResult=findViewById(R.id.ivResult);

        name=getIntent().getStringExtra("name");
        tvName.setText(name);
        score=Integer.parseInt(getIntent().getStringExtra("score"));

        if (score < 5){
            String scoreSetText="Your score is "+score+" out of 8";
            ivResult.setImageResource(R.mipmap.bajo);
            tvResultDesc.setText("You are a recruit in training, you need to study more!");
            tvScore.setText(scoreSetText);
        }else if (score <= 6){
            String scoreSetText="Your score is "+score+" out of 8";
            ivResult.setImageResource(R.mipmap.medio);
            tvResultDesc.setText("You are quite a NASA researcher! You are one step away from being the boss!");
            tvScore.setText(scoreSetText);
        }else{
            String scoreSetText="Your score is "+score+" out of 8";
            ivResult.setImageResource(R.mipmap.alto);
            tvResultDesc.setText("Congratulations you are a head of NASA!");
            tvScore.setText(scoreSetText);
        }
        bFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Result.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}