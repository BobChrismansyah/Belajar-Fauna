package com.example.belajarfauna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class contenthewan_air extends AppCompatActivity {
    MediaPlayer lumba, buaya;

    FloatingActionButton allerthiu;

    ImageButton arrow, arrow2, arrow3, arrow4;
    LinearLayout hiddenView, hiddenView2, hiddenView3, hiddenView4;
    CardView cardView, cardView2, cardView3, cardView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenthewan_air);

        allerthiu = findViewById(R.id.suarabuaya);

        lumba=MediaPlayer.create(contenthewan_air.this,R.raw.suaradolphin);
//        buaya=MediaPlayer.create(contenthewan_air.this,R.raw.crocodiles);


        cardView = findViewById(R.id.base_cardview);
        cardView2 = findViewById(R.id.base_cardview2);
        //   cardView3 = findViewById(R.id.base_cardview3);

        arrow = findViewById(R.id.arrow_button);
        arrow2 = findViewById(R.id.arrow_button2);
        //   arrow3 = findViewById(R.id.arrow_button3);


        hiddenView = findViewById(R.id.hidden_view);
        hiddenView2 = findViewById(R.id.hidden_view2);
        //   hiddenView3 = findViewById(R.id.hidden_view3);


        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility(View.GONE);
                    arrow.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }
                else {

                    TransitionManager.beginDelayedTransition(cardView,
                            new AutoTransition());
                    hiddenView.setVisibility(View.VISIBLE);
                    arrow.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });

        arrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hiddenView2.getVisibility() == View.VISIBLE) {
                    TransitionManager.beginDelayedTransition(cardView2,
                            new AutoTransition());
                    hiddenView2.setVisibility(View.GONE);
                    arrow2.setImageResource(R.drawable.ic_baseline_expand_more_24);
                }
                else {

                    TransitionManager.beginDelayedTransition(cardView2,
                            new AutoTransition());
                    hiddenView2.setVisibility(View.VISIBLE);
                    arrow2.setImageResource(R.drawable.ic_baseline_expand_less_24);
                }
            }
        });

        allerthiu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(contenthewan_air.this, "Suara Hiu tidak ada", Toast.LENGTH_SHORT).show();
                    }
                });

    }
    public void playlumba_lumba(View v){lumba.start();}
//    public void playbuaya(View v){
//        buaya.start();
//    }

}