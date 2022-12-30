package com.example.sql_atv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela7 extends AppCompatActivity {

    EditText EditTextResposta7;
    Button buttonResponder7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela7);

        EditTextResposta7 = findViewById(R.id.EditTextResposta7);
        buttonResponder7 = findViewById(R.id.buttonResponder7);

        buttonResponder7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resposta = EditTextResposta7.getText().toString().trim();
                resposta = resposta.toLowerCase();

                if(resposta.equals("the boys"))
                {
                    SeuJorge.contador++;

                    Toast.makeText(Tela7.this, "CORRETO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela7.this, Tela8.class);
                    startActivity(next);
                }
                else
                {
                    Toast.makeText(Tela7.this, "ERRADO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela7.this, Tela8.class);
                    startActivity(next);
                }
            }
        });
    }
}