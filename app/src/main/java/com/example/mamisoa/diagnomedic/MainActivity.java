package com.example.mamisoa.diagnomedic;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    DBHelper dbHelper;
    LinearLayout symptomesLayout;
    List<CheckBox> checkboxes = new ArrayList<>();
    Button btnDiagnostiquer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DBHelper(this);

        symptomesLayout = (LinearLayout)findViewById(R.id.symptomesLayout);
        btnDiagnostiquer = (Button)findViewById(R.id.btnDiagnostiquer);

        List<String> symptomes;
        try {
            symptomes = dbHelper.getAllSymptomes();
        } catch (Exception e) {
            Toast.makeText(this, "Erreur lors du chargement des symptômes.", Toast.LENGTH_LONG).show();
            e.printStackTrace();
            symptomes = new ArrayList<>();
        }

        if (symptomes != null) {
            for (String s : symptomes) {
                CheckBox cb = new CheckBox(this);
                cb.setText(s);
                symptomesLayout.addView(cb);
                checkboxes.add(cb);
            }
        }

        btnDiagnostiquer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ArrayList<String> coches = new ArrayList<>();
                for (CheckBox cb : checkboxes) {
                    if (cb.isChecked()) {
                        coches.add(cb.getText().toString());
                    }
                }

                if (coches.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Veuillez sélectionner au moins un symptôme.", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putStringArrayListExtra("symptomes", coches);
                startActivity(intent);
            }
        });
    }
}
