package com.ruso.backend.model;

public class CalendarAdmitere {
    private final String sesiune;
    // front-end: pentru usurinta, [detalii] contine un String mare cu new lines; pe UI se pune direct sub [sesiune]
    private final String detalii;

    public CalendarAdmitere(String sesiune, String detalii) {
        this.sesiune = sesiune;
        this.detalii = detalii;
    }

    public String getSesiune() {
        return sesiune;
    }

    public String getDetalii() {
        return detalii;
    }
}