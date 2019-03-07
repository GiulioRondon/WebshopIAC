package com.iac.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.iac.model.Bestelling;
import com.iac.service.BestellingService;

public class BestellingController {
    private final BestellingService bestellingService;
    
    public BestellingController(BestellingService bestellingservice) {
    	this.bestellingService = bestellingservice;
    }

    @GetMapping
    public ResponseEntity getBestellingen(){
        List<Bestelling> bestellingen = bestellingService.getAllBestellingen();
        if (bestellingen == null) {
            return ResponseEntity.status(409).build();
        }

        return ResponseEntity.status(200).body(bestellingen);
    }

    @PostMapping
    public void saveBestelling(@RequestBody Bestelling bestelling){
        System.out.println(bestelling == null);
        BestellingService.saveBestelling(bestelling);
    }
}
