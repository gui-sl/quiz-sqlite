package com.example.sql_atv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela2 extends AppCompatActivity {

    EditText EditTextResposta2;
    Button buttonResponder2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        EditTextResposta2 = findViewById(R.id.EditTextResposta2);
        buttonResponder2 = findViewById(R.id.buttonResponder2);

        buttonResponder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resposta = EditTextResposta2.getText().toString().trim();
                resposta = resposta.toLowerCase();

                if(resposta.equals("black mirror"))
                {
                    SeuJorge.contador++;

                    Toast.makeText(Tela2.this, "CORRETO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela2.this, Tela3.class);
                    startActivity(next);
                }
                else
                {
                    Toast.makeText(Tela2.this, "ERRADO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela2.this, Tela3.class);
                    startActivity(next);
                }
            }
        });
    }
}