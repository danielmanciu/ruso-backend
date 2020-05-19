package com.ruso.backend.model;

public class Disciplina {
    private final String cod;
    private final String nume;

    public Disciplina(String cod, String nume) {
        this.cod = cod;
        this.nume = nume;
    }

    public String getCod() {
        return cod;
    }

    public String getNume() {
        return nume;
    }
}