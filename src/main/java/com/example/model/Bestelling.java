package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bestelling")
public class Bestelling {
	int id;
	String afleverAdres;
}
