package com.ruso.backend.model;

import java.util.List;

public class InfoAbsolvireDisertatie {
    private final String domeniu;
    private final String specializare;
    // front-end: unele acte au link dupa ele, se pune din front-end ca sa evitam sa trimitem modele complicate
    private final List<Act> acteNecesare;

    public InfoAbsolvireDisertatie(String domeniu, String specializare, List<Act> acteNecesare) {
        this.domeniu = domeniu;
        this.specializare = specializare;
        this.acteNecesare = acteNecesare;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public String getSpecializare() {
        return specializare;
    }

    public List<Act> getActeNecesare() {
        return acteNecesare;
    }
}