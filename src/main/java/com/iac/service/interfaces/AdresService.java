package com.iac.service.interfaces;

import java.util.List;

import com.iac.model.Adres;
import com.iac.model.Product;

public interface AdresService {
	List<Adres> getAllAdressen();
	
	void saveAdres(Adres adres);
	
	Adres getByID(long id);
}
