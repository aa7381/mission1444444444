package com.example.mission14;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Page2 extends AppCompatActivity {
    String name, shap, his, las, hezz, tan;

    EditText mathbag , mathgrade , englishbag , englishgrade ,eT12,eT13,eT14,eT15,eT16,eT17,eT18,eT19,eT20;

    int bonus = 0 ;
    int bonus2 = 0;
    int grades = 10 ;
    int finalgrade=0,finalgrade2 =0;
    int subjectg=0 ;
    double sum = 0 ;

    int count  = 0 ;



    Button btn7 , btn8 , btn9 ;

    String mathb , mathg , englishb , englishg ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mathbag = findViewById(R.id.mathbag);
        mathgrade = findViewById(R.id.mathgrade);
        englishbag = findViewById(R.id.englishbag);
        englishgrade = findViewById(R.id.englishgrade);
        eT12 = findViewById(R.id.eT12);
        eT13 = findViewById(R.id.eT13);
        eT14 = findViewById(R.id.eT14);
        eT15 = findViewById(R.id.eT15);
        eT16 = findViewById(R.id.eT16);
        eT17 = findViewById(R.id.eT17);
        eT18 = findViewById(R.id.eT18);
        eT19 = findViewById(R.id.eT19);
        eT20 = findViewById(R.id.eT20);

        Intent gi = getIntent();
        name = gi.getStringExtra("result");
        shap = gi.getStringExtra("result2");
        his = gi.getStringExtra("result3");
        las = gi.getStringExtra("result4");
        hezz = gi.getStringExtra("result5");
        tan = gi.getStringExtra("result6");

        int shapp = Integer.parseInt(shap);
        int hiss = Integer.parseInt(his);
        int lass = Integer.parseInt(las);
        int hez = Integer.parseInt(hezz);
        int tann = Integer.parseInt(tan);

        eT12.setHint("enter subject");
        eT15.setHint("enter subject");
        eT18.setHint("enter subject");




    }


    public void clicked9(View view)
    {
         mathb = mathbag.getText().toString();
         mathg = mathgrade.getText().toString();
         englishb = englishbag.getText().toString();
         englishg = englishgrade.getText().toString();

        if (mathb.isEmpty() | mathb.equals("-") | mathb.equals("-.") | mathb.equals("+") | mathb.equals("+.") | mathg.isEmpty() | mathg.equals("-") | mathg.equals("-.") | mathg.equals("+") | mathg.equals("+.") | englishb.isEmpty() | englishb.equals("-") | englishb.equals("-.") | englishb.equals("+") | englishb.equals("+.") | englishg.isEmpty() | englishg.equals("-") | englishg.equals("-.") | englishg.equals("+") | englishg.equals("+.") )
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        else
        {

            eT12.setVisibility(view.VISIBLE);
            eT13.setVisibility(view.VISIBLE);
            eT14.setVisibility(view.VISIBLE);
            eT15.setVisibility(view.INVISIBLE);
            eT16.setVisibility(view.INVISIBLE);
            eT17.setVisibility(view.INVISIBLE);
            eT18.setVisibility(view.INVISIBLE);
            eT19.setVisibility(view.INVISIBLE);
            eT20.setVisibility(view.INVISIBLE);
            count = 1;
        }
    }

    public void clicked8(View view)
    {
        String mathb = mathbag.getText().toString();
        String mathg = mathgrade.getText().toString();
        String englishb = englishbag.getText().toString();
        String englishg = englishgrade.getText().toString();

        if (mathb.isEmpty() | mathb.equals("-") | mathb.equals("-.") | mathb.equals("+") | mathb.equals("+.") | mathg.isEmpty() | mathg.equals("-") | mathg.equals("-.") | mathg.equals("+") | mathg.equals("+.") | englishb.isEmpty() | englishb.equals("-") | englishb.equals("-.") | englishb.equals("+") | englishb.equals("+.") | englishg.isEmpty() | englishg.equals("-") | englishg.equals("-.") | englishg.equals("+") | englishg.equals("+.") )
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        else
        {
            eT12.setVisibility(view.VISIBLE);
            eT13.setVisibility(view.VISIBLE);
            eT14.setVisibility(view.VISIBLE);
            eT15.setVisibility(view.VISIBLE);
            eT16.setVisibility(view.VISIBLE);
            eT17.setVisibility(view.VISIBLE);
            eT18.setVisibility(view.INVISIBLE);
            eT19.setVisibility(view.INVISIBLE);
            eT20.setVisibility(view.INVISIBLE);
            count = 2 ;
        }
    }
    public void clicked7(View view)
    {
        String mathb = mathbag.getText().toString();
        String mathg = mathgrade.getText().toString();
        String englishb = englishbag.getText().toString();
        String englishg = englishgrade.getText().toString();

        if (mathb.isEmpty() | mathb.equals("-") | mathb.equals("-.") | mathb.equals("+") | mathb.equals("+.") | mathg.isEmpty() | mathg.equals("-") | mathg.equals("-.") | mathg.equals("+") | mathg.equals("+.") | englishb.isEmpty() | englishb.equals("-") | englishb.equals("-.") | englishb.equals("+") | englishb.equals("+.") | englishg.isEmpty() | englishg.equals("-") | englishg.equals("-.") | englishg.equals("+") | englishg.equals("+.") )
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        else
        {
            eT12.setVisibility(view.VISIBLE);
            eT13.setVisibility(view.VISIBLE);
            eT14.setVisibility(view.VISIBLE);
            eT15.setVisibility(view.VISIBLE);
            eT16.setVisibility(view.VISIBLE);
            eT17.setVisibility(view.VISIBLE);
            eT18.setVisibility(view.VISIBLE);
            eT19.setVisibility(view.VISIBLE);
            eT20.setVisibility(view.VISIBLE);
            count = 3 ;
        }
    }

    public void prev(View view)
    {
        finish();
    }

    public void nextbtn2(View view)
    {
        if(count == 1 )
        {
            int mathgg =Integer.parseInt(mathg);
            int englishgg =Integer.parseInt(englishg);

            grades = grades + mathgg + englishgg ;

            if(mathgg == 5)
            {
                bonus =+ 30 ;
            }
            else if (mathgg == 4)
            {
                bonus =+ 15 ;
            }
            if(englishgg == 5)
            {
                bonus =+ 30 ;
            }
            else if (englishgg == 4)
            {
                bonus =+ 15 ;
            }
            String numm = eT13.getText().toString();
            int num =Integer.parseInt(numm);
            if(num == 5)
            {
                subjectg=+5;
                grades  =+ 5 ;
                bonus =+ 20 ;
            }
            else
            {
                subjectg =+4;
                bonus =+10;
            }
            String nummm = eT14.getText().toString();
            finalgrade =Integer.parseInt(nummm);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonus ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;

            Intent sii = new Intent(this, MainActivity3.class);
            sii.putExtra("result", sum);
            startActivity(sii);
        }

        else if (count == 2)
        {
            Intent sii = new Intent(this, MainActivity3.class);
            int mathgg =Integer.parseInt(mathg);
            int englishgg =Integer.parseInt(englishg);
            grades = grades + mathgg + englishgg ;
            if(mathgg == 5)
            {
                grades=+5;
                bonus =+ 30 ;
                bonus2 =+30;
            }
            else if (mathgg == 4)
            {
                grades =+4;
                bonus =+ 15 ;
                bonus2 =+ 15;
            }
            if(englishgg == 5)
            {
                bonus =+ 30 ;
                grades = + 5 ;
                bonus2 =+ 30 ;
            }
            else if (englishgg == 4)
            {
                grades =+ 4 ;
                bonus =+ 15 ;
                bonus2 =+15;
            }
            String numm = eT13.getText().toString();
            int num =Integer.parseInt(numm);
            if(num == 5)
            {
                subjectg=+5;
                grades  =+ 5 ;
                bonus =+ 20 ;
                bonus2 =+20;
            }
            else
            {
                subjectg =+4;
                bonus =+10;
                bonus2 =+10;
            }
            String num2 = eT14.getText().toString();
            finalgrade =Integer.parseInt(num2);
            finalgrade =+ bonus ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            double sum2 = sum;
            sii.putExtra("result", sum2);


            sum = 0  ;
            grades =- num;
            subjectg = 0 ;
            bonus = 0 ;
            String num3 = eT16.getText().toString();
            int num4 =Integer.parseInt(num3);
            if(num4 == 5)
            {
                subjectg=+5;
                grades  =+ 5 ;
                bonus =+ 20 ;
                bonus2=+20;
            }
            else
            {
                subjectg =+4;
                bonus =+10;
                bonus2 =+10;
            }

            String num6 = eT17.getText().toString();
            finalgrade =Integer.parseInt(num6);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonus ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            double sum3 = sum ;
            sii.putExtra("result2", sum3);

            sum = 0 ;
            grades =- num4 ;
            subjectg = 0 ;
            bonus = 0 ;

            grades = grades +  num4 + num ;
            subjectg = subjectg + num4 + num ;
            finalgrade2 =+ bonus ;
            finalgrade2 =finalgrade2 * subjectg ;
            double sum4 = finalgrade /grades;
            sii.putExtra("result3", sum4);
            startActivity(sii);


        }
        else if (count == 3)
        {
            Intent sii = new Intent(this, MainActivity3.class);
            int mathgg =Integer.parseInt(mathg);
            int englishgg =Integer.parseInt(englishg);
            grades = grades + mathgg + englishgg ;
            if(mathgg == 5)
            {
                grades=+5;
                bonus =+ 30 ;
                bonus2 =+30;
            }
            else if (mathgg == 4)
            {
                grades =+4;
                bonus =+ 15 ;
                bonus2 =+ 15;
            }
            if(englishgg == 5)
            {
                bonus =+ 30 ;
                grades = + 5 ;
                bonus2 =+ 30 ;
            }
            else if (englishgg == 4)
            {
                grades =+ 4 ;
                bonus =+ 15 ;
                bonus2 =+15;
            }
            String numm = eT13.getText().toString();
            int num =Integer.parseInt(numm);
            if(num == 5)
            {
                subjectg=+5;
                grades  =+ 5 ;
                bonus =+ 20 ;
                bonus2 =+20;
            }
            else
            {
                subjectg =+4;
                bonus =+10;
                bonus2 =+10;
            }
            String num2 = eT14.getText().toString();
            finalgrade =Integer.parseInt(num2);
            finalgrade =+ bonus ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            double sum2 = sum;
            sii.putExtra("result", sum2);


            sum = 0  ;
            grades =- num;
            subjectg = 0 ;
            bonus = 0 ;
            String num3 = eT16.getText().toString();
            int num4 =Integer.parseInt(num3);
            if(num4 == 5)
            {
                subjectg=+5;
                grades  =+ 5 ;
                bonus =+ 20 ;
                bonus2=+20;
            }
            else
            {
                subjectg =+4;
                bonus =+10;
                bonus2 =+10;
            }

            String num6 = eT17.getText().toString();
            finalgrade =Integer.parseInt(num6);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonus ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            double sum3 = sum ;
            sii.putExtra("result2", sum3);

            sum = 0 ;
            grades =- num4 ;
            subjectg = 0 ;
            bonus = 0 ;

            grades = grades +  num4 + num ;
            subjectg = subjectg + num4 + num ;
            finalgrade2 =+ bonus ;
            finalgrade2 =finalgrade2 * subjectg ;
            double sum4 = finalgrade /grades;
            sii.putExtra("result3", sum4);

            sum = 0  ;
            grades =- num;
            subjectg = 0 ;
            bonus = 0 ;
            String num7 = eT19.getText().toString();
            int num8 =Integer.parseInt(num7);
            if(num8 == 5)
            {
                subjectg=+5;
                grades  =+ 5 ;
                bonus =+ 20 ;
                bonus2=+20;
            }
            else
            {
                subjectg =+4;
                bonus =+10;
                bonus2 =+10;
            }

            String num9 = eT20.getText().toString();
            finalgrade =Integer.parseInt(num9);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonus ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            double sum5 =sum;
            sii.putExtra("result4", sum5);


        }



}
    }
