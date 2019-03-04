package com.iac.model;

import javax.persistence.*;
@Entity
public class Klant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "klant_id")
    private long klantID;
    private String voornaam, achternaam;

    @JoinColumn(name = "adres_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Adres adres;

    @JoinColumn(name = "account_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;
}
