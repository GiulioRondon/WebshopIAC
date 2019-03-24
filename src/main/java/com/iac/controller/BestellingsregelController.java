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
import com.iac.model.Bestellingsregel;
import com.iac.requests.BestellingRequest;
import com.iac.requests.BestellingsregelRequest;
import com.iac.service.BestellingsregelService;

@RestController
@RequestMapping("/bestellingsregels")
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


    @SuppressWarnings("resource")
	@PostMapping("/create")
    public void saveBestellingsregel(@RequestBody BestellingsregelRequest request)throws ParseException {
    	Bestellingsregel bestellingsregel = new Bestellingsregel();
        bestellingsregel.setAantal(request.getAantal());
        bestellingsregel.setPrijs(request.getPrijs());
        
        bestellingsregelService.saveBestellingsregel(bestellingsregel);
    }
    }
