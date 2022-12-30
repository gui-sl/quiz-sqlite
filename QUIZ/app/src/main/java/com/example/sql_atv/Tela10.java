package com.example.sql_atv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tela10 extends AppCompatActivity {

    TextView EditTextResposta10;
    Button buttonResponder10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela10);

        EditTextResposta10 = findViewById(R.id.EditTextResposta10);
        buttonResponder10 = findViewById(R.id.buttonResponder10);

        buttonResponder10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resposta = EditTextResposta10.getText().toString().trim();
                SeuJorge seuJorge = new SeuJorge();

                seuJorge.setNome(SeuJorge.player);
                DaoRanking daoRanking = new DaoRanking(Tela10.this);

                resposta = resposta.toLowerCase();

                if(resposta.equals("irmandade"))
                {
                    SeuJorge.contador++;
                    seuJorge.setPontos(SeuJorge.contador);
                    daoRanking.adicionar(seuJorge);
                    Intent next = new Intent(Tela10.this, MainActivity.class);
                    startActivity(next);
                }
                else
                {
                    daoRanking.adicionar(seuJorge);
                    Toast.makeText(Tela10.this, "ERRADO", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Tela10.this, MainActivity.class);
                    startActivity(next);
                }
            }
        });
    }
}