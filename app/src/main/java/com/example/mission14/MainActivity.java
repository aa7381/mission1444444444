package com.example.mission14;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText eT, eT2, eT3, eT4, eT5, eT6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eT = findViewById(R.id.eT);
        eT2 = findViewById(R.id.eT2);
        eT3 = findViewById(R.id.eT3);
        eT4 = findViewById(R.id.eT4);
        eT5 = findViewById(R.id.eT5);
        eT6 = findViewById(R.id.eT6);

    }
    //hints
    public void clicked1(View view)
    {

        eT4.setHint("enter grade");
    }
    public void clicked2(View view)
    {

        eT2.setHint("enter grade");
    }
    public void clicked3(View view)
    {

        eT3.setHint("enter grade");
    }
    public void clicked4(View view)
    {

        eT5.setHint("enter grade");
    }
    public void clicked5(View view)
    {
        eT6.setHint("enter grade");
    }
    public void clicked6(View view)
    {

        eT.setHint("enter name and last name ");
    }


    //הכפתור של הnext
    public void clicked(View view) {
        // קולט את הציונים
        String name = eT.getText().toString();
        String shap = eT2.getText().toString();
        String his = eT3.getText().toString();
        String las = eT4.getText().toString();
        String hezz = eT5.getText().toString();
        String tan = eT6.getText().toString();

        //תקינות קלט
        if (name.isEmpty() | name.equals("-") | name.equals("-.") | name.equals("+") | name.equals("+.") | shap.isEmpty() | shap.equals("-") | shap.equals("-.") | shap.equals("+") | shap.equals("+.") | his.isEmpty() | his.equals("-") | his.equals("-.") | his.equals("+") | his.equals("+.") | las.isEmpty() | las.equals("-") | las.equals("-.") | las.equals("+") | las.equals("+.") | hezz.isEmpty() | hezz.equals("-") | hezz.equals("-.") | hezz.equals("+") | hezz.equals("+.") | tan.isEmpty() | tan.equals("-") | tan.equals("-.") | tan.equals("+") | tan.equals("+."))
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        else
        {

        // העברת הדברים לmain השני
            Intent si = new Intent(this, main2.class);
            si.putExtra("result", name);
            si.putExtra("result2", shap);
            si.putExtra("result3", his);
            si.putExtra("result3", las);
            si.putExtra("result3", hezz);
            si.putExtra("result3", tan);
            startActivity(si);

        }


    }
}
