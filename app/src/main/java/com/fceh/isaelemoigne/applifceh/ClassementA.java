package com.fceh.isaelemoigne.applifceh;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClassementA extends Fragment {


    public ClassementA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vue = inflater.inflate(R.layout.fragment_resultat, container, false);

        // Instanciation du WebView...
        WebView wvSite = (WebView) vue.findViewById(R.id.webview);

        //...on active JavaScript...
        WebSettings webSettings = wvSite.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //...et on charge la page
        wvSite.loadUrl("http://bassenormandie.fff.fr/competitions/php/championnat/championnat_classement.php?sa_no=2016&cp_no=330516&ph_no=1&gp_no=1");
        return vue;

    }

}
