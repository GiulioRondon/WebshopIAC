package com.iac.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bestelling")
public class Bestelling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "bestelling_id")
    private int id;

    private Date bestelDatum;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account accountID;

    @JoinColumn(name = "adres_id")
    @OneToOne
    private Adres afleverAdres;

    @OneToMany(mappedBy = "bestellingID")
    private List<Bestellingsregel> bestellingsregels = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBestelDatum() {
		return bestelDatum;
	}

	public void setBestelDatum(Date bestelDatum) {
		this.bestelDatum = bestelDatum;
	}

	public Account getAccountID() {
		return accountID;
	}

	public void setAccountID(Account accountID) {
		this.accountID = accountID;
	}

	public Adres getAfleverAdres() {
		return afleverAdres;
	}

	public void setAfleverAdres(Adres afleverAdres) {
		this.afleverAdres = afleverAdres;
	}

	public List<Bestellingsregel> getBestellingsregels() {
		return bestellingsregels;
	}

	public void setBestellingsregels(List<Bestellingsregel> bestellingsregels) {
		this.bestellingsregels = bestellingsregels;
	}
    
    
}
