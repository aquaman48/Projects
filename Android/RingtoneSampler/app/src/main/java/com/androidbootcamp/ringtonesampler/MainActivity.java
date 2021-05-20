package com.androidbootcamp.ringtonesampler;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    Button play;
    MediaPlayer mpHappy, mpCrazy, mpBoom;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final RadioButton happy = (RadioButton) findViewById(R.id.radHappy);
        final RadioButton crazy = (RadioButton) findViewById(R.id.radCrazy);
        final RadioButton boom = (RadioButton) findViewById(R.id.radBoom);
        play = (Button) findViewById(R.id.btnPlay);
        mpHappy = new MediaPlayer();
        mpHappy = MediaPlayer.create(this, R.raw.be_happy);
        mpCrazy = new MediaPlayer();
        mpCrazy = MediaPlayer.create(this, R.raw.beautiful_crazy);
        mpBoom = new MediaPlayer();
        mpBoom = MediaPlayer.create(this, R.raw.suga_boom_boom);
        playing = 0;

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(happy.isChecked()) {
                    switch (playing){
                        case 0:
                            mpHappy.start();
                            playing = 1;
                            play.setText("Pause Ringtone");
                            crazy.setVisibility(View.INVISIBLE);
                            boom.setVisibility(View.INVISIBLE);
                            break;
                        case 1:
                            mpHappy.pause();
                            playing = 0;
                            play.setText("Play Ringtone");
                            crazy.setVisibility(View.VISIBLE);
                            boom.setVisibility(View.VISIBLE);
                            break;
                    }
                }
                if(crazy.isChecked()) {
                    switch (playing) {
                        case 0:
                            mpCrazy.start();
                            playing = 1;
                            play.setText("Pause Ringtone");
                            happy.setVisibility(View.INVISIBLE);
                            boom.setVisibility(View.INVISIBLE);
                            break;
                        case 1:
                            mpCrazy.pause();
                            playing = 0;
                            play.setText("Play Ringtone");
                            happy.setVisibility(View.VISIBLE);
                            boom.setVisibility(View.VISIBLE);
                            break;
                    }
                }
                if(boom.isChecked()) {
                    switch (playing) {
                        case 0:
                            mpBoom.start();
                            playing = 1;
                            play.setText("Pause Ringtone");
                            crazy.setVisibility(View.INVISIBLE);
                            happy.setVisibility(View.INVISIBLE);
                            break;
                        case 1:
                            mpBoom.pause();
                            playing = 0;
                            play.setText("Play Ringtone");
                            crazy.setVisibility(View.VISIBLE);
                            happy.setVisibility(View.VISIBLE);
                            break;
                    }
                }
            }
        });
    }

}