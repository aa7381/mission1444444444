package com.example.mission14;

import android.content.Intent;
import android.os.Bundle;

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
                String sum1 = intent.getStringExtra("result");
                String grade1 = intent.getStringExtra("grades");
                String name1 = intent.getStringExtra("name");
                String finalGrade1 = intent.getStringExtra("final");

                break;

            case 2:
                String sum2 = intent.getStringExtra("result13");
                String grade2 = intent.getStringExtra("grades13");
                String name2 = intent.getStringExtra("name13");
                String finalGrade2 = intent.getStringExtra("final13");

                String sum3 = intent.getStringExtra("result2");
                String grade3 = intent.getStringExtra("grades2");
                String name3 = intent.getStringExtra("name3");
                String finalGrade3 = intent.getStringExtra("final2");
                String finalGrade7 =  intent.getStringExtra("result3");
                break;

            case 3:

                String result8 = intent.getStringExtra("result8");
                String sum4 = intent.getStringExtra("result7");
                String grade4 = intent.getStringExtra("result4");
                String name4 = intent.getStringExtra("grades3");
                String sum5 = intent.getStringExtra("name4");
                String finalGrade4 = intent.getStringExtra("result6");
                String grade5 = intent.getStringExtra("result11");
                String name5 = intent.getStringExtra("grades9");
                String finalGrade5 = intent.getStringExtra("name9");
                String sum6 = intent.getStringExtra("result10");
                String grade6 = intent.getStringExtra("grades3");
                String name6 = intent.getStringExtra ("name8");


                break;

            default:

                break;
        }








    }
}
