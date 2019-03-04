package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "account_id")
    private int ID;

    private String gebruikersnaam, wachtwoord, isActief;
    private Date registratieDatum;

    @JoinColumn(name = "adres_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Adres persoonAdres;

    @OneToMany(mappedBy = "accountID")
    private List<Bestelling> bestellingen;
}
