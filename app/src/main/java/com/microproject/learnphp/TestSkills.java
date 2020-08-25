package com.microproject.learnphp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class TestSkills extends AppCompatActivity {

    ListView list;
    Intent intent;

    String[] maintitle ={
            "Basic Questions on PHP","PHP Data Types",
            "PHP Operator","PHP Functions",
            "PHP Database",
    };

    String[] subtitle ={
            "Simple Questions","store data of different types",
            "For performing different operations","real power of PHP comes from its functions",
            "A database consists of one or more tables",
    };

    Integer[] imgid={
            R.drawable.php,R.drawable.datatypes,
            R.drawable.operator,R.drawable.func,
            R.drawable.database,
    };

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent back=new Intent(TestSkills.this,MainActivity.class);
        startActivity(back);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_skills);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list= findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0) {
                    //code specific to first list item
                    //Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                    intent = new Intent(TestSkills.this,TestQuestions.class);
                    startActivity(intent);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }

            }
        });




    }
}
