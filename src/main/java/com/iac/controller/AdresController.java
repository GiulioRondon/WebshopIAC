package com.iac.controller;


import java.text.ParseException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.iac.model.Adres;
import com.iac.model.Bestelling;
import com.iac.requests.AdresRequest;
import com.iac.requests.BestellingRequest;
import com.iac.service.interfaces.AdresService;

@RestController
@RequestMapping("/adressen")
public class AdresController {
	private final AdresService adresService;
	
	public AdresController(AdresService adresservice) {
		this.adresService = adresservice;
	}

	@GetMapping
	public ResponseEntity getAdressen() {
		List<Adres> adressen = adresService.getAllAdressen();
		if (adressen == null) {
			return ResponseEntity.status(409).build();
		}
		
		return ResponseEntity.status(200).body(adressen);
	}
	

    @SuppressWarnings("resource")
	@PostMapping("/create")
    public void saveAdres(@RequestBody AdresRequest request)throws ParseException {
    	Adres adres = new Adres();
        adres.setHuisnummer(request.getHuisnummer());
        adres.setPostcode(request.getPostcode());
        adres.setStraat(request.getStraat());
        adres.setWoonplaats(request.getWoonplaats());
        adresService.saveAdres(adres);
    }

}

