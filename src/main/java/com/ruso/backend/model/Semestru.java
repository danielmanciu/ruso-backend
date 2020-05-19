package com.ruso.backend.model;

import java.util.List;

public class Semestru {
    private final int numar;
    private final List<Disciplina> disclipline;

    public Semestru(int numar, List<Disciplina> disclipline) {
        this.numar = numar;
        this.disclipline = disclipline;
    }

    public int getNumar() {
        return numar;
    }

    public List<Disciplina> getDisclipline() {
        return disclipline;
    }
}
