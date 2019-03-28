package com.iac.service.interfaces;

import java.util.List;

import com.iac.model.Bestelling;

public interface BestellingService {
	List<Bestelling> getAllBestellingen();
	
	void saveBestelling(Bestelling bestelling);
}
