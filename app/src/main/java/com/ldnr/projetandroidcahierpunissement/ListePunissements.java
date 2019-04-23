package com.ldnr.projetandroidcahierpunissement;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ListePunissements extends AppCompatActivity {

    // Affiche liste par ordre ante-chronologique
    // afficher date, type, collectif ou nom du stagiaire
    // Possibilité de sélectionner "en cours" ou "terminé"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_punissements);
        Resources res = getResources();
        TextView listePunissements = findViewById(R.id.listePunissements);
    }

    protected void creerNouveauPunissement (View view) {
        Intent creationPunissement = new Intent(this, NouveauPunissement.class);
        startActivity(creationPunissement);
    }

    protected void editerPunissement(View view) {
        Intent editionPunissement = new Intent(this, FichePunissement.class);
        startActivity(editionPunissement);
    }

    protected void consulterPunissement(View view) {
        Intent editionPunissement = new Intent(this, FichePunissement.class);
        startActivity(editionPunissement);
    }
}
