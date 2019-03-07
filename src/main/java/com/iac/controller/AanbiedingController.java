package com.iac.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iac.model.Aanbieding;
import com.iac.service.AanbiedingService;

@RestController
@RequestMapping("/aanbiedingen")
public class AanbiedingController {
    private final AanbiedingService aanbiedingService;
    
    public AanbiedingController(AanbiedingService aanbiedingService) {
    	this.aanbiedingService = aanbiedingService;
    }

    @GetMapping
    public ResponseEntity getKlanten(){
        List<Aanbieding> aanbiedingen = aanbiedingService.getAlleAanbiedingen();
        if (aanbiedingen == null) {
            return ResponseEntity.status(409).build();
        }

        return ResponseEntity.status(200).body(aanbiedingen);
    }

    @PostMapping
    public void saveKlant(@RequestBody Aanbieding aanbieding){
        System.out.println(aanbieding == null);
        aanbiedingService.saveAanbieding(aanbieding);;
    }
}
