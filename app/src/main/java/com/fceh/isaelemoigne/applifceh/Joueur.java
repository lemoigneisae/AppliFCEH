package com.fceh.isaelemoigne.applifceh;

/**
 * Created by isaelemoigne on 08/02/2017.
 */

import android.app.ListActivity;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Joueur extends ListActivity{
    private String Nom;
    private String Poste;
    private String Type;
    private int Numero;
    public int img;

    public Joueur(String Nom, String Poste, int Numero){
        this.Nom=Nom;
        this.Poste=Poste;
        this.Numero=Numero;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getPoste() {
        return Poste;
    }

    public void setPoste(String poste) {
        Poste = poste;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
    public String toString(){
        return Nom;
    }
}
