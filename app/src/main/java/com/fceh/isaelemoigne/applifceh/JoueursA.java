package com.fceh.isaelemoigne.applifceh;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class JoueursA extends AppCompatActivity {

    Joueur joueur1;
    Joueur joueur2;
    Joueur joueur3;
    Joueur joueur4;
    Joueur joueur5;
    private List<Joueur> listeJoueurs;
    private MonAdaptateurDeListe adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        joueur1 = new Joueur("Romain Coupey","Attaquant", 14);
        joueur2 = new Joueur("Loic Gautier","Milieu central", 8);
        joueur3 = new Joueur("Marwan Rorchi","Attaquant", 9);
        joueur4 = new Joueur("William Legangneux","Défenseur central", 4);
        joueur5 = new Joueur("Julien Mahaut","Défenseur latéral", 3);

        joueur1.setImg(R.mipmap.joueur1);
        joueur2.setImg(R.mipmap.joueur2);
        joueur4.setImg(R.mipmap.joueur4);

        /*joueur3.setImg(R.drawable.joueur3);
        joueur5.setImg(R.drawable.joueur5);*/


        setContentView(R.layout.activity_joueurs_a);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(view.getContext(),AjoutJoueurs.class),90);
            }
        });

        final ListView list = (ListView)findViewById(R.id.listView01);

        listeJoueurs = genererJoueur();
        adapter = new MonAdaptateurDeListe(JoueursA.this, listeJoueurs);


        list.setAdapter(adapter);
        list.setClickable(true);
        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                        Joueur o = (Joueur) list.getItemAtPosition(position);
                        Intent retour = new Intent(JoueursA.this, AjoutJoueurs.class);
                        retour.putExtra("Nom",o.getNom());
                        retour.putExtra("Poste",o.getPoste());
                        retour.putExtra("Numero",o.getNumero());
                        startActivityForResult(retour, 90);
                    }
                }
        );
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode) {
            case 90:
                if (resultCode == RESULT_OK) {
                    String res1 = data.getStringExtra("NomJoueurs");
                    String res2 = data.getStringExtra("PosteJoueurs");
                    int res3 = data.getIntExtra("Numero",0);

                    Joueur nouveauJ = new Joueur(res1, res2, res3);
                    listeJoueurs.add(nouveauJ);
                    adapter.notifyDataSetChanged();

                    Toast t1 = Toast.makeText(this, res1, Toast.LENGTH_SHORT);
                    t1.setGravity(Gravity.CENTER,0,-100); // décalé du centre
                    t1.show();
                    Toast t2 = Toast.makeText(this, res2, Toast.LENGTH_SHORT);
                    t2.setGravity(Gravity.CENTER,0,-50); // décalé du centre
                    t2.show();
                    Toast t3 = Toast.makeText(this, res3, Toast.LENGTH_SHORT);
                    t3.setGravity(Gravity.CENTER,0,-150); // décalé du centre
                    t3.show();
                }
                break;
        }
    }

    private List<Joueur> genererJoueur(){
        List<Joueur> joueur = new ArrayList<Joueur>();
        joueur.add(joueur1);
        joueur.add(joueur2);
        joueur.add(joueur3);
        joueur.add(joueur4);
        joueur.add(joueur5);
        return joueur;
    }

}


