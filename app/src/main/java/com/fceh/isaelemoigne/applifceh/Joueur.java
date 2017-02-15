package com.fceh.isaelemoigne.applifceh;

/**
 * Created by isaelemoigne on 15/02/2017.
 */

public class Joueur {
    private int id;
    private String nom;
    private String prenom;
    private String poste;
    private int numero;
    private String equipe;

    public Joueur() {}

    public Joueur(int id, String nom, String prenom, String poste, int numero, String equipe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
        this.numero = numero;
        this.equipe = equipe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }


    @Override
    public String toString() {
        return equipe + "\n" + nom +' '+prenom+'\n'+ "n°" + numero + " " + poste;
    }
}