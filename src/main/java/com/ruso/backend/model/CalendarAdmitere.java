package com.ruso.backend.model;

import java.util.List;

public class CalendarAdmitere {
    private final String sesiune;
    // front-end: pentru usurinta, [detalii] contine un o lista de String-uri pe care le puneti cu new lines
    // pe UI se pune direct sub [sesiune]
    private final List<String> detalii;

    public CalendarAdmitere(String sesiune, List<String> detalii) {
        this.sesiune = sesiune;
        this.detalii = detalii;
    }

    public String getSesiune() {
        return sesiune;
    }

    public List<String> getDetalii() {
        return detalii;
    }
}