package com.example.sql_atv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {

    EditText EditTextNome;
    Button buttonIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        EditTextNome = findViewById(R.id.EditTextNome);
        buttonIniciar = findViewById(R.id.buttonIniciar);

        buttonIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SeuJorge.player = (EditTextNome.getText().toString());

                if(SeuJorge.player.equals(""))
                {
                    Toast.makeText(Inicio.this, "INSIRA UM NOME!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent next = new Intent(Inicio.this, Tela1.class);
                    startActivity(next);
                }
            }
        });

    }
}