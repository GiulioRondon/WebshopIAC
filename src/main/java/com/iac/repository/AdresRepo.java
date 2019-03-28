package com.iac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iac.model.Adres;

@Repository
public interface AdresRepo extends JpaRepository<Adres, Long>{
}
