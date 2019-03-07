package com.iac.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iac.model.Product;
import com.iac.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	public final ProductRepo bestellingsregelRepo;
	
	public ProductServiceImpl(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}
	
	@Override
	public List<Product> getAllProducten(Product product){
		productRepo.findAll();
	}
	
	@Override
	public void saveProduct(Product product) {
		productRepo.save(product);
	}
}
