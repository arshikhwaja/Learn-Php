package com.microproject.learnphp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton ib1 = (ImageButton)findViewById(R.id.basictutorial);
        ImageButton ib2 = (ImageButton)findViewById(R.id.advancetutorial);
        ImageButton ib3 = (ImageButton)findViewById(R.id.practiceprogram);
        ImageButton ib4 = (ImageButton)findViewById(R.id.codingarea);
        ImageButton ib5 = (ImageButton)findViewById(R.id.interviewQA);
        ImageButton ib6 = (ImageButton)findViewById(R.id.quiz);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),BasicTutorial.class);
                startActivity(in);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),advance_tutorial.class);
                startActivity(in);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),PracticeProgram.class);
                startActivity(in);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.writephponline.com/"));
                startActivity(in);
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),Interview.class);
                startActivity(in);
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(in);
            }
        });


    }
}
