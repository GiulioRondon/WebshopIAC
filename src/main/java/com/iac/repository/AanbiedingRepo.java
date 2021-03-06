package com.iac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iac.model.Aanbieding;

@Repository
public interface AanbiedingRepo extends JpaRepository<Aanbieding, Long> {

}
