package com.iac.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iac.model.Categorie;
import com.iac.repository.CategorieRepo;

@Service
public class CategorieServiceImpl implements CategorieService {
	private final CategorieRepo categorieRepo;
	
	public CategorieServiceImpl(CategorieRepo categorieRepo) {
		this.categorieRepo = categorieRepo;
	}
	
	@Override
	public List<Categorie> findAll() {
		return categorieRepo.findAll();
	}

}
