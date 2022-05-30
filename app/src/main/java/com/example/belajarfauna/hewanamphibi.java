package com.example.belajarfauna;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class hewanamphibi extends AppCompatActivity {
    MediaPlayer kodok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewanamphibi);
        kodok=MediaPlayer.create(hewanamphibi.this,R.raw.frogs);
    }
    public void katak(View v){
        kodok.start();
    }
}