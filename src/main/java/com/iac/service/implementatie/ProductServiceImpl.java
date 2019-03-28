package com.iac.service.implementatie;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.iac.model.Categorie;
import com.iac.model.Product;
import com.iac.repository.CategorieRepo;
import com.iac.repository.ProductRepo;
import com.iac.service.interfaces.ProductService;

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
		/*Optional<Categorie> obj =  categorieRepo.findById(id);*/
		/*return obj.get().getProducten();*/
		return productRepo.findByCategorieId(id);
	}
	
	@Override
	public Product getByID(long id) {
		Optional<Product> obj =  productRepo.findById(id);;
		return obj.get();
	}
	
	@Override
	public void deleteProduct(long id) {
		productRepo.delete(productRepo.findById(id).get());
	}
}