package com.iac.service.interfaces;

import java.util.List;

import com.iac.model.Bestellingsregel;

public interface BestellingsregelService {
	List<Bestellingsregel> getAllBestellingsregels();
	
	void saveBestellingsregel(Bestellingsregel bestellingsregel);

	
}
