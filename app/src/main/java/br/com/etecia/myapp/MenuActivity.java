package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    MaterialCardView idmenuPets, idmenuRacoes, idmenuParceiros, idmenuLocalizar, idmenuDoacoes, idmenuServicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idmenuPets = findViewById(R.id.menuPets);
        idmenuRacoes = findViewById(R.id.menuRacoes);
        idmenuServicos = findViewById(R.id.menuServicos);
        idmenuParceiros = findViewById(R.id.menuParceiros);
        idmenuLocalizar = findViewById(R.id.menuLocalizar);
        idmenuDoacoes = findViewById(R.id.menuDoacoes);

        idmenuPets.setOnClickListener(this);
        idmenuParceiros.setOnClickListener(this);
        idmenuLocalizar.setOnClickListener(this);
        idmenuDoacoes.setOnClickListener(this);
        idmenuRacoes.setOnClickListener(this);
        idmenuServicos.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menuPets:
                startActivity(new Intent(getApplicationContext(), PetsActivity.class));
                break;
            case R.id.menuRacoes:
                startActivity(new Intent(getApplicationContext(), AlimentosActivity.class));
                break;
            case R.id.menuDoacoes:
                startActivity(new Intent(getApplicationContext(), DoacoesActivity.class));
                break;
            case R.id.menuParceiros:
                startActivity(new Intent(getApplicationContext(), ParceirosActivity.class));
                break;
            case R.id.menuLocalizar:
                startActivity(new Intent(getApplicationContext(), LocalizarActivity.class));
                break;
            case R.id.menuServicos:
                startActivity(new Intent(getApplicationContext(), ServicosActivity.class));
                break;


        }

    }
}