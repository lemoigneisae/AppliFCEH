package com.fceh.isaelemoigne.applifceh;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class AjoutJoueurs extends AppCompatActivity {
    EditText champ1;
    EditText champ2;
    EditText champ3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_joueurs);
        champ1 = (EditText)findViewById(R.id.editText);
        champ2 = (EditText)findViewById(R.id.editText2);
        champ3 = (EditText)findViewById(R.id.editText3);
        champ1.setText(getIntent().getStringExtra("clé"));
    }
    public void AjoutJoueurs(View view){
        Intent retour = new Intent();
        retour.putExtra("PrenomJoueurs",champ1.getText().toString());
        retour.putExtra("NomJoueurs",champ2.getText().toString());
        retour.putExtra("DateNaissance",champ3.getText().toString());
        setResult(Activity.RESULT_OK, retour);
        finish();
    }

}
