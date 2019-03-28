package com.iac.service.implementatie;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iac.model.Categorie;
import com.iac.repository.CategorieRepo;
import com.iac.service.interfaces.CategorieService;

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

	@Override
	public Categorie findById(long id) {
		System.out.println(id);
		return categorieRepo.findById(id).get();
	}
}
