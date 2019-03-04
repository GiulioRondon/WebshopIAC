package com.iac.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aanbieding")
public class Aanbieding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "aanbieding_id")
    private int ID;

    private double prijs;
    private Date beginDatum;
    private Date eindDatum;
    @JoinColumn(name = "product_id")
    @OneToOne
    private Product productID;
}

