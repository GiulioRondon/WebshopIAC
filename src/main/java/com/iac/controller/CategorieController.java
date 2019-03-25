package com.iac.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iac.model.Adres;
import com.iac.model.Categorie;
import com.iac.service.interfaces.CategorieService;

@RestController
@RequestMapping("/categories")
public class CategorieController {
	private final CategorieService categorieService;
	
	public CategorieController(CategorieService categorieCService) {
		this.categorieService = categorieCService;
	}
	
	@GetMapping
	public ResponseEntity getCategories() {
		List<Categorie> categories = categorieService.findAll();
		if (categories == null) {
			return ResponseEntity.status(409).build();
		}
		
		return ResponseEntity.status(200).body(categories);
	}
}
