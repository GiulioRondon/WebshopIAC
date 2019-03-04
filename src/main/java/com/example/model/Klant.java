package com.example.model;

import javax.persistence.*;

@Entity
public class Klant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "klant_id")
    private Long klantid;


    private String naam, achternaam;

    public Long getKlantid() {
        return klantid;
    }

    public void setKlantid(Long klantid) {
        this.klantid = klantid;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
}
