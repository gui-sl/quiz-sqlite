package com.example.sql_atv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela8 extends AppCompatActivity {

    EditText EditTextResposta8;
    Button buttonResponder8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela8);

        EditTextResposta8 = findViewById(R.id.EditTextResposta8);
        buttonResponder8 = findViewById(R.id.buttonResponder8);

        buttonResponder8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resposta = EditTextResposta8.getText().toString().trim();
                resposta = resposta.toLowerCase();

                if(resposta.equals("peaky blinders"))
                {
                    SeuJorge.contador++;

                    Toast.makeText(Tela8.this, "CORRETO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela8.this, Tela9.class);
                    startActivity(next);
                }
                else
                {
                    Toast.makeText(Tela8.this, "ERRADO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela8.this, Tela9.class);
                    startActivity(next);
                }
            }
        });
    }
}