package com.iac.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iac.model.Bestelling;
import com.iac.requests.BestellingRequest;
import com.iac.service.BestellingService;

@RestController
@RequestMapping("/bestellingen")
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

    @SuppressWarnings("resource")
	@PostMapping("/create")
    public void saveBestelling(@RequestBody BestellingRequest request)throws ParseException {
    	Bestelling bestelling = new Bestelling();
        bestelling.setBestelDatum(request.getBestelDatum());
        bestellingService.saveBestelling(bestelling);
    }
}
