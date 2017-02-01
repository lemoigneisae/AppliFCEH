package com.fceh.isaelemoigne.applifceh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
    }

    public void onJoueurs(View view) {

    }

    public void onEquipes(View view) { startActivity(new Intent(this, Equipes.class)); }
}
