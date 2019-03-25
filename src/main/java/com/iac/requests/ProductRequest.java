package com.iac.requests;

public class ProductRequest {
	private String naam;
	private double prijs;
	private String beschrijving;
	private String afbeelding;
	private int categorieId;
	
	public String getAfbeelding() {
		return afbeelding;
	}
	public void setAfbeelding(String afbeelding) {
		this.afbeelding = afbeelding;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public double getPrijs() {
		return prijs;
	}
	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}
	public String getBeschrijving() {
		return beschrijving;
	}
	public void setBeschrijving(String beschrijving) {
		this.beschrijving = beschrijving;
	}
	public int getCategorieId() {
		return categorieId;
	}
	public void setCategorieId(int categorieId) {
		this.categorieId = categorieId;
	}
}
