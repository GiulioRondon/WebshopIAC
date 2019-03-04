package com.example.demo.model;

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
}
