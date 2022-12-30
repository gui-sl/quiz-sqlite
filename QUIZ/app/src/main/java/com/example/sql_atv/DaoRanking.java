package com.example.sql_atv;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DaoRanking extends SQLiteOpenHelper {
    private final String TABELA = "TB_JOGADOR";

    public DaoRanking(@Nullable Context context) {
        super(context,  "DB_JOGADOR", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String comando = "CREATE TABLE " + TABELA +" (" +
                "NOME VARCHAR(100)," +
                "IDADE VARCHAR(2) NOT NULL)";

        sqLiteDatabase.execSQL(comando);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public long adicionar(SeuJorge jogador){
        ContentValues values = new ContentValues();
        values.put("NOME", jogador.getNome());
        values.put("IDADE", jogador.getPontos());

        return getWritableDatabase().insert(TABELA, null, values);

    }

    public ArrayList<SeuJorge> consultarTodos(){
        String comando = "SELECT * FROM " + TABELA + " ORDER BY IDADE DESC LIMIT 5";
        Cursor cursor = getWritableDatabase().rawQuery(comando,null);
        ArrayList<SeuJorge> arrayListJogador = new ArrayList<>();

        while (cursor.moveToNext()){
            SeuJorge seuJorge = new SeuJorge();
            seuJorge.setNome(cursor.getString(1));
            seuJorge.setPontos(cursor.getInt(2));
            arrayListJogador.add(seuJorge);
        }

        return arrayListJogador;
    }
}
