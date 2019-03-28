package com.iac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iac.model.Klant;

@Repository
public interface KlantRepo extends JpaRepository<Klant, Long>{
}
