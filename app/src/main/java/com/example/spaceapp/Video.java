package com.example.spaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    VideoView videoView;
    String boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView=findViewById(R.id.videoView);

        boton = getIntent().getStringExtra("boton");
        if (boton.equals("inicio")){
            String uriPath = "android.resource://" + getPackageName() + "/raw/hi";
            Uri uri = Uri.parse(uriPath);
            videoView.setVideoURI(uri);
            videoView.setMediaController(new MediaController(this));
            videoView.start();
        }else if (boton.equals("tierra")){
            String uriPath = "android.resource://" + getPackageName() + "/raw/tierra";
            Uri uri = Uri.parse(uriPath);
            videoView.setVideoURI(uri);
            videoView.setMediaController(new MediaController(this));
            videoView.start();
        }else if (boton.equals("sal")){
            String uriPath = "android.resource://" + getPackageName() + "/raw/sal";
            Uri uri = Uri.parse(uriPath);
            videoView.setVideoURI(uri);
            videoView.setMediaController(new MediaController(this));
            videoView.start();
        }else if (boton.equals("peces")){
            String uriPath = "android.resource://" + getPackageName() + "/raw/peces";
            Uri uri = Uri.parse(uriPath);
            videoView.setVideoURI(uri);
            videoView.setMediaController(new MediaController(this));
            videoView.start();
        }

    }

}