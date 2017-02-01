package com.fceh.isaelemoigne.applifceh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.StringDef;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import static android.app.Activity.RESULT_CANCELED;
import static android.app.Activity.RESULT_OK;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Joueurs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joueurs);
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
        list.setClickable(true);
        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                        Object o = list.getItemAtPosition(position);
                        Intent retour = new Intent(Joueurs.this, AjoutJoueurs.class);
                        retour.putExtra("clé",o.toString());
                        startActivityForResult(retour, 90);
                    }
                }
        );
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode) {
            case 90:
                if (resultCode == RESULT_OK) {
                    String res1 = data.getStringExtra("PrenomJoueurs");
                    String res2 = data.getStringExtra("NomJoueurs");
                    String res3 = data.getStringExtra("DateNaissance");
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

}


