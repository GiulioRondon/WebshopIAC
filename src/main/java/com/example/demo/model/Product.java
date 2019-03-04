package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    @JoinColumn(name = "product_id")
    private long productID;

    private String naam, omschrijving;
    private double prijs;

    @OneToMany(mappedBy= "productID")
    private List<Aanbieding> aanbiedingen = new ArrayList<>();
}
