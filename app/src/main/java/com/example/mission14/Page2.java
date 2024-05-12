package com.example.mission14;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class Page2 extends AppCompatActivity {
    String name, shap, his, las, hezz, tan;
    EditText mathbag , mathgrade , englishbag , englishgrade ,eT12,eT13,eT14,eT15,eT16,eT17,eT18,eT19,eT20;
    int bonus = 0 , bonus2 = 0 ,grades = 10, finalgrade=0,finalgrade2 =0,subjectg=0,mathbonus = 0,englishbonus = 0 ,count  = 0,bonus3=0, bonusfirst = 0 ,bonussecond = 0,bonusthird = 0,mathbonus2 = 0,englishbonus2 = 0,num , num4 , num8, finalgradefir = 0 , finalgradesec = 0 , finalgradethi = 0 ,mathgg , englishgg;
    double sum = 0 , sum2 , sum3, sum4,sum5,sum6 , sum7 , sum8;
    Button btn7 , btn8 , btn9 ;
    String numm , num2 , num3 , num6 , num7,num9 , nummm,mathb , mathg , englishb , englishg,namesubject , namesubject2 , namesubject3;
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
    public static int math(String mathb , String mathg , EditText mathbag , EditText mathgrade , int mathgg ,int mathbonus)
    {
        mathg = mathbag.getText().toString();
        mathgg = Integer.parseInt(mathg);
        if (mathgg == 5) {
            mathbonus = +30;
            return mathbonus;
        } else if (mathgg == 4) {
            mathbonus = +15;
            return mathbonus;

        } else {
            mathbonus = 0 ;
            return mathbonus ;
        }
    }
    public static int english(String englishb , String englishg , EditText englishbag, EditText englishgrade , int englishgg ,int englishbonus)
    {
        englishg = englishbag.getText().toString();
        englishgg = Integer.parseInt(englishg);
        if (englishgg == 5) {
            englishbonus = +30;
            return englishbonus;
        } else if (englishgg == 4) {
            englishbonus = +15;
            return englishbonus;

        } else {
            englishbonus = 0 ;
            return englishbonus ;
        }
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
    public void nextbtn2(View view) {
        Intent si = new Intent(this, MainActivity3.class);
        si.putExtra("subject", name);
        si.putExtra("subject2", shap);
        si.putExtra("subject3", his);
        si.putExtra("subject4", las);
        si.putExtra("subject5", hezz);
        si.putExtra("subject6", tan);
        si.putExtra("subject7", count);
        si.putExtra("math1", String.valueOf(mathb));
        si.putExtra("math2", String.valueOf(mathg));
        si.putExtra("english1", String.valueOf(englishb));
        si.putExtra("english2", String.valueOf(englishg));
        si.putExtra("subjectCount", count);


        String mathh = mathbag.getText().toString();
        mathgg = Integer.parseInt(mathh);

        String englishh = mathbag.getText().toString();
        englishgg = Integer.parseInt(englishh);



        switch (count) {
            case (1):
                subjectg = 0;
                namesubject = eT12.getText().toString();
                grades = grades + mathgg + englishgg;

                mathbonus2 = math(mathb, mathg, mathbag, mathgrade, mathgg, mathbonus);
                englishbonus2 = english(englishb, englishg, englishbag, englishgrade, englishgg, englishbonus);


                if(TextUtils.isEmpty(eT13.getText().toString()) | eT13.equals("-") | eT13.equals("-.") | eT13.equals("+") | eT13.equals("+."))
                {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }else
            {
                numm = eT13.getText().toString();
            }

                    num = Integer.parseInt(numm);

                if(Integer.parseInt(String.valueOf(num)) >5  || Integer.parseInt(String.valueOf(num)) <4 || Integer.parseInt(String.valueOf(num)) ==1 )
                {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }else {

                    if (num == 5) {
                        subjectg =subjectg +5;
                        grades =grades +5;
                        bonusfirst = 20;
                    } else if (num == 4) {
                        subjectg =subjectg +4;
                        grades =grades +4;
                        bonusfirst = 10;
                    }
                    else{
                        subjectg =subjectg + 1;
                        grades =subjectg  +1;
                    }
                }

                nummm = eT14.getText().toString();
                finalgrade = Integer.parseInt(nummm);
                finalgradefir = Integer.parseInt(nummm);
                finalgrade =finalgrade +bonusfirst + mathbonus2 + englishbonus2;
                finalgrade = finalgrade * subjectg;
                double sum30 = finalgrade / grades;
                si.putExtra("result12", String.valueOf(sum30));
                si.putExtra("grades12", numm);
                si.putExtra("name12", namesubject);
                si.putExtra("final12", nummm);
                startActivity(si);
                break;

            case (2):
                grades = 10;
                subjectg = 0;
                grades = grades + mathgg + englishgg;

                mathbonus2 = math(mathb, mathg, mathbag, mathgrade, mathgg, mathbonus);
                englishbonus2 = english(englishb, englishg, englishbag, englishgrade, englishgg, englishbonus);
                if(TextUtils.isEmpty(eT13.getText().toString()) | eT13.equals("-") | eT13.equals("-.") | eT13.equals("+") | eT13.equals("+."))
                {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }else
                    numm = eT13.getText().toString();


                    num = Integer.parseInt(numm);



                if(Integer.parseInt(String.valueOf(num)) >5  || Integer.parseInt(String.valueOf(num)) <4 || Integer.parseInt(String.valueOf(num)) ==1 )
                {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }else {
                    if (num == 5) {
                        subjectg =subjectg +5;
                        grades =grades +5;
                        bonusfirst = 20;
                    } else if (num == 4) {
                        subjectg =subjectg +4;
                        grades =grades +4;
                        bonusfirst = 10;
                    }
                    else{
                        subjectg =subjectg + 1;
                        grades =subjectg  +1;
                    }
                }

                //שורה ראשונה
                num2 = eT14.getText().toString();
                finalgrade = Integer.parseInt(num2);
                finalgradefir = Integer.parseInt(num2);
                finalgrade = finalgrade +bonusfirst + mathbonus2 + englishbonus2;
                finalgrade = finalgrade * subjectg;
                sum2 = finalgrade / grades;
                namesubject = eT12.getText().toString();

                sum = 0;
                grades =grades -num;
                subjectg = 0;

                if(TextUtils.isEmpty(eT16.getText().toString()) | eT16.equals("-") | eT16.equals("-.") | eT16.equals("+") | eT16.equals("+."))
                {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }else
                num3 = eT16.getText().toString();

                    num4 = Integer.parseInt(num3);

                if(Integer.parseInt(String.valueOf(num4)) >5  || Integer.parseInt(String.valueOf(num4)) <4 || Integer.parseInt(String.valueOf(num4)) ==1 )
                {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }else {
                    if (num4 == 5) {
                        subjectg =subjectg +5;
                        grades = +5;
                        bonusfirst = 20;
                    } else if (num4 == 4) {
                        subjectg =subjectg +4;
                        grades =grades +4;
                        bonusfirst = 10;
                    }
                    else{
                        subjectg =subjectg + 1;
                        grades =subjectg  +1;
                    }
                }
                //שורה שניה
                num6 = eT17.getText().toString();
                finalgrade = Integer.parseInt(num6);
                finalgradesec = Integer.parseInt(num6);
                finalgrade =finalgrade +bonussecond + mathbonus2 + englishbonus2;
                finalgrade = finalgrade * subjectg;
                sum3 = finalgrade / grades;
                namesubject2 = eT15.getText().toString();

                grades =grades -num4;
                subjectg = 0;
                finalgrade = 0 ;

                // שורה ראשונה ושניה
                grades = grades + num4 + num;
                subjectg = subjectg + num4 + num;
                finalgrade = finalgradesec +  finalgradefir + bonusfirst + bonussecond + mathbonus2 + englishbonus2;
                finalgrade = finalgrade * subjectg;
                sum4 = finalgrade / grades;

                si.putExtra("grade", numm);
                si.putExtra("final", num2);
                si.putExtra("result", String.valueOf(sum2));
                si.putExtra("name", namesubject);

                si.putExtra("grade2", num3);
                si.putExtra("final2", num6);
                si.putExtra("result2", String.valueOf(sum3));
                si.putExtra("name2", namesubject2);

                si.putExtra("result3",String.valueOf( sum4));

                startActivity(si);
                break;


            case (3):
                finalgrade2 = 0;
                grades = 10;
                subjectg = 0;

                grades = grades + mathgg + englishgg;
                // בודק יחידות
                    mathbonus2 = math(mathb, mathg, mathbag, mathgrade, mathgg, mathbonus);
                    englishbonus2 = english(englishb, englishg, englishbag, englishgrade, englishgg, englishbonus);
                // בודק כמה יחידות יש לשורה הראשונה
                if(TextUtils.isEmpty(eT13.getText().toString()) | eT13.equals("-") | eT13.equals("-.") | eT13.equals("+") | eT13.equals("+."))
                {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }else
                numm = eT13.getText().toString();

                    num = Integer.parseInt(numm);

                if(Integer.parseInt(String.valueOf(num)) >5  || Integer.parseInt(String.valueOf(num)) <4 || Integer.parseInt(String.valueOf(num)) ==1 )
                {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }else {
                    if (num == 5) {
                        subjectg =subjectg +5;
                        grades = +5;
                        bonusfirst = 20;
                    } else if (num == 4) {
                        subjectg =subjectg +4;
                        grades =grades  +4;
                        bonusfirst = 10;
                    }
                    else{
                        subjectg =subjectg + 1;
                        grades =subjectg  +1;
                    }
                }
                // מחשב את הציון הממוצע של שורה ראשונה
                num2 = eT14.getText().toString();
                finalgrade = Integer.parseInt(num2);
                finalgradefir =Integer.parseInt(num2);
                finalgrade =finalgrade  +bonusfirst + mathbonus2 + englishbonus2;
                finalgrade = finalgrade * subjectg;
                sum2 = finalgrade / grades;
                namesubject = eT12.getText().toString();

                grades =grades -num;
                subjectg = 0;
                // בודק כמה יחידות יש לשורה השניה
                if(TextUtils.isEmpty(eT16.getText().toString()) | eT16.equals("-") | eT16.equals("-.") | eT16.equals("+") | eT16.equals("+."))
                {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }else
                        num3 = eT16.getText().toString();


                    num4 = Integer.parseInt(num3);


                if(Integer.parseInt(String.valueOf(num4)) >5  || Integer.parseInt(String.valueOf(num4)) <4 || Integer.parseInt(String.valueOf(num4)) ==1 )
                {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }else {
                    if (num4 == 5) {
                        subjectg =subjectg +5;
                        grades =grades +5;
                        bonusfirst = 20;
                    } else if (num4 == 4) {
                        subjectg = subjectg +4;
                        grades =grades +4;
                        bonusfirst = 10;
                    }
                    else{
                        subjectg =subjectg + 1;
                        grades =subjectg  +1;
                    }
                }
                // מחשב את הציון הממוצע של שורה שניה
                num6 = eT17.getText().toString();
                finalgrade = Integer.parseInt(num6);
                finalgradesec = Integer.parseInt(num6);
                finalgrade = finalgrade +bonussecond + mathbonus2 + englishbonus2 ;
                finalgrade = finalgrade * subjectg;
                sum3 = finalgrade / grades;
                namesubject2 = eT15.getText().toString();

                grades = grades - num4;
                subjectg = 0;
                // מחשב את הממוצע של עמוד ראשון ועמוד שני הציון
                grades = grades + num4 + num;
                subjectg = subjectg + num4 + num;
                finalgrade =finalgradefir + finalgradesec +bonusfirst + bonussecond + mathbonus2 + englishbonus2;
                finalgrade = finalgrade * subjectg;
                sum4 = finalgrade / grades;
                grades = grades - num4 - num;
                subjectg = 0;
                //מחשב את העמוד השלישי כמה יחידות יש
                if(TextUtils.isEmpty(eT19.getText().toString())| eT19.equals("-") | eT19.equals("-.") | eT19.equals("+") | eT19.equals("+."))
                {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }else
                    num7 = eT19.getText().toString();

                    num8 = Integer.parseInt(num7);

                if(Integer.parseInt(String.valueOf(num8)) >5  || Integer.parseInt(String.valueOf(num8)) <4 || Integer.parseInt(String.valueOf(num8)) ==1 )
                {
                    Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                }else {
                    if (num8 == 5) {
                        subjectg =subjectg +5;
                        grades = grades +5;
                        bonusfirst = 20;
                    } else if (num8 == 4) {
                        subjectg =subjectg +4;
                        grades = grades +4;
                        bonusfirst = 10;
                    }
                    else{
                        subjectg =subjectg + 1;
                        grades =subjectg  +1;
                    }
                }
                // מחשב את הממוצע של שורה שלוש
                num9 = eT20.getText().toString();
                finalgrade = Integer.parseInt(num9);
                finalgradethi =Integer.parseInt(num9);
                finalgrade = finalgrade + bonusthird + mathbonus2 + englishbonus2;
                finalgrade = finalgrade * subjectg;
                sum5 = finalgrade / grades;
                namesubject3 = eT18.getText().toString();

                grades = grades - num8 ;
                subjectg = 0;
                // מחשב את הממוצע של עמוד ראשון ועמוד השלישי הציון
                grades = grades + num8 + num;
                subjectg = subjectg + num8 + num;
                finalgrade = finalgradefir + finalgradethi + bonusfirst + bonusthird + mathbonus2 + englishbonus2;
                finalgrade= finalgrade * subjectg;
                sum6 = finalgrade / grades;

                grades = grades - num8 - num;
                subjectg = 0;
                // מחשב את הממוצע של עמוד שני  ועמוד השלישי הציון
                grades = grades + num8 + num4;
                subjectg = subjectg + num8 + num4;
                finalgrade =finalgradesec +bonusthird + bonussecond + mathbonus2 + englishbonus2;
                finalgrade = finalgrade * subjectg;
                sum7 = finalgrade / grades;

                grades = grades - num8 - num4;
                subjectg = 0;
                // מחשב את הממוצע של עמוד הראשון השני ועמוד השלישי הציון
                grades = grades + num8 + num + num4;
                subjectg = subjectg + num8 + num + num4;
                finalgrade = finalgradefir + finalgradesec + finalgradethi +bonusfirst + bonusthird + bonussecond + mathbonus2 + englishbonus2;
                finalgrade = finalgrade * subjectg;
                sum8 = finalgrade / grades;

                si.putExtra("grade", num2);
                si.putExtra("final", numm);
                si.putExtra("result", String.valueOf(sum2));
                si.putExtra("name", namesubject);

                si.putExtra("grade2", num3);
                si.putExtra("final2", num6);
                si.putExtra("result2", String.valueOf(sum3));
                si.putExtra("name2", namesubject2);

                si.putExtra("result3", String.valueOf(sum4));

                si.putExtra("grade3", num7);
                si.putExtra("final3",num9);
                si.putExtra("result4", String.valueOf(sum5));
                si.putExtra("name3", namesubject3);

                si.putExtra("result5", String.valueOf(sum6));

                si.putExtra("result6",String.valueOf( sum7));

                si.putExtra("result7",String.valueOf( sum8));



                startActivity(si);
                break;

                default:
                    eT12.setVisibility(view.INVISIBLE);
                    eT13.setVisibility(view.INVISIBLE);
                    eT14.setVisibility(view.INVISIBLE);
                    eT15.setVisibility(view.INVISIBLE);
                    eT16.setVisibility(view.INVISIBLE);
                    eT17.setVisibility(view.INVISIBLE);
                    eT18.setVisibility(view.INVISIBLE);
                    eT19.setVisibility(view.INVISIBLE);
                    eT20.setVisibility(view.INVISIBLE);
                    break;
        }

    }
}