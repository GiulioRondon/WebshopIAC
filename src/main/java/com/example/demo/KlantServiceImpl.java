package com.example.demo;

import org.springframework.stereotype.Service;

import com.example.demo.model.Klant;

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


}
