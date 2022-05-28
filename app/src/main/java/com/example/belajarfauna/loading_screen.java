package com.example.belajarfauna;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class loading_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        Thread loading = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(loading_screen.this, content_main.class));
                }
            }
        };
        loading.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}