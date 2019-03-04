package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "adres")
public class Adres {
	int id;
	String straat;
	int straatnummer;
}
