package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "aanbieding")
public class Aanbieding {
	int id;
	Date vanDatum;
	Date totDatum;
}

