package com.ldnr.projetandroidcahierpunissement;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FicheGroupe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_groupe);

        Resources res = getResources();
        TextView ficheGroupe = findViewById(R.id.fiche_groupe);
    }
}
