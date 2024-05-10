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
    double sum = 0 , sum2 , sum3, sum4,sum5,sum6 , sum7 , sum8;
    Button btn7 , btn8 , btn9 ;
    String numm , num2 , num3 , num6 , num7,num9 , nummm;
    int num , num4 , num8  ;
    String mathb , mathg , englishb , englishg ;

    String namesubject , namesubject2 , namesubject3;

    int finalgradefir = 0 , finalgradesec = 0 , finalgradethi = 0 ;
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
        Intent si = new Intent(this, MainActivity3.class);
        si.putExtra("subject", name);
        si.putExtra("subject2", shap);
        si.putExtra("subject3", his);
        si.putExtra("subject4", las);
        si.putExtra("subject5", hezz);
        si.putExtra("subject6", tan);
        si.putExtra("subject7", count);
        if(count == 1 )
        {
            namesubject = eT12.getText().toString();
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
            numm = eT13.getText().toString();
            num =Integer.parseInt(numm);
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
            nummm = eT14.getText().toString();
            finalgrade =Integer.parseInt(nummm);
            finalgradefir =Integer.parseInt(nummm);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonus ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            si.putExtra("result", sum);
            si. putExtra("grades", num);
            si. putExtra("name", namesubject);
            si. putExtra("final", finalgradefir);


        }
        else if (count == 2)
        {
            grades = 10 ;
            subjectg = 0 ;
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
            numm = eT13.getText().toString();
            num =Integer.parseInt(numm);
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
            num2 = eT14.getText().toString();
            finalgrade = Integer.parseInt(num2);
            finalgradefir =Integer.parseInt(num2);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonusfirst ;
            finalgrade =finalgrade * subjectg ;
            sum2 = finalgrade /grades;
            namesubject = eT12.getText().toString();

            sum = 0  ;
            grades =- num;
            subjectg = 0 ;
            bonus =- bonus3 ;
            bonus3 = 0 ;
            num3 = eT16.getText().toString();
            num4 =Integer.parseInt(num3);
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

            num6 = eT17.getText().toString();
            finalgrade =Integer.parseInt(num6);
            finalgradesec = Integer.parseInt(num6);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonussecond ;
            finalgrade =finalgrade * subjectg ;
            sum3 = finalgrade /grades;
            namesubject2 = eT15.getText().toString();





            sum = 0 ;
            grades =- num4 ;
            subjectg = 0 ;
            bonus =- bonus3 ;
            bonus3 = 0 ;

            grades = grades +  num4 + num ;
            subjectg = subjectg + num4 + num ;
            finalgrade2 = finalgrade2 + bonusfirst + bonussecond ;
            finalgrade2 =finalgrade2 * subjectg ;
            sum4 = finalgrade /grades;
            si.putExtra("result13", sum2);
            si. putExtra("name13", namesubject);
            si. putExtra("final13", num6);
            si. putExtra("grades13", num);
            si.putExtra("result2", sum3);
            si. putExtra("grades2", num4);
            si. putExtra("name3", namesubject2);
            si. putExtra("final2", num2);
            si.putExtra("result3", sum4);
            si.putExtra("subjectCount", count);




        }
        else if (count == 3)
        {
            finalgrade2 = 0 ;
            grades = 10 ;
            subjectg = 0 ;

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
            numm = eT13.getText().toString();
            num =Integer.parseInt(numm);
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
            num2 = eT14.getText().toString();
            finalgrade =Integer.parseInt(num2);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonus ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            sum2 = sum;
            namesubject = eT12.getText().toString();





            sum = 0  ;
            grades =- num;
            subjectg = 0 ;
            bonus =-bonus3 ;
            bonus3 = 0 ;
            // בודק כמה יחידות יש לשורה השניה

            num3 = eT16.getText().toString();
            num4 =Integer.parseInt(num3);
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

            num6 = eT17.getText().toString();
            finalgrade =Integer.parseInt(num6);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonussecond ;
            finalgrade =finalgrade * subjectg ;
            sum = finalgrade /grades;
            sum3 = sum ;
            namesubject2 = eT15.getText().toString();




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
            sum4 = finalgrade /grades;


            sum = 0  ;
            grades =grades - num4 ;
            subjectg = 0 ;

            //מחשב את העמוד השלישי כמה יחידות יש
            num7 = eT19.getText().toString();
            num8 =Integer.parseInt(num7);
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
            // מחשב את הממוצע של שורה שלוש
            num9 = eT20.getText().toString();
            finalgrade =Integer.parseInt(num9);
            finalgrade2 =+ finalgrade;
            finalgrade =+ bonusthird ;
            finalgrade =finalgrade * subjectg ;
            sum5 = finalgrade /grades;

            namesubject3 = eT18.getText().toString();


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
            sum6 = finalgrade /grades;

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
            sum7 = finalgrade /grades;

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
            sum8 = finalgrade /grades;


            si.putExtra("result8", sum8);
            si.putExtra("result7", sum7);
            si.putExtra("result4", sum5);
            si. putExtra("grades3", num8);
            si. putExtra("name4", namesubject3);
            si.putExtra("result6", sum4);
            si.putExtra("result11", sum3);
            si. putExtra("grades9", num4);
            si. putExtra("name9", namesubject2);
            si.putExtra("result10", sum2);
            si. putExtra("grades3", num);
            si. putExtra("name8", namesubject);
            si.putExtra("subjectCount", count);

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
        startActivity( si);


    }
    }
