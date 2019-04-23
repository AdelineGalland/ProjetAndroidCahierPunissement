package com.ldnr.projetandroidcahierpunissement;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FichePunition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_punition);

        Resources res = getResources();
        TextView fichePunition = findViewById(R.id.fiche_punition);
    }
}
