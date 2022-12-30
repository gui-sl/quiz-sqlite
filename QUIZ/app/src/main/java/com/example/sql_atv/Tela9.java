package com.example.sql_atv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela9 extends AppCompatActivity {

    EditText EditTextResposta9;
    Button buttonResponder9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela9);

        EditTextResposta9 = findViewById(R.id.EditTextResposta9);
        buttonResponder9 = findViewById(R.id.buttonResponder9);

        buttonResponder9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resposta = EditTextResposta9.getText().toString().trim();
                resposta = resposta.toLowerCase();

                if(resposta.equals("stranger things"))
                {
                    SeuJorge.contador++;

                    Toast.makeText(Tela9.this, "CORRETO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela9.this, Tela10.class);
                    startActivity(next);
                }
                else
                {
                    Toast.makeText(Tela9.this, "ERRADO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela9.this, Tela10.class);
                    startActivity(next);
                }
            }
        });
    }
}