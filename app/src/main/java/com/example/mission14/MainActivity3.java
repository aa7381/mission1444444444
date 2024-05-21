package com.example.mission14;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    TextView tV, tV15 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tV = findViewById(R.id.tV);
        tV15 = findViewById(R.id.tV15);
        Intent intent = getIntent();
        int count = intent.getIntExtra("subjectCount", 0);



        Intent gi = getIntent();
        String name11 = gi.getStringExtra("subject");
        String shap = gi.getStringExtra("subject2");
        String his = gi.getStringExtra("subject3");
        String las = gi.getStringExtra("subject4");
        String hezz = gi.getStringExtra("subject5");
        String tan = gi.getStringExtra("subject6");
        String math1 = gi.getStringExtra("math1");
        String math2 = gi.getStringExtra("math2");
        String english1 = gi.getStringExtra("english1");
        String english2 = gi.getStringExtra("english2");


        int shapp = Integer.parseInt(shap);
        int hiss = Integer.parseInt(his);
        int lass = Integer.parseInt(las);
        int hez = Integer.parseInt(hezz);
        int tann = Integer.parseInt(tan);


        switch (count) {
            case 1:
                String result1 = intent.getStringExtra("result12");
                String grades1 = intent.getStringExtra("grades12");
                String name1 = intent.getStringExtra("name12");
                String finalGrade1 = intent.getStringExtra("final12");
                Double max = intent.getDoubleExtra("max",0);

                tV.setText("                                     name:" + name11+ "\n" +
                        shap + "                             2                             shaprot                     " + "\n" +
                        his + "                             2                             history                     " + "\n" +
                        las + "                             2                             lashon                     " + "\n" +
                        hez + "                             2                             hezrahot                     " + "\n" +
                        tan + "                             2                              tanah                     " + "\n" +
                        math2 + "                             " + math1 + "                             math                     " + "\n" +
                        english2 + "                             " + english1 + "                              english                     " + "\n" +
                        finalGrade1 + "                             " + grades1 + "                             " + name1 + "                     " + "\n");
                tV15.setText( ""+ result1+"                         the highest result is:" +max);
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

                Double max2 = intent.getDoubleExtra("max",0);

                tV.setText("                                     name:" + name11+ "\n" +
                        shap + "                             2                             shaprot                     " + "\n" +
                        his + "                             2                             history                     " + "\n" +
                        las + "                             2                             lashon                     " + "\n" +
                        hez + "                             2                             hezrahot                     " + "\n" +
                        tan + "                             2                              tanah                     " + "\n" +
                        math2 + "                             " + math1 + "                             math                     " + "\n" +
                        english2 + "                             " + english1 + "                              english                     " + "\n" +
                        finalGrade + "                             " + grade + "                             " + name + "                     " + "\n" +
                        finalGrade2 + "                             " + grade2 + "                             " + name2 + "                     " + "\n"
                        );

                tV15.setText( ""+ result+"                         the highest result is:" +max2 +"\n"+result2 +"\n"+result3  );


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

                Double max3 = intent.getDoubleExtra("max",0);

                tV.setText("                                     name:" + name11+ "\n" +
                        shap + "                             2                             shaprot                     " + "\n" +
                        his + "                             2                             history                     " + "\n" +
                        las + "                             2                             lashon                     " + "\n" +
                        hez + "                             2                             hezrahot                     " + "\n" +
                        tan + "                             2                              tanah                     " + "\n" +
                        math2 + "                             " + math1 + "                             math                     " + "\n" +
                        english2 + "                             " + english1 + "                              english                     " + "\n" +
                        grade3 + "                             " + finalGrade3+ "                             " + name3 + "                     " + "\n" +
                        finalGrade4 + "                             " + grade4 + "                             " + name4 + "                     " + "\n" +
                        finalGrade5 + "                             " + grade5 + "                             " + name6 + "                     ");

                tV15.setText( "the highest result is:" +max3+"\n"+ result4 +"          " +"\n"+result5 +"\n"+result6+"\n"+result7+"\n"+result8+"\n"+result9+"\n"+result10 );

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
