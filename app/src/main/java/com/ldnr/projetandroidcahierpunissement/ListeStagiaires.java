package com.ldnr.projetandroidcahierpunissement;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListeStagiaires extends AppCompatActivity {

    // afficher la liste des stagiaires (nom, prénom, session+année)
    // cliquer sur + et accéder à NouveauStagiaire
    // cliquer sur modifier ou éditer et accéder à FicheStagiaire détaillée correspondante
    // cliquer sur l'icône de punissement et accéder à NouvellePunition en transférant l'info du stagiaire sélectionné

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_stagiaires);
        Resources res = getResources();
        TextView listeStagiaires = findViewById(R.id.listeStagiaires);
    }

    protected void creerNouveauStagiaire(View view) {
        Intent creationStagiaire = new Intent(this, NouveauStagiaire.class);
        startActivity(creationStagiaire);
    }

    protected void editerStagiaire(View view) {
        Intent editionStagiaire = new Intent(this, FicheStagiaire.class);
        startActivity(editionStagiaire);
    }

    protected void consulterStagiaire(View view) {
        Intent editionStagiaire = new Intent(this, FicheStagiaire.class);
        startActivity(editionStagiaire);
    }

    protected void punisserStagiaire(View view) {

    Intent creationPunissement = new Intent(this, NouveauPunissement.class);
    startActivity(creationPunissement);
}
}
