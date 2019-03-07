package com.iac.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.iac.model.Bestellingsregel;
import com.iac.service.BestellingsregelService;

public class BestellingsregelController {
    private final BestellingsregelService bestellingsregelService;
    
    public BestellingsregelController(BestellingsregelService bestellingsregelservice) {
    	this.bestellingsregelService = bestellingsregelservice;
    }

    @GetMapping
    public ResponseEntity getBestellingsregelen(){
        List<Bestellingsregel> bestellingsregels = bestellingsregelService.getAllBestellingsregels();
        if (bestellingsregels == null) {
            return ResponseEntity.status(409).build();
        }

        return ResponseEntity.status(200).body(bestellingsregels);
    }

    @PostMapping
    public void saveBestellingsregel(@RequestBody Bestellingsregel bestellingsregel){
        System.out.println(bestellingsregel == null);
        bestellingsregelService.saveBestellingsregel(bestellingsregel);
    }
}
