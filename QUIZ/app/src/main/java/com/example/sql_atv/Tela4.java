package com.example.sql_atv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela4 extends AppCompatActivity {

    EditText EditTextResposta4;
    Button buttonResponder4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        EditTextResposta4 = findViewById(R.id.EditTextResposta4);
        buttonResponder4 = findViewById(R.id.buttonResponder4);

        buttonResponder4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resposta = EditTextResposta4.getText().toString().trim();
                resposta = resposta.toLowerCase();

                if(resposta.equals("the 100"))
                {
                    SeuJorge.contador++;

                    Toast.makeText(Tela4.this, "CORRETO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela4.this, Tela5.class);
                    startActivity(next);
                }
                else
                {
                    Toast.makeText(Tela4.this, "ERRADO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela4.this, Tela5.class);
                    startActivity(next);
                }
            }
        });
    }
}