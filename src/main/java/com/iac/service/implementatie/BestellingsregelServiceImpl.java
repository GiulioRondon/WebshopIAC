package com.iac.service.implementatie;

import java.util.List;

import org.springframework.stereotype.Service;

import com.iac.model.Bestellingsregel;
import com.iac.repository.BestellingsregelRepo;
import com.iac.service.interfaces.BestellingsregelService;

@Service
public class BestellingsregelServiceImpl implements BestellingsregelService{
	
	public final BestellingsregelRepo bestellingsregelRepo;
	
	public BestellingsregelServiceImpl(BestellingsregelRepo bestellingsregelRepo) {
		this.bestellingsregelRepo = bestellingsregelRepo;
	}
	
	@Override
	public void saveBestellingsregel(Bestellingsregel bestellingsRegel) {
		bestellingsregelRepo.save(bestellingsRegel);
	}

	@Override
	public List<Bestellingsregel> getAllBestellingsregels() {
		return bestellingsregelRepo.findAll();
	}
}
