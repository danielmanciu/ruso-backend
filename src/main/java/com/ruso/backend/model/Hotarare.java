package com.ruso.backend.model;

public class Hotarare {
    private final String hotarator;
    private final String data;
    private final String nume;
    private final String link;
    private final String infoAditional;

    public Hotarare(String hotarator, String data, String nume, String link, String infoAditional) {
        this.hotarator = hotarator;
        this.data = data;
        this.nume = nume;
        this.link = link;
        this.infoAditional = infoAditional;
    }

    public String getHotarator() {
        return hotarator;
    }

    public String getData() {
        return data;
    }

    public String getNume() {
        return nume;
    }

    public String getLink() {
        return link;
    }

    public String getInfoAditional() {
        return infoAditional;
    }
}