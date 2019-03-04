package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bestelling")
public class Bestellingsregel {
	int id;
	int aantal;
	double prijs;
}
