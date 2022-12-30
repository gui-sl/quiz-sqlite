package com.example.sql_atv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class INCLUSAOActivity extends AppCompatActivity {
    EditText editTextNome, editTextIdade, editTextAltura, editTexNacionalidade, editTextTime;
    Button buttonAdicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inclusaoactivity);
        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        editTextAltura = findViewById(R.id.editTextAltura);
        editTexNacionalidade = findViewById(R.id.editTexNacionalidade);
        editTextTime = findViewById(R.id.editTextTime);
        buttonAdicionar = findViewById(R.id.buttonAdicionar);

        buttonAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SeuJorge seuJorge = new SeuJorge();
                seuJorge.setNome(editTextNome.getText().toString());
                seuJorge.setPontos(Integer.parseInt(editTextIdade.getText().toString()));

                DaoRanking daoRanking = new DaoRanking(INCLUSAOActivity.this);
                try {
                    long linhasAdicionadas = daoRanking.adicionar(seuJorge);
                    if(linhasAdicionadas>0){
                        Toast.makeText(INCLUSAOActivity.this, "Inserido com sucesso", Toast.LENGTH_SHORT).show();
                        Intent main = new Intent(INCLUSAOActivity.this, MainActivity.class);
                        startActivity(main);
                    }
                    else{
                        Toast.makeText(INCLUSAOActivity.this, "Não foi possível inserir. Motivo: MISTÉRIO TOTAL!", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception ex) {
                    Toast.makeText(INCLUSAOActivity.this, "Erro ao inserir", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}