package com.example.sql_atv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela1 extends AppCompatActivity {

    EditText EditTextResposta;
    Button buttonResponder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        EditTextResposta = findViewById(R.id.EditTextResposta);
        buttonResponder = findViewById(R.id.buttonResponder);

        buttonResponder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resposta = EditTextResposta.getText().toString().trim();
                resposta = resposta.toLowerCase();

                if(resposta.equals("rick and morty"))
                {

                    SeuJorge.contador++;

                    Toast.makeText(Tela1.this, "CORRETO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela1.this, Tela2.class);
                    startActivity(next);
                }
                else
                {
                    Toast.makeText(Tela1.this, "ERRADO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela1.this, Tela2.class);
                    startActivity(next);
                }
            }
        });
    }
}