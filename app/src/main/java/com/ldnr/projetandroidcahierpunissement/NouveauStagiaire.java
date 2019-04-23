package com.ldnr.projetandroidcahierpunissement;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NouveauStagiaire extends AppCompatActivity {

    //Demander nom, prénom, tel, mail
    //Sélectionner groupe si déjà existant
    //TODO : alimenter la table Stagiaires de la BDD
    //TODO : alimenter la table Groupe de la BDD au click sur Envoyer

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouveau_stagiaire);
        Resources res = getResources();
        TextView nouveauStagiaire = findViewById(R.id.nouveauStagiaire);
    }
}
