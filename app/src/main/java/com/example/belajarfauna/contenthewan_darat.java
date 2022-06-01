package com.example.belajarfauna;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class contenthewan_darat extends AppCompatActivity {
      MediaPlayer leopard, western, manuk;
//    TextView detailsText;
//    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenthewan_darat);

//        detailsText = findViewById(R.id.details);
//        layout = findViewById(R.id.layout2);
//        layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);



        //untuk suara
        leopard=MediaPlayer.create(contenthewan_darat.this,R.raw.leopard);
        western=MediaPlayer.create(contenthewan_darat.this,R.raw.western_meadowlark);
        manuk=MediaPlayer.create(contenthewan_darat.this,R.raw.chicken);
    }

//    public void expand(View view){
//        int v = (detailsText.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
//        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
//        detailsText.setVisibility(v);
//    }

 //memutar suara
    public void playIT(View v){
        leopard.start();
    }
    public void suarawestern(View v){
        western.start();
    }
    public void suaraayam(View v){
        manuk.start();
    }
}