package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void sayTheColor(View view){
    Button clicked_button = (Button) view;
    MediaPlayer mediaPlayer = MediaPlayer.create(this,
            getResources().getIdentifier(clicked_button.getTag().toString(),
                    "raw",
                    getPackageName()));
mediaPlayer.start();
    }

}
