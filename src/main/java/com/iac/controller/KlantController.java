package com.iac.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.iac.model.Klant;
import com.iac.service.KlantService;

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

    @PostMapping
    public void saveKlant(@RequestBody Klant klant){
        System.out.println(klant == null);
        klantService.saveKlant(klant);
    }
}
