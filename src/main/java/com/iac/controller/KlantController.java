package com.iac.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.iac.model.Bestelling;
import com.iac.model.Klant;
import com.iac.requests.BestellingRequest;
import com.iac.requests.KlantRequest;
import com.iac.service.KlantService;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/klanten")
public class KlantController {
    private final KlantService klantService;
    
    public KlantController(KlantService klantservice) {
    	this.klantService = klantservice;
    }

    @GetMapping
    public ResponseEntity getKlanten(){
        List<Klant> klanten = klantService.getAllKlanten();
        if (klanten == null) {
            return ResponseEntity.status(409).build();
        }

        return ResponseEntity.status(200).body(klanten);
    }


    @SuppressWarnings("resource")
	@PostMapping("/create")
    public void saveKlant(@RequestBody KlantRequest request)throws ParseException {
    	Klant klant = new Klant();
    	klant.setVoornaam(request.getVoornaam());
        klant.setAchternaam(request.getAchternaam());
       
        klantService.saveKlant(klant);
    }
}
