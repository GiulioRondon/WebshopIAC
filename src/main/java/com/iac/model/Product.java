package com.iac.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    @JoinColumn(name = "product_id")
    private long productID;

    private String naam, omschrijving;
    private double prijs;

    @OneToMany(mappedBy= "productID")
    private List<Aanbieding> aanbiedingen = new ArrayList<>();
    
    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "product_categories",
            joinColumns = {@JoinColumn(name = "product_id")},
            inverseJoinColumns = {@JoinColumn(name = "categories_id")}
    )
    private List<Categorie> categories = new ArrayList<>();

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	public List<Aanbieding> getAanbiedingen() {
		return aanbiedingen;
	}

	public void setAanbiedingen(List<Aanbieding> aanbiedingen) {
		this.aanbiedingen = aanbiedingen;
	}
    
    
}
