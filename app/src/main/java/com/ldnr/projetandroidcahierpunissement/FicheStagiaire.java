package com.ldnr.projetandroidcahierpunissement;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FicheStagiaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_stagiaire);

        Resources res = getResources();
        TextView ficheStagiaire = findViewById(R.id.fiche_stagiaire);
    }
}
