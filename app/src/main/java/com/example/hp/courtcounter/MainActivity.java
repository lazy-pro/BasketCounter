package com.example.hp.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int aScore = 0, bScore = 0;

    public void a_3pt(View view) {
        aScore += 3;
        aDisplay();
    }

    public void a_2pt(View view) {
        aScore += 2;
        aDisplay();
    }

    public void a_1pt(View view) {
        aScore += 1;
        aDisplay();
    }

    public void b_3pt(View view) {
        bScore += 3;
        bDisplay();
    }

    public void b_2pt(View view) {
        bScore += 2;
        bDisplay();
    }

    public void b_1pt(View view) {
        bScore += 1;
        bDisplay();
    }

    public void reset(View view) {
        aScore = 0;
        bScore = 0;
        aDisplay();
        bDisplay();
    }

    public void aDisplay() {
        TextView t = (TextView) findViewById(R.id.a_text_view);
        t.setText(String.valueOf(aScore));
    }

    public void bDisplay() {
        TextView t = (TextView) findViewById(R.id.b_text_view);
        t.setText(String.valueOf(bScore));
    }
}
