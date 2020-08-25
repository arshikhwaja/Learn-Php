package com.microproject.learnphp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Interview extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview);

        final String[] questions = {"1. What is PHP?","2. What are common usage of PHP?","3. In how many ways you can embed PHP code in an HTML page?",
                "4. What is the purpose of .ini file?","5. What is escaping to PHP?","6. Is PHP a case sensitive language?","7. What are characteristics of PHP variable?","8. What are different types of PHP variables? ","9. What are the rules for determine the truth of any value not already of the Boolean type?","10. What is NULL?","11. How will you define a constant in PHP?","12. What is the purpose of constant() function?","13.What is the difference between PHP constants and variables? ","14. What are PHP magic constants?","15. What are the purpose of _LINE_ constant?","16. What are the purpose of _FILE_ constant?","17. What are the purpose of _FUNCTION_ constant? ","18. What are the purpose of _CLASS_ constant?","19. What are the purpose of _METHOD_ constant? ","20. What is the purpose of break statement?",
                "21. What is the purpose of continue statement?","22. Explain the syntax for foreach loop?","23. What is numeric array?","24. What is associative array?","25. What is multidimensional array?","26. How will you concatenate two strings in PHP?","27. How will you find the length of the string?"
                ,"28. How will you locate a string within a string?"," 29. How will you read a file in PHP?","30.How will you get the size of file in PHP?"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.one_question, questions);
        ListView list1 = findViewById(R.id.listView);
        list1.setAdapter(adapter);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent = new Intent(Interview.this,Questions.class);
                String str = String.valueOf(position);
                intent.putExtra("item_id",str);
                startActivity(intent);
            }
        });
    }
}
