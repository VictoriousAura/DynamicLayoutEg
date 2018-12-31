package com.xyz.shrreya.dynamiclayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linearLayout);
        //Adding 2 TextViews
        for (int i = 1; i <= 2; i++) {
            TextView textView = new TextView(this);
            textView.setText("TextView " + String.valueOf(i));
            linearLayout.addView(textView);
        }
    }

}

