package com.example.demo;

import java.util.List;

import com.example.model.Klant;

public interface KlantService {
    List<Klant> getAllKlanten();

    void saveKlant(Klant klant);
}
