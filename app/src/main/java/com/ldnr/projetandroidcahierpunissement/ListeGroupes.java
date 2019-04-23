package com.ldnr.projetandroidcahierpunissement;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListeGroupes extends AppCompatActivity {

    // afficher la liste des groupes (année, nom de la formation)
    // cliquer sur + et accéder à NouveauGroupe
    // cliquer sur modifier ou éditer et accéder à FicheGroupe détaillée correspondante
    // cliquer sur l'icône de punissement et accéder à NouvellePunition en transférant l'info du groupe sélectionné

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_groupes);
        Resources res = getResources();
        TextView listeGroupes = findViewById(R.id.listeGroupes);
    }
    protected void creerNouveauGroupe (View view) {
        Intent creationGroupe = new Intent(this, NouveauGroupe.class);
        startActivity(creationGroupe);
    }

    protected void editerGroupe(View view) {
        Intent editionGroupe = new Intent(this, FicheGroupe.class);
        startActivity(editionGroupe);
    }

    protected void consulterGroupe(View view) {
        Intent editionGroupe = new Intent(this, FicheGroupe.class);
        startActivity(editionGroupe);
    }

    protected void punisserGroupe(View view) {

        Intent creationPunissement = new Intent(this, NouveauPunissement.class);
        startActivity(creationPunissement);
    }
}
