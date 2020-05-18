package com.ruso.backend.model;

import java.util.List;

public class InfoAbsolvireDisertatie {
    private final String domeniu;
    private final String specializare;
    private final String detaliiSustinereDisertatie;
    private final List<Act> acteNecesare;

    public InfoAbsolvireDisertatie(String domeniu, String specializare, String detaliiSustinereDisertatie, List<Act> acteNecesare) {
        this.domeniu = domeniu;
        this.specializare = specializare;
        this.detaliiSustinereDisertatie = detaliiSustinereDisertatie;
        this.acteNecesare = acteNecesare;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public String getSpecializare() {
        return specializare;
    }

    public String getDetaliiSustinereDisertatie() {
        return detaliiSustinereDisertatie;
    }

    public List<Act> getActeNecesare() {
        return acteNecesare;
    }
}