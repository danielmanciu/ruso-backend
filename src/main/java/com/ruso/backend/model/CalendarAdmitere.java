package com.ruso.backend.model;

import java.util.List;

public class CalendarAdmitere {
    private final String sesiune;
    // front-end: pentru usurinta, [detalii] contine un String mare cu new lines; pe UI se pune direct sub [sesiune]
    private final String detalii;

    public CalendarAdmitere(String sesiune, String detalii) {
        this.sesiune = sesiune;
        this.detalii = detalii;
    }
}