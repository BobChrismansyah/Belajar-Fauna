package com.example.belajarfauna;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class content_main extends AppCompatActivity {
    private CardView darat, air, amphibi, testing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_main);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        darat = (CardView) findViewById(R.id.content_darat);
        air = (CardView) findViewById(R.id.content_air);
        amphibi = (CardView) findViewById(R.id.content_amphibi);
        testing = (CardView) findViewById(R.id.testing1);


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
        testing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(content_main.this, tesscroll.class));
            }
        });
    }


    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder
                = new AlertDialog
                .Builder(content_main.this);

        builder.setMessage("Yah.. apakah kamu yakin keluar ?");

        builder.setCancelable(false);


        builder
                .setPositiveButton(
                        "   Ya   ",
                        new DialogInterface
                                .OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                finish();
                            }
                        });

        builder
                .setNegativeButton(
                        "Tidak",
                        new DialogInterface
                                .OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                dialog.cancel();
                            }
                        });


        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }
}