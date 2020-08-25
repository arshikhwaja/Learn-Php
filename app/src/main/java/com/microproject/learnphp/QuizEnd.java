package com.microproject.learnphp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class QuizEnd extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent backonSkill = new Intent(QuizEnd.this,TestSkills.class);
        startActivity(backonSkill);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_end);

    }
}
