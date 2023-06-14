package com.example.ejercicio_individual_08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ejercicio_individual_08.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Se declara una variable de tipo binding
    private ActivityMainBinding vbinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se realiza inflacion a la vista de binding
        vbinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(vbinding.getRoot());

        // Se declara Intent
        Intent intento = getIntent();

        // proceso: Se pasan los datos
        vbinding.botoningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intento);
            }
        });

        vbinding.botoncerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity(); // En las pruebas realizadas, con onDestroy me cierra al segundo click
                             // Se cambia por FinishAffinity(); para cerrar la app con un click.
            }
        });
    }
}