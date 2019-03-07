package com.iac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iac.model.Bestelling;

public interface BestellingRepo extends JpaRepository<Bestelling,Long>{

}
