package com.iac.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iac.model.Adres;
import com.iac.model.Bestelling;
import com.iac.model.Bestellingsregel;
import com.iac.model.Klant;
import com.iac.requests.BestellingRequest;

import com.iac.service.interfaces.KlantService;
import com.iac.service.interfaces.AanbiedingService;
import com.iac.service.interfaces.AdresService;

import com.iac.service.interfaces.BestellingService;
import com.iac.service.interfaces.BestellingsregelService;

@RestController
@RequestMapping("/bestellingen")
public class BestellingController {
	private final AdresService adresService;
	private final KlantService klantService;
	private final BestellingsregelService bestellingsRegelService;
    private final BestellingService bestellingService;
    private final AanbiedingService aanbiedingService;
    

    public BestellingController(AdresService adresService, KlantService klantService, BestellingsregelService bestellingsRegelService, BestellingService bestellingService, AanbiedingService aanbiedingService) {
    	this.adresService = adresService;
    	this.klantService = klantService;
    	this.bestellingsRegelService = bestellingsRegelService;
    	this.bestellingService = bestellingService;
    	this.aanbiedingService = aanbiedingService;
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
    	
    	bestelling
    	
        bestelling.setBestelDatum(request.getBestelDatum());
        bestellingService.saveBestelling(bestelling);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteBestelling(@PathVariable Long id) {
        bestellingService.deleteBestelling(id);
        aanbiedingService.deleteByProduct(id);
    }

}
