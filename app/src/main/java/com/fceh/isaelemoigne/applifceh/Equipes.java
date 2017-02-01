package com.fceh.isaelemoigne.applifceh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Equipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipes);
    }

    public void onEquipeA(View view) { startActivity(new Intent(this, Joueurs.class)); }

    public void onEquipeB(View view) { startActivity(new Intent(this, JoueursB.class)); }

    public void onEquipeC(View view) { startActivity(new Intent(this, JoueursC.class)); }
}
