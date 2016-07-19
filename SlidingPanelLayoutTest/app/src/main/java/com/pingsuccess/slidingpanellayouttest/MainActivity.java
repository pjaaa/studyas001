package com.pingsuccess.slidingpanellayouttest;

import android.graphics.Color;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SlidingPaneLayout layout = (SlidingPaneLayout)
                findViewById(R.id.sliding_pane_layout);
        layout.setSliderFadeColor(Color.TRANSPARENT);
    }
}
