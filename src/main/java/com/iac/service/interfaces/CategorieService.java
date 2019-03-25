package com.iac.service.interfaces;

import java.util.List;

import com.iac.model.Categorie;

public interface CategorieService {
	List<Categorie> findAll();
	
	Categorie findById(long id);
}
