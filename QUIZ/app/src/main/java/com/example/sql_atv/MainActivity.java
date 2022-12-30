package com.example.sql_atv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewJogador;
    Button buttonAdicionarNovo;
    ArrayList<SeuJorge> arrayListJogador;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewJogador = findViewById(R.id.listViewJogador);
        buttonAdicionarNovo = findViewById(R.id.buttonAdicionarNovo);
        result = findViewById(R.id.result);
        DaoRanking daoRanking = new DaoRanking(MainActivity.this);


        result.setText(SeuJorge.player + " SUA PONTUAÇÃO É: " + SeuJorge.contador);

        buttonAdicionarNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SeuJorge.player = "";
                SeuJorge.contador = 0;

                Intent inclusao = new Intent(MainActivity.this, Inicio.class);
                startActivity(inclusao);
            }
        });

        arrayListJogador = daoRanking.consultarTodos();

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayListJogador);

        listViewJogador.setAdapter(adapter);




    }
}