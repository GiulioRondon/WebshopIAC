package com.iac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iac.model.Bestelling;

@Repository
public interface BestellingRepo extends JpaRepository<Bestelling,Long>{

}
