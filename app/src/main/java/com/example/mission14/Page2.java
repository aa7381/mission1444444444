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
    int bonus = 0 , bonus2 = 0 ,grades = 10, finalgrade=0,finalgrade2 =0,subjectg=0,mathbonus = 0,englishbonus = 0 ,count  = 0,bonus3=0, bonusfirst = 0 ,bonussecond = 0,bonusthird = 0;
    double sum = 0 ;
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
        else if(Integer.parseInt(mathb) >5  || Integer.parseInt(mathb) <3 || Integer.parseInt(englishb) >5  || Integer.parseInt(englishb) <3 )
        {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            eT12.setVisibility(view.INVISIBLE);
            eT13.setVisibility(view.INVISIBLE);
            eT14.setVisibility(view.INVISIBLE);
            eT15.setVisibility(view.INVISIBLE);
            eT16.setVisibility(view.INVISIBLE);
            eT17.setVisibility(view.INVISIBLE);
            eT18.setVisibility(view.INVISIBLE);
            eT19.setVisibility(view.INVISIBLE);
            eT20.setVisibility(view.INVISIBLE);
        }
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
        else if(Integer.parseInt(mathb) >5  || Integer.parseInt(mathb) <3 || Integer.parseInt(englishb) >5  || Integer.parseInt(englishb) <3 )
        {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            eT12.setVisibility(view.INVISIBLE);
            eT13.setVisibility(view.INVISIBLE);
            eT14.setVisibility(view.INVISIBLE);
            eT15.setVisibility(view.INVISIBLE);
            eT16.setVisibility(view.INVISIBLE);
            eT17.setVisibility(view.INVISIBLE);
            eT18.setVisibility(view.INVISIBLE);
            eT19.setVisibility(view.INVISIBLE);
            eT20.setVisibility(view.INVISIBLE);
        }
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
        else if(Integer.parseInt(mathb) >5  || Integer.parseInt(mathb) <3 || Integer.parseInt(englishb) >5  || Integer.parseInt(englishb) <3 )
        {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            eT12.setVisibility(view.INVISIBLE);
            eT13.setVisibility(view.INVISIBLE);
            eT14.setVisibility(view.INVISIBLE);
            eT15.setVisibility(view.INVISIBLE);
            eT16.setVisibility(view.INVISIBLE);
            eT17.setVisibility(view.INVISIBLE);
            eT18.setVisibility(view.INVISIBLE);
            eT19.setVisibility(view.INVISIBLE);
            eT20.setVisibility(view.INVISIBLE);
        }
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
            String namesubject = eT12.getText().toString();
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

            }
            else if(num == 4)
            {
                subjectg =+4;
                bonus =+10;

            }
            else
            {
                subjectg =+num;

            }
            String nummm = eT14.getText().toString();
            finalgrade =Integer.parseInt(nummm);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonus ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            Intent sii = new Intent(this, MainActivity3.class);
            sii.putExtra("result", sum);
            sii. putExtra("grades", num);
            sii. putExtra("name", namesubject);
            sii. putExtra("final", finalgrade);

            startActivity(sii);
        }
        else if (count == 2)
        {
            grades = 10 ;
            subjectg = 0 ;
            Intent sii = new Intent(this, MainActivity3.class);
            int mathgg =Integer.parseInt(mathg);
            int englishgg =Integer.parseInt(englishg);
            grades = grades + mathgg + englishgg ;
            if(mathgg == 5)
            {
                mathbonus =+30;
                bonus =+ 30 ;
                bonus2 =+30;
            }
            else if (mathgg == 4)
            {
                mathbonus =+15;
                bonus =+ 15 ;
                bonus2 =+ 15;
            }
            if(englishgg == 5)
            {
                englishbonus =+30;
                bonus =+ 30 ;
                bonus2 =+ 30 ;
            }
            else if (englishgg == 4)
            {
                englishbonus =+15;
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
                bonus3 =+20;
                bonusfirst  = 20 ;

            }
            else if(num == 4)
            {
                subjectg =+4;
                bonus =+10;
                bonus2 =+10;
                grades =+ 4;
                bonus3 =+10;
                bonusfirst  = 10 ;

            }
            else
            {
                subjectg =+num;
                grades =+ num;

            }
            String num2 = eT14.getText().toString();
            finalgrade = Integer.parseInt(num2);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonusfirst ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            double sum2 = sum;
            String namesubject = eT12.getText().toString();
            sii.putExtra("result", sum2);
            sii. putExtra("name", namesubject);
            sii. putExtra("final", finalgrade);
            sii. putExtra("grades", num);





            sum = 0  ;
            grades =- num;
            subjectg = 0 ;
            bonus =- bonus3 ;
            bonus3 = 0 ;
            String num3 = eT16.getText().toString();
            int num4 =Integer.parseInt(num3);
            if(num4 == 5)
            {
                subjectg=+5;
                grades  =+ 5 ;
                bonus =+ 20 ;
                bonus2=+20;
                bonus3 =+20;
                bonussecond  = 20 ;

            }
            else if(num4 == 4)
            {
                subjectg =+4;
                bonus =+10;
                bonus2 =+10;
                grades =+ 4;
                bonus3 =+10;
                bonussecond  = 10;

            }
            else
            {
                subjectg =+num4;
                grades =+ num4;

            }

            String num6 = eT17.getText().toString();
            finalgrade =Integer.parseInt(num6);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonussecond ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            double sum3 = sum ;
            String namesubject2 = eT15.getText().toString();
            sii.putExtra("result2", sum3);
            sii. putExtra("grades2", num4);
            sii. putExtra("name3", namesubject2);
            sii. putExtra("final2", finalgrade);




            sum = 0 ;
            grades =- num4 ;
            subjectg = 0 ;
            bonus =- bonus3 ;
            bonus3 = 0 ;

            grades = grades +  num4 + num ;
            subjectg = subjectg + num4 + num ;
            finalgrade2 = finalgrade2 + bonusfirst + bonussecond ;
            finalgrade2 =finalgrade2 * subjectg ;
            double sum4 = finalgrade /grades;
            sii.putExtra("result3", sum4);
            startActivity(sii);
        }
        else if (count == 3)
        {
            finalgrade2 = 0 ;
            grades = 10 ;
            subjectg = 0 ;
            Intent sii = new Intent(this, MainActivity3.class);
            int mathgg =Integer.parseInt(mathg);
            int englishgg =Integer.parseInt(englishg);
            grades = grades + mathgg + englishgg ;
            // בודק יחידות
            if(mathgg == 5)
            {
                mathbonus =+30;
                bonus =+ 30 ;
                bonus2 =+30;
            }
            else if (mathgg == 4)
            {
                mathbonus =+15;
                bonus =+ 15 ;
                bonus2 =+ 15;
            }
            if(englishgg == 5)
            {
                englishbonus =+30;
                bonus =+ 30 ;
                bonus2 =+ 30 ;
            }
            else if (englishgg == 4)
            {
                englishbonus =+15;
                bonus =+ 15 ;
                bonus2 =+15;
            }
            // בודק כמה יחידות יש לשורה הראשונה
            String numm = eT13.getText().toString();
            int num =Integer.parseInt(numm);
            if(num == 5)
            {
                subjectg=+5;
                grades  =+ 5 ;
                bonus =+ 20 ;
                bonus2 =+20;
                bonusfirst  = 20 ;
                bonus3 =+20;
            }
            else if(num == 4)
            {
                subjectg =+4;
                bonus =+10;
                bonus2 =+10;
                grades =+ 4;
                bonusfirst  = 10;
                bonus3 =+10;

            }
            else
            {
                subjectg =+num;
                grades =+ num;

            }
            // מחשב את הציון הממוצע של שורה ראשונה
            String num2 = eT14.getText().toString();
            finalgrade =Integer.parseInt(num2);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonus ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            double sum2 = sum;
            sii.putExtra("result", sum2);
            sii. putExtra("grades", num);
            String namesubject = eT12.getText().toString();
            sii. putExtra("name3", namesubject);




            sum = 0  ;
            grades =- num;
            subjectg = 0 ;
            bonus =-bonus3 ;
            bonus3 = 0 ;
            // בודק כמה יחידות יש לשורה השניה

            String num3 = eT16.getText().toString();
            int num4 =Integer.parseInt(num3);
            if(num4 == 5)
            {
                subjectg=+5;
                grades  =+ 5 ;
                bonus =+ 20 ;
                bonussecond  = 20 ;
                bonus2=+20;
                bonus3=+20;
            }
            else if(num4 == 4)
            {
                subjectg =+4;
                bonus =+10;
                bonus2 =+10;
                bonussecond = 10 ;
                grades =+ 4;
                bonus3=+10;
            }
            else
            {
                subjectg =+num4;
                grades =+ num4;

            }
            // מחשב את הציון הממוצע של שורה שניה

            String num6 = eT17.getText().toString();
            finalgrade =Integer.parseInt(num6);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonussecond ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            double sum3 = sum ;
            String namesubject2 = eT15.getText().toString();
            sii.putExtra("result2", sum3);
            sii. putExtra("grades2", num4);
            sii. putExtra("name3", namesubject2);



            sum = 0 ;
            grades =grades - num4 ;
            subjectg = 0 ;
            bonus =- bonus3 ;
            bonus3 = 0 ;
            // מחשב את הממוצע של עמוד ראשון ועמוד שני הציון
            grades = grades +  num4 + num ;
            subjectg = subjectg + num4 + num ;
            finalgrade2 =+ bonusfirst + bonussecond ;
            finalgrade2 =finalgrade2 * subjectg ;
            double sum4 = finalgrade /grades;
            sii.putExtra("result3", sum4);

            sum = 0  ;
            grades =grades - num4 ;
            subjectg = 0 ;

            //מחשב את העמוד השלישי כמה יחידות יש
            String num7 = eT19.getText().toString();
            int num8 =Integer.parseInt(num7);
            if(num8 == 5)
            {
                subjectg=+5;
                grades  =+ 5 ;
                bonus =+ 20 ;
                bonus2=+20;
                bonusthird = 20 ;
                bonus3 =+20;
            }
            else if(num8 == 4)
            {
                subjectg =+4;
                bonus =+10;
                bonus2 =+10;
                grades =+ 4;
                bonusthird = 10 ;
                bonus3=+10;
            }
            else
            {
                subjectg =+num8;
                grades =+ num8;

            }
            // מחשב את הממוצע של שורה השלוש
            String num9 = eT20.getText().toString();
            finalgrade =Integer.parseInt(num9);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonusthird ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            double sum5 =sum;
            String namesubject3 = eT18.getText().toString();
            sii.putExtra("result4", sum5);
            sii. putExtra("grades3", num8);
            sii. putExtra("name3", namesubject3);

            sum = 0 ;
            grades =grades - num8 ;
            subjectg = 0 ;
            bonus =-bonus3 ;
            bonus3 = 0 ;
            // מחשב את הממוצע של עמוד ראשון ועמוד השלישי הציון
            grades = grades +  num8 + num ;
            subjectg = subjectg + num8 + num ;
            finalgrade2 =finalgrade2 + bonusfirst + bonusthird ;
            finalgrade2 =finalgrade2 * subjectg ;
            double sum6 = finalgrade /grades;
            sii.putExtra("result5", sum6);

            sum = 0 ;
            grades =grades - num8 - num ;
            subjectg = 0 ;
            bonus =-bonus3 ;
            bonus3 = 0 ;
            // מחשב את הממוצע של עמוד שני  ועמוד השלישי הציון
            grades = grades +  num8 + num4 ;
            subjectg = subjectg + num8  + num4 ;
            finalgrade2 =finalgrade2 +  bonusthird + bonussecond ;
            finalgrade2 =finalgrade2 * subjectg ;
            double sum7 = finalgrade /grades;
            sii.putExtra("result7", sum7);

            sum = 0 ;
            grades =grades - num8 - num4  ;
            subjectg = 0 ;
            bonus =-bonus3 ;
            bonus3 = 0 ;
            // מחשב את הממוצע של עמוד הראשון השני ועמוד השלישי הציון
            grades = grades +  num8 + num + num4 ;
            subjectg = subjectg + num8 + num + num4 ;
            finalgrade2 =finalgrade2 + bonusfirst + bonusthird + bonussecond ;
            finalgrade2 =finalgrade2 * subjectg ;
            double sum8 = finalgrade /grades;
            sii.putExtra("result8", sum8);
            startActivity(sii);

        }
        else {
            eT12.setVisibility(view.INVISIBLE);
            eT13.setVisibility(view.INVISIBLE);
            eT14.setVisibility(view.INVISIBLE);
            eT15.setVisibility(view.INVISIBLE);
            eT16.setVisibility(view.INVISIBLE);
            eT17.setVisibility(view.INVISIBLE);
            eT18.setVisibility(view.INVISIBLE);
            eT19.setVisibility(view.INVISIBLE);
            eT20.setVisibility(view.INVISIBLE);
        }
        Intent si = new Intent(this, MainActivity3.class);
        si.putExtra("subject", name);
        si.putExtra("subject2", shap);
        si.putExtra("subject3", his);
        si.putExtra("subject4", las);
        si.putExtra("subject5", hezz);
        si.putExtra("subject6", tan);
        si.putExtra("subject7", count);
        startActivity(si);

}
    }
