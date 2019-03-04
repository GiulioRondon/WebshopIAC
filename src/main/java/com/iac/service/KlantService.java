package com.iac.service;

import java.util.List;

import com.iac.model.Klant;

public interface KlantService {
    List<Klant> getAllKlanten();

    void saveKlant(Klant klant);
}
