package com.iac.service.interfaces;

import java.util.List;

import com.iac.model.Klant;
import com.iac.model.Product;

public interface KlantService {
    List<Klant> getAllKlanten();

    void saveKlant(Klant klant);
    
    Klant getByID(long id);
}
