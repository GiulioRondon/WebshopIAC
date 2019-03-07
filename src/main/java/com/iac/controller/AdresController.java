package com.iac.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.iac.model.Adres;
import com.iac.service.AdresService;

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
	
	@PostMapping
	public void saveAdres(@RequestBody Adres adres) {

}
}
