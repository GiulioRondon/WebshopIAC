package com.iac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iac.model.Aanbieding;
import com.iac.model.Categorie;
import com.iac.model.Product;
import com.iac.repository.AanbiedingRepo;
import com.iac.repository.ProductRepo;

@Service
public class AanbiedingServiceImpl implements AanbiedingService {
	
	public final AanbiedingRepo aanbiedingRepo;
	public final ProductRepo productRepo;

	public AanbiedingServiceImpl(AanbiedingRepo aanbiedingRepo, ProductRepo productRepo) {
		this.aanbiedingRepo = aanbiedingRepo;
		this.productRepo = productRepo;
	}
	
	@Override
	public List<Aanbieding> getAlleAanbiedingen(){
		return aanbiedingRepo.findAll();
	}
	
	@Override
	public void saveAanbieding(Aanbieding aanbieding) {
		aanbiedingRepo.save(aanbieding);
	}
	
	@Override
	public Aanbieding getByProduct(long id) {
		Aanbieding returnObj = null;
		Optional<Product> obj =  productRepo.findById(id);
		for (Aanbieding a : aanbiedingRepo.findAll()) {
			if (a.getProductID() == obj.get()) {
				returnObj = a;
			}
		}
		return returnObj;
	}

}
