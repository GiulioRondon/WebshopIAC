package com.iac.requests;

import java.sql.Date;

public class BestellingRequest {
	//bestelling
	private Date bestelDatum;
	private Long adresID;
	private Long klantID;
	//adres
	private String straat;
	private int huisnummer;
	private String postcode;
	//bestellingsregel
	private int aantal;
	private double prijs;
	//klant
	private String voornaam;
	private String achternaam;
	
	public int getAantal() {
		return aantal;
	}

	public void setAantal(int aantal) {
		this.aantal = aantal;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
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

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public int getHuisnummer() {
		return huisnummer;
	}

	public void setHuisnummer(int huisnummer) {
		this.huisnummer = huisnummer;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getWoonplaats() {
		return woonplaats;
	}

	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}

	private String woonplaats;
	
	

	public Date getBestelDatum() {
		return bestelDatum;
	}

	public void setBestelDatum(Date bestelDatum) {
		this.bestelDatum = bestelDatum;
	}

	public Long getAdresID() {
		return adresID;
	}

	public void setAdresID(Long adresID) {
		this.adresID = adresID;
	}

	public Long getKlantID() {
		return klantID;
	}

	public void setKlantID(Long klantID) {
		this.klantID = klantID;
	}
	
	
	
	
	

}
