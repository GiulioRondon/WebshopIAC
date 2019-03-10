package com.iac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.iac.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long>{

	@Query(	"SELECT product.* FROM "
			+ "product join product_categories ON product.productid = product_categories.product_id "
			+ "JOIN categorie ON categorie.categorieid = product_categories.categories_id "
			+ "WHERE categorie.categorieid = :categorie_id")
	public List<Product> findByCategorie(@Param("categorie_id") int categorieID);
}
