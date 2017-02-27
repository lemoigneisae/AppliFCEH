package com.fceh.isaelemoigne.applifceh;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

import static android.R.id.list;


/**
 * A simple {@link Fragment} subclass.
 */
public class Joueurs extends Fragment {

    private JoueursDataSource datasource;
    private Spinner equipes;
    private ListView liste;


    public Joueurs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.joueurs, container, false);
        equipes = (Spinner) v.findViewById(R.id.spinner);
        liste = (ListView) v.findViewById(R.id.listView);
        datasource = new JoueursDataSource(getActivity());
        equipes.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,new String[]{"Tous les joueurs", "Équipe A", "Équipe B", "Équipe C"}));
        equipes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    List<Joueur> allJoueurs = recupJoueurs();
                    liste.setAdapter(new ArrayAdapter<Joueur>(getActivity(), android.R.layout.simple_list_item_1, allJoueurs));
                }
                else if(position==1){
                    List<Joueur> allJoueurs = recupJoueursA();
                    liste.setAdapter(new ArrayAdapter<Joueur>(getActivity(), android.R.layout.simple_list_item_1, allJoueurs));
                }
                else if(position==2){
                    List<Joueur> allJoueurs = recupJoueursB();
                    liste.setAdapter(new ArrayAdapter<Joueur>(getActivity(), android.R.layout.simple_list_item_1, allJoueurs));
                }
                else if(position==3){
                    List<Joueur> allJoueurs = recupJoueursC();
                    liste.setAdapter(new ArrayAdapter<Joueur>(getActivity(), android.R.layout.simple_list_item_1, allJoueurs));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        datasource = new JoueursDataSource(context);
    }

    public List<Joueur> recupJoueurs() {

            datasource.open();
            List<Joueur> values = datasource.getAllJoueurs();
            return values;

    }

    public List<Joueur> recupJoueursA() {

        datasource.open();
        List<Joueur> valuesA = datasource.getAJoueurs();

        return valuesA;

    }

    public List<Joueur> recupJoueursB() {

        datasource.open();
        List<Joueur> valuesB = datasource.getBJoueurs();

        return valuesB;

    }

    public List<Joueur> recupJoueursC() {

        datasource.open();
        List<Joueur> valuesC = datasource.getCJoueurs();

        return valuesC;

    }
}
