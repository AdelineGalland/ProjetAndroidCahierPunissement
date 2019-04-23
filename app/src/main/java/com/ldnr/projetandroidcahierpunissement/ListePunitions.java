package com.ldnr.projetandroidcahierpunissement;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// test git

public class ListePunitions extends AppCompatActivity {

    // Affiche les types de punitions, puis la liste des sous-types
    // Ligne clicable -> accès à fiche Punition
    // bouton nouvelle punition -> accès à NouvellePunition

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_punitions);
        Resources res = getResources();
        TextView listePunitions = findViewById(R.id.listePunitions);
    }

    protected void creerNouvellePunition (View view) {
        Intent creationPunition = new Intent(this, NouvellePunition.class);
        startActivity(creationPunition);
    }

    protected void editerPunitions(View view) {
        Intent editionPunitions = new Intent(this, FichePunition.class);
        startActivity(editionPunitions);
    }

    protected void consulterPunitions(View view) {
        Intent editionPunitions = new Intent(this, FichePunition.class);
        startActivity(editionPunitions);
    }
}