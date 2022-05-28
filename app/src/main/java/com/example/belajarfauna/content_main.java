package com.example.belajarfauna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class content_main extends AppCompatActivity {
    private CardView darat, air, amphibi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_main);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        darat = (CardView) findViewById(R.id.content_darat);
        air = (CardView) findViewById(R.id.content_air);
        amphibi = (CardView) findViewById(R.id.content_amphibi);


        darat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(content_main.this, contenthewan_darat.class));
            }
        });
        air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(content_main.this, contenthewan_air.class));
            }
        });
        amphibi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(content_main.this, hewanamphibi.class));
            }
        });
    }
}