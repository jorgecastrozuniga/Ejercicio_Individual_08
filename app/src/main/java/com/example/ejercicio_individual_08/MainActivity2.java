package com.example.ejercicio_individual_08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.ejercicio_individual_08.databinding.ActivityMain2Binding;
import com.example.ejercicio_individual_08.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    // Se declara una variable de tipo binding
    private ActivityMain2Binding abinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Se realiza inflacion a la vista de binding
        abinding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(abinding.getRoot());

        // Se declara intent
        Intent intento = getIntent();

        // Se realiza proceso: se pasan los datos
        abinding.botonvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        abinding.botonlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // se declara String con direccion web
                String web = "https://kotlindoc.blogspot.com/2019/10/android-log-con-timber.html";
                // Se declara un intent para que realice link con pagina
                Intent pagina = new Intent(Intent.ACTION_VIEW);
                pagina.setData(Uri.parse(web));
                startActivity(pagina);
            }
        });
    }
}