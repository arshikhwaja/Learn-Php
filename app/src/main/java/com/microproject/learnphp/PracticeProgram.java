package com.microproject.learnphp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView;

public class PracticeProgram extends AppCompatActivity {
    Intent intent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_program);
        final String[] mobiles = {"1. Hello World","2. Basic mathematical operations","3. Even Odd Number","4. Leap Year","5. Prime Number","6. Table of a Number","7. Reverse of a Number","8. Reverse of a string","9. Armstrong Number","10. Factorial of a Number","11. Palindrome of a Number","12. Palindrome of a String","13. Largest of three numbers","14. Fibonacci Series","15. Prime Series","16. Swapping two numbers","17. Left Pyramid","18. Right Pyramid","19. Middle Pyramid","20. Diamond Pyramid"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.practice_program, mobiles);
        ListView list1 = findViewById(R.id.list);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(PracticeProgram.this,Programs.class);
                String str = String.valueOf(position);
                intent.putExtra("id",str);
                startActivity(intent);
            }
        });
    }
}
