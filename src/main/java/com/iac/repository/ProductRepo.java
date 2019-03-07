package com.iac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iac.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

}
