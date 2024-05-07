package com.example.mission14;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class main2 extends AppCompatActivity {
    String name, shap, his, las, hezz, tan;
    EditText mathbag , mathgrade , englishbag , englishgrade ,eT12,eT13,eT14,eT15,eT16,eT17,eT18,eT19,eT20;
    Button btn7 , btn8 , btn9 ;

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
        las = gi.getStringExtra("resul4");
        hezz = gi.getStringExtra("result5");
        tan = gi.getStringExtra("result6");

        int shapp = Integer.parseInt(shap);
        int hiss = Integer.parseInt(his);
        int lass = Integer.parseInt(las);
        int hez = Integer.parseInt(hezz);
        int tann = Integer.parseInt(tan);

    }

    public void clicked9(View view)
    {
        String mathb = mathbag.getText().toString();
        String mathg = mathgrade.getText().toString();
        String englishb = englishbag.getText().toString();
        String englishg = englishgrade.getText().toString();

        if (mathb.isEmpty() | mathb.equals("-") | mathb.equals("-.") | name.equals("+") | name.equals("+.") | shap.isEmpty() | shap.equals("-") | shap.equals("-.") | shap.equals("+") | shap.equals("+.") | his.isEmpty() | his.equals("-") | his.equals("-.") | his.equals("+") | his.equals("+.") | las.isEmpty() | las.equals("-") | las.equals("-.") | las.equals("+") | las.equals("+.") | hezz.isEmpty() | hezz.equals("-") | hezz.equals("-.") | hezz.equals("+") | hezz.equals("+.") | tan.isEmpty() | tan.equals("-") | tan.equals("-.") | tan.equals("+") | tan.equals("+."))
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
    }


}