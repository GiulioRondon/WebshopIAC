package com.iac.service.interfaces;

import java.util.List;

import com.iac.model.Adres;

public interface AdresService {
	List<Adres> getAllAdressen();
	
	void saveAdres(Adres adres);
}
