package com.ldnr.projetandroidcahierpunissement;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NouvellePunition extends AppCompatActivity {

    //TODO : alimenter la table Punition de la BDD au click sur Envoyer

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouvelle_punition);
        Resources res = getResources();
        TextView nouvellePunition = findViewById(R.id.nouvellePunition);
    }
}
