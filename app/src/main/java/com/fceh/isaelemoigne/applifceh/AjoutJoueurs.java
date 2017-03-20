package com.fceh.isaelemoigne.applifceh;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class AjoutJoueurs extends AppCompatActivity {
    EditText id;
    EditText nom;
    EditText prenom;
    EditText poste;
    EditText numero;
    EditText equipe;
    private JoueursDataSource datasource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_joueurs);
        id = (EditText)findViewById(R.id.editText6);
        nom = (EditText)findViewById(R.id.editText);
        prenom = (EditText)findViewById(R.id.editText1);
        poste = (EditText)findViewById(R.id.editText2);
        numero = (EditText)findViewById(R.id.editText3);
        equipe = (EditText)findViewById(R.id.editText4);
        id.setText(""+getIntent().getIntExtra("id",0));
        nom.setText(getIntent().getStringExtra("nom"));
        prenom.setText(getIntent().getStringExtra("prenom"));
        poste.setText(getIntent().getStringExtra("poste"));
        numero.setText(""+getIntent().getIntExtra("numero",0));
        equipe.setText(getIntent().getStringExtra("equipe"));
    }

    public void AjoutJoueurs(View view){
        datasource = new JoueursDataSource(this);
        datasource.open();
        datasource.createJoueur(Integer.valueOf(id.getText().toString()).intValue(), nom.getText().toString(), prenom.getText().toString(), poste.getText().toString(), Integer.valueOf(numero.getText().toString()).intValue(), equipe.getText().toString());
        finish();
    }

}
