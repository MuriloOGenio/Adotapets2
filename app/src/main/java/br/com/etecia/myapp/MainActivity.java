package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa pessoa = new pessoa();

        pessoa.name = "Murilo";
        pessoa.email = "opa@eita";
        pessoa.idade = 59;
        pessoa.falar();
    }
}