package com.iac.requests;

import java.sql.Date;

public class BestellingRequest {
	private Date bestelDatum;
	private Long adresID;
	private Long klantID;

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
