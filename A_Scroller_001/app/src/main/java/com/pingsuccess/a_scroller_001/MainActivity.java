package com.pingsuccess.a_scroller_001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layout;

    private Button scrollToBtn;

    private Button scrollByBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater.from(this);
//        layout = (LinearLayout) findViewById(R.id.layout);
//        scrollToBtn = (Button) findViewById(R.id.scroll_to_btn);
//        scrollByBtn = (Button) findViewById(R.id.scroll_by_btn);
//        scrollToBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // both nagatives for right-down direction.
//                layout.scrollTo(-60, -100);
//            }
//        });
//        scrollByBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                layout.scrollBy(-60, -100);
//            }
//        });
    }
}
