package com.ldnr.projetandroidcahierpunissement;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NouveauGroupe extends AppCompatActivity {

    //permet de créer un nouveau groupe
    //champ requis : année, nom de la formation,
    // TODO : ajouter nom des stagiaires, à sélectionner dans une liste (tyoe datalist de HTML)
    // sinon renvoyer sur la page NouveauStagiaire
    // TODO : alimenter la table Groupe et Stagiaire au click sur Envoyer

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouveau_groupe);
        Resources res = getResources();
        TextView nouveauGroupe = findViewById(R.id.nouveauGroupe);
    }
}
