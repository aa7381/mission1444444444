package com.example.mission14;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        int count = intent.getIntExtra("subjectCount", 0);

        switch (count) {
            case 1:
                String result1 = intent.getStringExtra("result");
                String grades1 = intent.getStringExtra("grades");
                String name1 = intent.getStringExtra("name");
                String finalGrade1 = intent.getStringExtra("final");

                break;

            case 2:
                String grade = intent.getStringExtra("grade");
                String finalGrade = intent.getStringExtra("final");
                String result = intent.getStringExtra("result");
                String name = intent.getStringExtra("name");

                String  grade2 = intent.getStringExtra("grade2");
                String finalGrade2 = intent.getStringExtra("final2");
                String result2 = intent.getStringExtra("result2");
                String name2 = intent.getStringExtra("name2");

                String result3 =  intent.getStringExtra("result3");
                break;

            case 3:

                String grade3 = intent.getStringExtra("grade");
                String finalGrade3 = intent.getStringExtra("final");
                String result4 = intent.getStringExtra("result");
                String name3 = intent.getStringExtra("name");

                String grade4= intent.getStringExtra("grade2");
                String finalGrade4 = intent.getStringExtra("final2");
                String result5 = intent.getStringExtra("result2");
                String name4 = intent.getStringExtra("name2");

                String result6 = intent.getStringExtra("result3");

                String grade5 = intent.getStringExtra("grade3");
                String finalGrade5 = intent.getStringExtra("final3");
                String result7= intent.getStringExtra ("result4");
                String name6 = intent.getStringExtra ("name3");

                String result8 = intent.getStringExtra ("result5");

                String result9 = intent.getStringExtra ("result6");

                String result10 = intent.getStringExtra ("result7");

                break;

            default:

                break;
        }


    }
    public void prev3(View view)
    {
        finish();
    }
}
