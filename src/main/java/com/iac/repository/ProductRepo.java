package com.iac.repository;

import java.util.List;

import org.hibernate.annotations.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iac.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{

}
