package com.iac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iac.model.Bestellingsregel;

public interface BestellingsregelRepo extends JpaRepository<Bestellingsregel, Long> {
}
