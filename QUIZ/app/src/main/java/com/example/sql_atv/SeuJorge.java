package com.example.sql_atv;

import androidx.annotation.NonNull;

public class SeuJorge {
    private String nome;
    private int pontos;
    public static int contador;
    public static String player;

    public SeuJorge(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;;
    }

    public SeuJorge(){

    }

    @NonNull
    @Override
    public String toString(){
        return nome + " - " + pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

}
