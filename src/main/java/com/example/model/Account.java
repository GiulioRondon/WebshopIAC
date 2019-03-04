package com.example.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	int id;
	Date openDatum;
	String factuurAdres;
	Boolean isActief;
}
