package com.ruso.backend.model;

import static com.ruso.backend.data.Constants.EMPTY_STRING;

public class Act {
    private final String nume;
    private final String model; // front-end: se pune in paranteza dupa nume
    private final String linkModel; // front-end: link-ul de aici se ataseaza la model

    public Act(String nume) {
        this.nume = nume;
        this.model = EMPTY_STRING;
        this.linkModel = EMPTY_STRING;
    }

    public Act(String nume, String model, String linkModel) {
        this.nume = nume;
        this.model = model;
        this.linkModel = linkModel;
    }

    public String getNume() {
        return nume;
    }

    public String getModel() {
        return model;
    }

    public String getLinkModel() {
        return linkModel;
    }
}