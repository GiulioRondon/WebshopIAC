package com.iac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iac.model.Klant;

public interface KlantRepo extends JpaRepository<Klant, Long>{
}
