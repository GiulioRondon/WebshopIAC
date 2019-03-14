package com.iac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.iac.model.Categorie;
import com.iac.model.Product;
import com.iac.repository.CategorieRepo;
import com.iac.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	public final ProductRepo productRepo;
	
	public final CategorieRepo categorieRepo;
	
	public ProductServiceImpl(ProductRepo productRepo, CategorieRepo categorieRepo) {
		this.productRepo = productRepo;
		this.categorieRepo = categorieRepo;
	}
	
	@Override
	public List<Product> getAllProducten(){	
		return productRepo.findAll();
	}
	
	@Override
	public void saveProduct(Product product) {
		productRepo.save(product);
	}
	
	@Override
	public List<Product> getByCategorie(long id) {
		Optional<Categorie> obj =  categorieRepo.findById(id);
		return obj.get().getProducten();
	}
}