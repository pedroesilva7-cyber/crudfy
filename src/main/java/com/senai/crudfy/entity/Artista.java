package com.senai.crudfy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Artista {
    @Id
private int id;
private String nome;
private String genero;


    public Artista(){}

    public Artista(int id, String nome, String genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
