package com.example.mamisoa.diagnomedic;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ResultActivity extends Activity {

    TextView txtMaladie, txtMedicaments;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txtMaladie = (TextView)findViewById(R.id.txtMaladie);
        txtMedicaments = (TextView)findViewById(R.id.txtMedicaments);
        dbHelper = new DBHelper(this);

        ArrayList<String> symptomes = getIntent().getStringArrayListExtra("symptomes");

        if (symptomes == null || symptomes.isEmpty()) {
            txtMaladie.setText("Aucun symptôme reçu.");
            txtMedicaments.setText("");
            return;
        }

        String maladie = dbHelper.getMaladieFromSymptomes(symptomes);
        if (maladie == null) {
            txtMaladie.setText("Aucune maladie détectée.");
            txtMedicaments.setText("");
            return;
        }

        txtMaladie.setText("Maladie détectée : " + maladie);

        List<String> meds = dbHelper.getMedicamentsForMaladie(maladie);
        if (meds == null || meds.isEmpty()) {
            txtMedicaments.setText("Aucun médicament disponible.");
        } else {
            StringBuilder builder = new StringBuilder("Médicaments :\n");
            for (String m : meds) builder.append("- ").append(m).append("\n");
            txtMedicaments.setText(builder.toString());
        }
    }

}
