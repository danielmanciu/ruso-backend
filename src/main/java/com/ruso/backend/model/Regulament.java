package com.ruso.backend.model;

public class Regulament {
    private final String titlu;
    private final String subtitlu;
    private final String descriere;
    private final String linkMaiMulte;

    public Regulament(String titlu, String subtitlu, String descriere, String linkMaiMulte) {
        this.titlu = titlu;
        this.subtitlu = subtitlu;
        this.descriere = descriere;
        this.linkMaiMulte = linkMaiMulte;
    }
}