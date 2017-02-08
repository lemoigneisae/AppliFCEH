package com.fceh.isaelemoigne.applifceh;

import android.app.Fragment;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*public class Equipes extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_equipes,container,false);
        }

        public void onEquipeA(View view) { startActivity(new Intent(getActivity(), JoueursA.class)); }

        public void onEquipeB(View view) { startActivity(new Intent(getActivity(), JoueursB.class)); }

        public void onEquipeC(View view) { startActivity(new Intent(getActivity(), JoueursC.class)); }
    } */

public class Equipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipes);
    }

    public void onEquipeA(View view) { startActivity(new Intent(this, JoueursA.class)); }

    public void onEquipeB(View view) { startActivity(new Intent(this, JoueursB.class)); }

    public void onEquipeC(View view) { startActivity(new Intent(this, JoueursC.class)); }
}
