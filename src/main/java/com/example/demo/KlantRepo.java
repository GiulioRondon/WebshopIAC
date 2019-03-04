package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Klant;

public interface KlantRepo extends JpaRepository<Klant, Long>{
}
