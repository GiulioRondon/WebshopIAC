package com.iac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bestelling")
public class Bestellingsregel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "bestellingsregel_id")
    private int id;

    private int aantal;
    private double prijs;

    @OneToOne
    @JoinColumn(name = "bestelling_id")
    private Bestelling bestellingID;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product productID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Bestelling getBestellingID() {
		return bestellingID;
	}

	public void setBestellingID(Bestelling bestellingID) {
		this.bestellingID = bestellingID;
	}

	public Product getProductID() {
		return productID;
	}

	public void setProductID(Product productID) {
		this.productID = productID;
	}
    
    
}
