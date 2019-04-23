package com.ldnr.projetandroidcahierpunissement;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NouveauPunissement extends AppCompatActivity {

    // permet de créer nouveau punissement
    // champs pour entrer personne(s) concerné(e), date, lieu et punition
    // bouton envoyer alimente le fichier
    // TODO : alimenter la table Punissement, Stagiaire et Groupe de la BDD au click sur Envoyer
    // TODO : envoi SMS + au(x) stagiaire(s) concerné(s)
    // TODO : créé entrée dans l'agenda de l'utilisateur (=formateur)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouveau_punissement);
        Resources res = getResources();
        TextView nouveauPunissement = findViewById(R.id.nouveauPunissement);
    }
}
