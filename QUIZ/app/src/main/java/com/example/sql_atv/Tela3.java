package com.example.sql_atv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela3 extends AppCompatActivity {

    EditText EditTextResposta3;
    Button buttonResponder3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        EditTextResposta3 = findViewById(R.id.EditTextResposta3);
        buttonResponder3 = findViewById(R.id.buttonResponder3);

        buttonResponder3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resposta = EditTextResposta3.getText().toString().trim();
                resposta = resposta.toLowerCase();

                if(resposta.equals("lupin"))
                {
                    SeuJorge.contador++;

                    Toast.makeText(Tela3.this, "CORRETO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela3.this, Tela4.class);
                    startActivity(next);
                }
                else
                {
                    Toast.makeText(Tela3.this, "ERRADO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela3.this, Tela4.class);
                    startActivity(next);
                }
            }
        });
    }
}