package com.ruso.backend.model;

public class Regulament {
    public Regulament(String titlu, String subtitlu, String descriere, String linkMaiMulte) {
        this.titlu = titlu;
        this.subtitlu = subtitlu;
        this.descriere = descriere;
        this.linkMaiMulte = linkMaiMulte;
    }

    private String titlu;
    private String subtitlu;
    private String descriere;
    private String linkMaiMulte;
}
