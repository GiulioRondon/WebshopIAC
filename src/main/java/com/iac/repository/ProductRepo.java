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
	@Query(value = "select * from product where categorie_id = :categorie_id", nativeQuery = true)
	List<Product> findByCategorieId(@Param("categorie_id") long id);
}
