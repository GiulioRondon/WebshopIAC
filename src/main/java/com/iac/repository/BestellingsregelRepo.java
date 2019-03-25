package com.iac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iac.model.Bestellingsregel;

@Repository
public interface BestellingsregelRepo extends JpaRepository<Bestellingsregel, Long> {
}
