package com.iac.service.implementatie;

import org.springframework.stereotype.Service;

import com.iac.model.Adres;
import com.iac.repository.AdresRepo;
import com.iac.service.interfaces.AdresService;

import java.util.List;

@Service
public class AdresServiceImpl implements AdresService {
	
	public final AdresRepo adresRepo;
	
	public AdresServiceImpl(AdresRepo adresRepo) {
		this.adresRepo = adresRepo;
	}
	
	@Override
	public List<Adres> getAllAdressen(){
		return adresRepo.findAll();
	}
	
	@Override
	public void saveAdres(Adres adres) {
		adresRepo.save(adres);
	}

}
