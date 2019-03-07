package com.iac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iac.model.Aanbieding;

public interface AanbiedingRepo extends JpaRepository<Aanbieding, Long> {

}
