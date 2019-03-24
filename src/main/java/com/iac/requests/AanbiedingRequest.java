package com.iac.requests;

import java.sql.Date;

public class AanbiedingRequest {
private double prijs;
private Date beginDatum;
private Date eindDatum;
public double getPrijs() {
	return prijs;
}
public void setPrijs(double prijs) {
	this.prijs = prijs;
}
public Date getBeginDatum() {
	return beginDatum;
}
public void setBeginDatum(Date beginDatum) {
	this.beginDatum = beginDatum;
}
public Date getEindDatum() {
	return eindDatum;
}
public void setEindDatum(Date eindDatum) {
	this.eindDatum = eindDatum;
}


	

}
