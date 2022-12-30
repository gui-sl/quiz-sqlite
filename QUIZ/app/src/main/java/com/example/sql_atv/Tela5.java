package com.example.sql_atv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela5 extends AppCompatActivity {

    EditText EditTextResposta5;
    Button buttonResponder5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);

        EditTextResposta5 = findViewById(R.id.EditTextResposta5);
        buttonResponder5 = findViewById(R.id.buttonResponder5);

        buttonResponder5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resposta = EditTextResposta5.getText().toString().trim();
                resposta = resposta.toLowerCase();


                if(resposta.equals("what if"))
                {
                    SeuJorge.contador++;

                    Toast.makeText(Tela5.this, "CORRETO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela5.this, Tela6.class);
                    startActivity(next);
                }
                else
                {
                    Toast.makeText(Tela5.this, "ERRADO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela5.this, Tela6.class);
                    startActivity(next);
                }
            }
        });
    }
}