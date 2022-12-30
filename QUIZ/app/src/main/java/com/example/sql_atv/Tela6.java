package com.example.sql_atv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela6 extends AppCompatActivity {

    EditText EditTextResposta6;
    Button buttonResponder6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);

        EditTextResposta6 = findViewById(R.id.EditTextResposta6);
        buttonResponder6 = findViewById(R.id.buttonResponder6);

        buttonResponder6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resposta = EditTextResposta6.getText().toString().trim();
                resposta = resposta.toLowerCase();

                if(resposta.equals("you"))
                {
                    SeuJorge.contador++;

                    Toast.makeText(Tela6.this, "CORRETO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela6.this, Tela7.class);
                    startActivity(next);
                }
                else
                {
                    Toast.makeText(Tela6.this, "ERRADO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela6.this, Tela7.class);
                    startActivity(next);
                }
            }
        });
    }
}