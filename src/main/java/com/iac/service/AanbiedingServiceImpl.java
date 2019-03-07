package com.iac.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iac.model.Aanbieding;
import com.iac.repository.AanbiedingRepo;

@Service
public class AanbiedingServiceImpl implements AanbiedingService {
	
	public final AanbiedingRepo aanbiedingRepo;
	
	public AanbiedingServiceImpl(AanbiedingRepo aanbiedingRepo) {
		this.aanbiedingRepo = aanbiedingRepo;
	}
	
	@Override
	public List<Aanbieding> getAlleAanbiedingen(){
		return aanbiedingRepo.findAll();
	}
	
	@Override
	public void saveAanbieding(Aanbieding aanbieding) {
		aanbiedingRepo.save(aanbieding);
	}

}
