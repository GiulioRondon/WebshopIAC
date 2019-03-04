package com.iac.model;

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

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getGebruikersnaam() {
		return gebruikersnaam;
	}

	public void setGebruikersnaam(String gebruikersnaam) {
		this.gebruikersnaam = gebruikersnaam;
	}

	public String getWachtwoord() {
		return wachtwoord;
	}

	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}

	public String getIsActief() {
		return isActief;
	}

	public void setIsActief(String isActief) {
		this.isActief = isActief;
	}

	public Date getRegistratieDatum() {
		return registratieDatum;
	}

	public void setRegistratieDatum(Date registratieDatum) {
		this.registratieDatum = registratieDatum;
	}

	public Adres getPersoonAdres() {
		return persoonAdres;
	}

	public void setPersoonAdres(Adres persoonAdres) {
		this.persoonAdres = persoonAdres;
	}

	public List<Bestelling> getBestellingen() {
		return bestellingen;
	}

	public void setBestellingen(List<Bestelling> bestellingen) {
		this.bestellingen = bestellingen;
	}
    
    
}
