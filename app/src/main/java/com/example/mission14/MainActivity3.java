package com.example.mission14;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);


        Intent giii = getIntent();
        String name = giii.getStringExtra("subject");
        String shap = giii.getStringExtra("subject2");
        String his = giii.getStringExtra("subject3");
        String las = giii.getStringExtra("subject4");
        String hezz = giii.getStringExtra("subject5");
        String tan = giii.getStringExtra("subject6");
        String countt = giii.getStringExtra("subject7");

        int shapp = Integer.parseInt(shap);
        int hiss = Integer.parseInt(his);
        int lass = Integer.parseInt(las);
        int hez = Integer.parseInt(hezz);
        int tann = Integer.parseInt(tan);
        int count = Integer.parseInt(countt);

        if(count == 1 )
        {

            String sum = giii.getStringExtra("result");
            String grade = giii.getStringExtra("grades");
            String name2 = giii.getStringExtra("name");
            String finalgrade = giii.getStringExtra("final");

        }
        else if(count == 2)
        {
            String finalgrade = giii.getStringExtra("final");
            String sum = giii.getStringExtra("result");
            String name2 = giii.getStringExtra("name");
            String grade = giii.getStringExtra("grades");

            String sum4 = giii.getStringExtra("result2");
            String grade2 = giii.getStringExtra("grades2");
            String name3= giii.getStringExtra("name3");
            String finalgrade2 = giii.getStringExtra("final2");

            String sum5 = giii.getStringExtra("result3");





        }
    }

}