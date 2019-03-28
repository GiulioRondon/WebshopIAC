package com.iac.service.implementatie;

import org.springframework.stereotype.Service;

import com.iac.model.Klant;
import com.iac.repository.KlantRepo;
import com.iac.service.interfaces.KlantService;

import java.util.List;

@Service
public class KlantServiceImpl implements KlantService {

    public final KlantRepo klantRepo;

    public KlantServiceImpl(KlantRepo klantRepo) {
        this.klantRepo = klantRepo;
    }

    @Override
    public List<Klant> getAllKlanten() {
        return klantRepo.findAll();
    }

    @Override
    public void saveKlant(Klant klant) {
        klantRepo.save(klant);
    }

	@Override
	public Klant getByID(long id) {
		return klantRepo.findById(id).get();
	}


}
