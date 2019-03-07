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

	public long getKlantID() {
		return klantID;
	}

	public void setKlantID(long klantID) {
		this.klantID = klantID;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
    
    
}
