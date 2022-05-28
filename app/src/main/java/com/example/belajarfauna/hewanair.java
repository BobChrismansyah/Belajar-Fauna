package com.example.belajarfauna;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.os.Handler;
import android.telecom.Call;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Timer;
import java.util.TimerTask;

public class hewanair extends AppCompatActivity {
    ScrollView scrollView;
    TextView detailsText;
    LinearLayout layout;
    FloatingActionButton floatingActionButton;
    private Button suara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewanair);

        detailsText = findViewById(R.id.details);
        layout = findViewById(R.id.layout);
        layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);


//        scrollView = findViewById(R.id.scroll);
//        floatingActionButton = findViewById(R.id.buttonscroll);
//
//        floatingActionButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                scrollView.fullScroll(ScrollView.FOCUS_DOWN);
//                floatingActionButton.show();
//            }
//        });
//         suara findViewById(R.id.sound)



        }
        public void expand(View view){
        int v = (detailsText.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
            TransitionManager.beginDelayedTransition(layout, new AutoTransition());
            detailsText.setVisibility(v);
        }
    }
