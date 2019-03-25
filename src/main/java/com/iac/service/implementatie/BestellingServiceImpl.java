package com.iac.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iac.model.Bestelling;
import com.iac.repository.BestellingRepo;

@Service
public class BestellingServiceImpl implements BestellingService{
	public final BestellingRepo bestellingRepo;
	
	public BestellingServiceImpl(BestellingRepo bestellingRepo) {
		this.bestellingRepo = bestellingRepo;
	}
	
	@Override
	public List<Bestelling> getAllBestellingen(){
		return bestellingRepo.findAll();
	}
	
	@Override 
	public void saveBestelling(Bestelling bestelling) {
		bestellingRepo.save(bestelling);
	}

}
