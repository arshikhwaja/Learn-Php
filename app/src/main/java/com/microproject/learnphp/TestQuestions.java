package com.microproject.learnphp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class TestQuestions extends AppCompatActivity {
    private RadioGroup rg;
    private RadioButton fst,snd,trd,fth;
    private Button buttonConfirm;
    private int QuestionNo=0;
    private TextView question,txtScore,txtComplteQuestions,time;
    private int score = 0;
    private static final long START_TIME = 30000;

    private CountDownTimer countDownTimer;
    private boolean isTimerRunning=true;
    private long timeLeft = START_TIME;


    private String[] questions= {"What is the PHP stands for?",
            "Who is the father of PHP?",
            "PHP file have default extension of?",
            "PHP is an example of ________ scripting language?",
            "A PHP script should starts with ____ and end with___.",
            "Which of the following is not true?",
            "Which of the following variable is predefined variable?",
            "Which of the following method sends input to a script via a URL?",
            "Which of the following returns a text in title case from a variable?",
            "Which of the following type of variables are floating-point numbers, like 3.14159 or 49.1?"
    };
    private String answers[][] = {
            {"Personal Home Page","Pretext Hypertext Processor","Preprocessor Home Page","PHP Hyper Markup Processor","Personal Home Page"},
            {"Drek Kolkevi","Willam Makepiece","List Bareli","Resmus Lerdorf","Resmus Lerdorf"},
            {".html",".xml",".php",".ph",".php"},
            {"Server-side","Client-side","Browser-side","In-side","Server-side"},
            {"<php>...</php>","<?...?>","<?php...?>","?php...?php","<?php...?>"},
            {"PHP can be used to develop web application","PHP can not be embedded into html","PHP makes a website dynamic","PHP application can not be compile","PHP can not be embedded into html"},
            {"$get","$ask","$request","$post","$ask"},
            {"Get","Both","Post","None","Get"},
            {"toupper($var)","upper($var)","ucword($var)","ucwords($var)","toupper($var)"},
            {"Integer","Double","Boolean","String","Double"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_questions);
        rg = findViewById(R.id.radiogroug);
        fst = findViewById(R.id.radioFirst);
        snd = findViewById(R.id.radioSecond);
        trd = findViewById(R.id.radioThird);
        fth = findViewById(R.id.radioFour);
        question = findViewById(R.id.question);
        buttonConfirm = findViewById(R.id.btnConfirm);
        txtScore = findViewById(R.id.score);
        txtComplteQuestions = findViewById(R.id.completeQuestion);
        time = findViewById(R.id.timeLeft);
        buttonConfirm.setText("CONFIRM");
        txtComplteQuestions.setText("Questions : 1/10");
        question.setText(questions[0]);
        fst.setText(answers[0][0]);
        snd.setText(answers[0][1]);
        trd.setText(answers[0][2]);
        fth.setText(answers[0][3]);

        // Timer start from beginning
        startTimer();
        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QuestionNo==10){
                    Intent finish1 = new Intent(TestQuestions.this,QuizEnd.class);
                    startActivity(finish1);
                }
                else if (buttonConfirm.getText().toString().equals("CONFIRM")) {
                    int id = rg.getCheckedRadioButtonId();
                    int s = CheckSelectedId(id);
                    updateWindow(s);
                }
                else {
                    resetTimer();
                    changeQuestion(QuestionNo);
                    startTimer();
                }
            }
        });
    }
    public int CheckSelectedId(int id) {
        if (R.id.radioFirst == id ) return 0;
        if (R.id.radioSecond == id ) return 1;
        if (R.id.radioThird == id ) return 2;
        if (R.id.radioFour == id ) return 3;
        return -1;
    }

    public void updateWindow(int id) {
        if (fst.isChecked() || snd.isChecked() || trd.isChecked() || fth.isChecked()) {
            if (answers[QuestionNo][id] == answers[QuestionNo][4]) {
                pauseTimer();
                Toast.makeText(getApplicationContext(), "Corect", Toast.LENGTH_SHORT).show();
                makeDisabled();
                QuestionNo+=1;
                score+=1;
                if (score!=10) {
                    String str = "Score : 0" + score;
                    txtScore.setText(str);
                }
                else {
                    String str = "Score : "+score;
                    txtScore.setText(str);
                }

                buttonConfirm.setText("NEXT");
            } else {
                pauseTimer();
                Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                makeDisabled();
                QuestionNo+=1;
                buttonConfirm.setText("NEXT");

            }
        } else {
            Toast.makeText(getApplicationContext(), "Please Select Option First", Toast.LENGTH_SHORT).show();
        }
    }

    public void makeDisabled() {
        if (answers[QuestionNo][0] == answers[QuestionNo][4]){
            fst.setTextColor(Color.GREEN);
            snd.setTextColor(Color.RED);
            trd.setTextColor(Color.RED);
            fth.setTextColor(Color.RED);
            snd.setEnabled(false);
            trd.setEnabled(false);
            fth.setEnabled(false);
            fst.setEnabled(false);
        }
        else if (answers[QuestionNo][1] == answers[QuestionNo][4]){
            fst.setTextColor(Color.RED);
            snd.setTextColor(Color.GREEN);
            trd.setTextColor(Color.RED);
            fth.setTextColor(Color.RED);
            fst.setEnabled(false);
            trd.setEnabled(false);
            fth.setEnabled(false);
            snd.setEnabled(false);
        }
        else if (answers[QuestionNo][2] == answers[QuestionNo][4]){
            fst.setTextColor(Color.RED);
            snd.setTextColor(Color.RED);
            trd.setTextColor(Color.GREEN);
            fth.setTextColor(Color.RED);
            snd.setEnabled(false);
            fst.setEnabled(false);
            fth.setEnabled(false);
            trd.setEnabled(false);
        }
        else {
            fst.setTextColor(Color.RED);
            snd.setTextColor(Color.RED);
            trd.setTextColor(Color.RED);
            fth.setTextColor(Color.GREEN);
            snd.setEnabled(false);
            trd.setEnabled(false);
            fth.setEnabled(false);
            fst.setEnabled(false);
        }
    }
    public void changeQuestion(int no) {
        fst.setChecked(false);
        snd.setChecked(false);
        trd.setChecked(false);
        fth.setChecked(false);

        snd.setEnabled(true);
        trd.setEnabled(true);
        fst.setEnabled(true);
        fth.setEnabled(true);

        fst.setTextColor(Color.WHITE);
        snd.setTextColor(Color.WHITE);
        trd.setTextColor(Color.WHITE);
        fth.setTextColor(Color.WHITE);

        question.setText(questions[no]);
        fst.setText(answers[no][0]);
        snd.setText(answers[no][1]);
        trd.setText(answers[no][2]);
        fth.setText(answers[no][3]);
        buttonConfirm.setText("CONFIRM");
        txtComplteQuestions.setText("Questions : "+(QuestionNo+1)+"/10");
    }

    public void startTimer() {
        countDownTimer = new CountDownTimer(timeLeft,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeft = millisUntilFinished;
                updateTiming();
            }

            @Override
            public void onFinish() {
                isTimerRunning = false;
                makeDisabled();
                QuestionNo+=1;
                buttonConfirm.setText("NEXT");
            }
        } .start();
        isTimerRunning = true;
    }

    public void pauseTimer() {
        countDownTimer.cancel();
        isTimerRunning=false;
        buttonConfirm.setText("NEXT");
    }

    public void resetTimer() {
        timeLeft = START_TIME;
        isTimerRunning = false;
        updateTiming();
    }

    public void updateTiming() {
        int seconds = (int) (timeLeft/1000);
        String timePrint = String.format(Locale.getDefault(),"00:%02d",seconds);
        time.setText(timePrint);
    }
}
