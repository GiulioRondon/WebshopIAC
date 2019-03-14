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
/*	@Query("select Product.afbeelding, Product.naam, Product.omschrijving, Product.prijs, Product.productid from Product join product_categories on Product.productid = product_categories.product_id "
					+ "join Categorie on Categorie.categorieid = product_categories.categories_id "
					+ "where Categorie.categorieid = :categorie_id")
	public  List<Product> findByCategorie(@Param("categorie_id") int categorieID);*/
}
