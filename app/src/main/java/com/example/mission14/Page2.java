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
    EditText mathbag, mathgrade, englishbag, englishgrade, eT12, eT13, eT14, eT15, eT16, eT17, eT18, eT19, eT20;
    int bonus = 0, bonus2 = 0, grades = 10, finalgrade = 0, finalgrade2 = 0, subjectg = 0, mathbonus = 0, englishbonus = 0, count = 0, bonus3 = 0, bonusfirst = 0, bonussecond = 0, bonusthird = 0, mathbonus2 = 0, englishbonus2 = 0, num, num4, num8, finalgradefir = 0, finalgradesec = 0, finalgradethi = 0, mathgg, englishgg;
    double sum = 0, sum2, sum3, sum4, sum5, sum6, sum7, sum8, max, thesum, thesumfirst, thesumsecond, thesumthird, thesummath, thesumenglish, englishggg, mathggg, thesumf, thesums, thesumt;
    Button btn7, btn8, btn9;
    int counterrrr;
    String numm, num2, num3, num6, num7, num9, nummm, mathb, mathg, englishb, englishg, namesubject, namesubject2, namesubject3;

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
        thesum = gi.getDoubleExtra("result7", 0);
        counterrrr = gi.getIntExtra("counterrrr", 0);

        int shapp = Integer.parseInt(shap);
        int hiss = Integer.parseInt(his);
        int lass = Integer.parseInt(las);
        int hez = Integer.parseInt(hezz);
        int tann = Integer.parseInt(tan);

        eT12.setHint("enter subject");
        eT15.setHint("enter subject");
        eT18.setHint("enter subject");
        count = counterrrr;

    }

    public static int math(String mathb, String mathg, EditText mathbag, EditText mathgrade, int mathgg, int mathbonus) {
        mathg = mathbag.getText().toString();
        mathgg = Integer.parseInt(mathg);
        if (mathgg == 5) {
            mathbonus = +30;
            return mathbonus;
        } else if (mathgg == 4) {
            mathbonus = +15;
            return mathbonus;

        } else {
            mathbonus = 0;
            return mathbonus;
        }
    }

    public static int english(String englishb, String englishg, EditText englishbag, EditText englishgrade, int englishgg, int englishbonus) {
        englishg = englishbag.getText().toString();
        englishgg = Integer.parseInt(englishg);
        if (englishgg == 5) {
            englishbonus = +30;
            return englishbonus;
        } else if (englishgg == 4) {
            englishbonus = +15;
            return englishbonus;

        } else {
            englishbonus = 0;
            return englishbonus;
        }
    }

    public void clicked9(View view) {
        mathb = mathbag.getText().toString();
        mathg = mathgrade.getText().toString();
        englishb = englishbag.getText().toString();
        englishg = englishgrade.getText().toString();


        if (mathb.isEmpty() | mathb.equals("-") | mathb.equals("-.") | mathb.equals("+") | mathb.equals("+.") | mathg.isEmpty() | mathg.equals("-") | mathg.equals("-.") | mathg.equals("+") | mathg.equals("+.") | englishb.isEmpty() | englishb.equals("-") | englishb.equals("-.") | englishb.equals("+") | englishb.equals("+.") | englishg.isEmpty() | englishg.equals("-") | englishg.equals("-.") | englishg.equals("+") | englishg.equals("+."))
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        else if (Integer.parseInt(mathb) > 5 || Integer.parseInt(mathb) < 3 || Integer.parseInt(englishb) > 5 || Integer.parseInt(englishb) < 3 || Integer.parseInt(englishg) > 100 || Integer.parseInt(mathg) > 100) {
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
        } else {
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

    public void clicked8(View view) {
        String mathb = mathbag.getText().toString();
        String mathg = mathgrade.getText().toString();
        String englishb = englishbag.getText().toString();
        String englishg = englishgrade.getText().toString();


        if (mathb.isEmpty() | mathb.equals("-") | mathb.equals("-.") | mathb.equals("+") | mathb.equals("+.") | mathg.isEmpty() | mathg.equals("-") | mathg.equals("-.") | mathg.equals("+") | mathg.equals("+.") | englishb.isEmpty() | englishb.equals("-") | englishb.equals("-.") | englishb.equals("+") | englishb.equals("+.") | englishg.isEmpty() | englishg.equals("-") | englishg.equals("-.") | englishg.equals("+") | englishg.equals("+."))
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        else if (Integer.parseInt(mathb) > 5 || Integer.parseInt(mathb) < 3 || Integer.parseInt(englishb) > 5 || Integer.parseInt(englishb) < 3 || Integer.parseInt(englishg) > 100 || Integer.parseInt(mathg) > 100) {
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
        } else {
            eT12.setVisibility(view.VISIBLE);
            eT13.setVisibility(view.VISIBLE);
            eT14.setVisibility(view.VISIBLE);
            eT15.setVisibility(view.VISIBLE);
            eT16.setVisibility(view.VISIBLE);
            eT17.setVisibility(view.VISIBLE);
            eT18.setVisibility(view.INVISIBLE);
            eT19.setVisibility(view.INVISIBLE);
            eT20.setVisibility(view.INVISIBLE);
            count = 2;
        }

    }

    public void clicked7(View view) {
        String mathb = mathbag.getText().toString();
        String mathg = mathgrade.getText().toString();
        String englishb = englishbag.getText().toString();
        String englishg = englishgrade.getText().toString();


        if (mathb.isEmpty() | mathb.equals("-") | mathb.equals("-.") | mathb.equals("+") | mathb.equals("+.") | mathg.isEmpty() | mathg.equals("-") | mathg.equals("-.") | mathg.equals("+") | mathg.equals("+.") | englishb.isEmpty() | englishb.equals("-") | englishb.equals("-.") | englishb.equals("+") | englishb.equals("+.") | englishg.isEmpty() | englishg.equals("-") | englishg.equals("-.") | englishg.equals("+") | englishg.equals("+."))
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        else if (Integer.parseInt(mathb) > 5 || Integer.parseInt(mathb) < 3 || Integer.parseInt(englishb) > 5 || Integer.parseInt(englishb) < 3 || Integer.parseInt(englishg) > 100 || Integer.parseInt(mathg) > 100) {
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
        } else {
            eT12.setVisibility(view.VISIBLE);
            eT13.setVisibility(view.VISIBLE);
            eT14.setVisibility(view.VISIBLE);
            eT15.setVisibility(view.VISIBLE);
            eT16.setVisibility(view.VISIBLE);
            eT17.setVisibility(view.VISIBLE);
            eT18.setVisibility(view.VISIBLE);
            eT19.setVisibility(view.VISIBLE);
            eT20.setVisibility(view.VISIBLE);
            count = 3;
        }

    }

    public void prev(View view) {
        finish();
    }

    public void nextbtn2(View view) {
        mathb = mathbag.getText().toString();
        mathg = mathgrade.getText().toString();
        englishb = englishbag.getText().toString();
        englishg = englishgrade.getText().toString();

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
        if (!mathh.isEmpty()) {
            mathgg = Integer.parseInt(mathh);
        }
        String englishh = mathbag.getText().toString();
        if (!englishh.isEmpty()) {
            englishgg = Integer.parseInt(englishh);



            } if (count == 3 && (TextUtils.isEmpty(eT12.getText().toString()) || eT12.equals("-") || eT12.equals("-.") || eT12.equals("+") || eT12.equals("+.") || TextUtils.isEmpty(eT13.getText().toString()) || eT13.equals("-") || eT13.equals("-.") || eT13.equals("+") || eT13.equals("+.") || TextUtils.isEmpty(eT14.getText().toString()) || eT14.equals("-") || eT14.equals("-.") || eT14.equals("+") || eT14.equals("+.") ||
                    TextUtils.isEmpty(eT15.getText().toString()) || eT15.equals("-") || eT15.equals("-.") || eT15.equals("+") || eT15.equals("+.") || TextUtils.isEmpty(eT16.getText().toString()) || eT16.equals("-") || eT16.equals("-.") || eT16.equals("+") || eT16.equals("+.") || TextUtils.isEmpty(eT17.getText().toString()) || eT17.equals("-") || eT17.equals("-.") || eT17.equals("+") || eT17.equals("+.") ||
                    TextUtils.isEmpty(eT18.getText().toString()) || eT18.equals("-") || eT18.equals("-.") || eT18.equals("+") || eT18.equals("+.") || TextUtils.isEmpty(eT19.getText().toString()) || eT19.equals("-") || eT19.equals("-.") || eT19.equals("+") || eT19.equals("+.") || TextUtils.isEmpty(eT20.getText().toString()) || eT20.equals("-") || eT20.equals("-.") || eT20.equals("+") || eT20.equals("+."))) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            } else if (count == 1 && (TextUtils.isEmpty(eT12.getText().toString()) || eT12.equals("-") || eT12.equals("-.") || eT12.equals("+") || eT12.equals("+.") || TextUtils.isEmpty(eT13.getText().toString()) || eT13.equals("-") || eT13.equals("-.") || eT13.equals("+") || eT13.equals("+.") || TextUtils.isEmpty(eT14.getText().toString()) || eT14.equals("-") || eT14.equals("-.") || eT14.equals("+") || eT14.equals("+."))) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            } else if (count == 2 && (TextUtils.isEmpty(eT12.getText().toString()) || eT12.equals("-") || eT12.equals("-.") || eT12.equals("+") || eT12.equals("+.") || TextUtils.isEmpty(eT13.getText().toString()) || eT13.equals("-") || eT13.equals("-.") || eT13.equals("+") || eT13.equals("+.") || TextUtils.isEmpty(eT14.getText().toString()) || eT14.equals("-") || eT14.equals("-.") || eT14.equals("+") || eT14.equals("+.") ||
                    TextUtils.isEmpty(eT15.getText().toString()) || eT15.equals("-") || eT15.equals("-.") || eT15.equals("+") || eT15.equals("+.") || TextUtils.isEmpty(eT16.getText().toString()) || eT16.equals("-") || eT16.equals("-.") || eT16.equals("+") || eT16.equals("+.") || TextUtils.isEmpty(eT17.getText().toString()) || eT17.equals("-") || eT17.equals("-.") || eT17.equals("+") || eT17.equals("+."))) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            } else {


                switch (count) {
                    case (1):
                        thesumfirst = 0;
                        thesumsecond = 0;
                        thesumthird = 0;
                        subjectg = 0;
                        namesubject = eT12.getText().toString();
                        grades = grades + mathgg + englishgg;

                        mathggg = Double.parseDouble(mathg);
                        englishggg = Double.parseDouble(englishg);

                        mathbonus2 = math(mathb, mathg, mathbag, mathgrade, mathgg, mathbonus);
                        englishbonus2 = english(englishb, englishg, englishbag, englishgrade, englishgg, englishbonus);

                        thesummath = thesummath + mathggg + mathbonus2;
                        thesummath = thesummath * mathgg;
                        thesumenglish = thesumenglish + englishggg + englishbonus2;
                        thesumenglish = thesumenglish * englishgg;


                        numm = eT13.getText().toString();
                        num = Integer.parseInt(numm);

                        if (num == 5) {
                            subjectg = subjectg + 5;
                            grades = grades + 5;
                            bonusfirst = 20;
                        } else if (num == 4) {
                            subjectg = subjectg + 4;
                            grades = grades + 4;
                            bonusfirst = 10;
                        } else {
                            subjectg = subjectg + 1;
                            grades = subjectg + 1;
                        }

                        // בדיקה של שורה ראשונה
                        nummm = eT14.getText().toString();
                        finalgrade = Integer.parseInt(nummm);
                        thesumf = thesumf + finalgrade + bonusfirst;
                        thesumf = thesumf * num;
                        thesumfirst = thesumfirst + thesumf + thesum + thesummath + thesumenglish;
                        double sum30 = thesumfirst / grades;
                        max = sum30;

                        if (Integer.parseInt(String.valueOf(num)) > 5 || Integer.parseInt(String.valueOf(num)) < 4 || Integer.parseInt(String.valueOf(num)) == 1 || Integer.parseInt(nummm) > 100) {
                            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();

                        } else {
                            si.putExtra("result12", String.valueOf(sum30));
                            si.putExtra("grades12", numm);
                            si.putExtra("name12", namesubject);
                            si.putExtra("final12", nummm);
                            si.putExtra("max", max);

                            startActivity(si);
                        }
                        break;

                    case (2):
                        thesumfirst = 0;
                        thesumsecond = 0;
                        thesumthird = 0;
                        grades = 10;
                        subjectg = 0;

                        grades = grades + mathgg + englishgg;

                        mathggg = Double.parseDouble(mathg);
                        englishggg = Double.parseDouble(englishg);

                        mathbonus2 = math(mathb, mathg, mathbag, mathgrade, mathgg, mathbonus);
                        englishbonus2 = english(englishb, englishg, englishbag, englishgrade, englishgg, englishbonus);

                        thesummath = thesummath + mathggg + mathbonus2;
                        thesummath = thesummath * mathgg;
                        thesumenglish = thesumenglish + englishggg + englishbonus2;
                        thesumenglish = thesumenglish * englishgg;

                        numm = eT13.getText().toString();
                        num = Integer.parseInt(numm);


                        if (num == 5) {
                            subjectg = subjectg + 5;
                            grades = grades + 5;
                            bonusfirst = 20;
                        } else if (num == 4) {
                            subjectg = subjectg + 4;
                            grades = grades + 4;
                            bonusfirst = 10;
                        } else {
                            subjectg = subjectg + 1;
                            grades = subjectg + 1;
                        }


                        //שורה ראשונה
                        num2 = eT14.getText().toString();
                        finalgrade = Integer.parseInt(num2);
                        thesumf = thesumf + finalgrade + bonusfirst;
                        thesumf = thesumf * num;
                        thesumfirst = thesumfirst + thesumf + thesum + thesummath + thesumenglish;
                        sum2 = thesumfirst / grades;
                        max = sum2;
                        namesubject = eT12.getText().toString();

                        sum = 0;
                        grades = grades - num;
                        subjectg = 0;


                        num3 = eT16.getText().toString();
                        num4 = Integer.parseInt(num3);

                        if (num4 == 5) {
                            grades = grades + 5;
                            bonussecond = 20;
                        } else if (num4 == 4) {
                            grades = grades + 4;
                            bonussecond = 10;
                        } else {
                            grades = grades + 1;
                        }

                        //שורה שניה

                        num6 = eT17.getText().toString();
                        finalgradesec = Integer.parseInt(num6);
                        thesums = finalgradesec + bonussecond;
                        thesums = thesums * num4;
                        thesumsecond = thesumsecond + thesums + thesum + thesummath + thesumenglish;
                        sum3 = thesumsecond / grades;
                        namesubject2 = eT15.getText().toString();
                        if (sum3 > max)
                            max = sum3;

                        grades = grades - num4;
                        finalgrade = 0;

                        // שורה ראשונה ושניה
                        grades = grades + num4 + num;
                        thesumthird = thesumthird + thesums + thesumf + thesumenglish + thesummath + thesum;
                        sum4 = thesumthird / grades;
                        if (sum4 > max)
                            max = sum4;

                        if (Integer.parseInt(String.valueOf(num)) > 5 || Integer.parseInt(String.valueOf(num)) < 4 || Integer.parseInt(String.valueOf(num)) == 1 || Integer.parseInt(String.valueOf(num4)) > 5 || Integer.parseInt(String.valueOf(num4)) < 4 || Integer.parseInt(String.valueOf(num4)) == 1
                                || Integer.parseInt(num2) > 100 || Integer.parseInt(num6) > 100) {
                            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                        } else {

                            si.putExtra("grade", numm);
                            si.putExtra("final", num2);
                            si.putExtra("result", String.valueOf(sum2));
                            si.putExtra("name", namesubject);

                            si.putExtra("grade2", num3);
                            si.putExtra("final2", num6);
                            si.putExtra("result2", String.valueOf(sum3));
                            si.putExtra("name2", namesubject2);

                            si.putExtra("result3", String.valueOf(sum4));

                            si.putExtra("max", max);

                            startActivity(si);
                        }
                        break;


                    case (3):
                        thesumfirst = 0;
                        thesumsecond = 0;
                        thesumthird = 0;
                        grades = 10;
                        grades = grades + mathgg + englishgg;
                        // בודק יחידות
                        mathggg = Double.parseDouble(mathg);
                        englishggg = Double.parseDouble(englishg);

                        mathbonus2 = math(mathb, mathg, mathbag, mathgrade, mathgg, mathbonus);
                        englishbonus2 = english(englishb, englishg, englishbag, englishgrade, englishgg, englishbonus);

                        thesummath = thesummath + mathggg + mathbonus2;
                        thesummath = thesummath * mathgg;
                        thesumenglish = thesumenglish + englishggg + englishbonus2;
                        thesumenglish = thesumenglish * englishgg;
                        // בודק כמה יחידות יש לשורה הראשונה

                        numm = eT13.getText().toString();
                        num = Integer.parseInt(numm);
                        if (num == 5) {
                            grades = grades + 5;
                            bonusfirst = 20;
                        } else if (num == 4) {
                            grades = grades + 4;
                            bonusfirst = 10;
                        } else {
                            grades = grades + 1;
                        }
                        // מחשב את הציון הממוצע של שורה ראשונה
                        num2 = eT14.getText().toString();
                        finalgrade = Integer.parseInt(num2);
                        thesumf = thesumf + finalgrade + bonusfirst;
                        thesumf = thesumf * num;
                        thesumfirst = thesumfirst + thesumf + thesum + thesummath + thesumenglish;
                        sum2 = thesumfirst / grades;
                        max = sum2;
                        namesubject = eT12.getText().toString();

                        grades = grades - num;

                        // בודק כמה יחידות יש לשורה השניה

                        num3 = eT16.getText().toString();
                        num4 = Integer.parseInt(num3);

                        if (num4 == 5) {
                            grades = grades + 5;
                            bonussecond = 20;
                        } else if (num4 == 4) {
                            grades = grades + 4;
                            bonussecond = 10;
                        } else {
                            grades = grades + 1;
                        }

                        // מחשב את הציון הממוצע של שורה שניה
                        num6 = eT17.getText().toString();
                        finalgradesec = Integer.parseInt(num6);
                        thesums = finalgradesec + bonussecond;
                        thesums = thesums * num4;
                        thesumsecond = thesumsecond + thesums + thesum + thesummath + thesumenglish;
                        sum3 = thesumsecond / grades;
                        if (sum3 > max)
                            max = sum3;
                        namesubject2 = eT15.getText().toString();

                        grades = grades - num4;


                        // מחשב את הממוצע של עמוד ראשון ועמוד שני הציון
                        grades = grades + num4 + num;
                        thesumthird = thesumthird + thesums + thesumf + thesumenglish + thesummath + thesum;
                        sum4 = thesumthird / grades;
                        if (sum4 > max)
                            max = sum4;
                        grades = grades - num4 - num;
                        thesumthird = 0;
                        //מחשב את העמוד השלישי כמה יחידות יש

                        num7 = eT19.getText().toString();
                        num8 = Integer.parseInt(num7);
                        if (num8 == 5) {
                            grades = grades + 5;
                            bonusthird = 20;
                        } else if (num8 == 4) {
                            grades = grades + 4;
                            bonusthird = 10;
                        } else {
                            grades = grades + 1;
                        }

                        // מחשב את הממוצע של שורה שלוש
                        num9 = eT20.getText().toString();
                        finalgradethi = Integer.parseInt(num6);
                        thesumt = finalgradethi + bonusthird;
                        thesumt = thesumt * num8;
                        thesumthird = thesumthird + thesumt + thesum + thesummath + thesumenglish;
                        sum5 = thesumthird / grades;
                        if (sum5 > max)
                            max = sum5;

                        namesubject3 = eT18.getText().toString();
                        grades = grades - num8;
                        thesumthird = 0;

                        // מחשב את הממוצע של עמוד ראשון ועמוד השלישי הציון
                        grades = grades + num8 + num;
                        thesumthird = thesumthird + thesumt + thesumf + thesumenglish + thesummath + thesum;
                        sum6 = thesumthird / grades;
                        if (sum6 > max)
                            max = sum6;
                        grades = grades - num8 - num;
                        thesumthird = 0;

                        // מחשב את הממוצע של עמוד שני  ועמוד השלישי הציון
                        grades = grades + num8 + num4;
                        thesumthird = thesumthird + thesumt + thesums + thesumenglish + thesummath + thesum;
                        sum7 = thesumthird / grades;
                        if (sum7 > max)
                            max = sum7;

                        grades = grades - num8 - num4;
                        thesumthird = 0;

                        // מחשב את הממוצע של עמוד הראשון השני ועמוד השלישי הציון
                        grades = grades + num8 + num + num4;
                        thesumthird = thesumthird + thesumt + thesums + thesumf + thesumenglish + thesummath + thesum;
                        sum8 = thesumthird / grades;
                        if (sum8 > max)
                            max = sum8;

                        if (Integer.parseInt(String.valueOf(num)) > 5 || Integer.parseInt(String.valueOf(num)) < 4 || Integer.parseInt(String.valueOf(num)) == 1 || Integer.parseInt(String.valueOf(num4)) > 5 || Integer.parseInt(String.valueOf(num4)) < 4 || Integer.parseInt(String.valueOf(num4)) == 1 || Integer.parseInt(String.valueOf(num8)) > 5 || Integer.parseInt(String.valueOf(num8)) < 4 || Integer.parseInt(String.valueOf(num8)) == 1
                                || Integer.parseInt(num2) > 100 || Integer.parseInt(num6) > 100 || Integer.parseInt(num9) > 100) {
                            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                        } else {
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
                            si.putExtra("final3", num9);
                            si.putExtra("result4", String.valueOf(sum5));
                            si.putExtra("name3", namesubject3);

                            si.putExtra("result5", String.valueOf(sum6));

                            si.putExtra("result6", String.valueOf(sum7));

                            si.putExtra("result7", String.valueOf(sum8));

                            si.putExtra("max", max);

                            startActivity(si);
                        }
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
    }
//}

