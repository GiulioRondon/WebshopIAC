package com.iac.service.interfaces;

import java.util.List;

import com.iac.model.Product;

public interface ProductService {
    List<Product> getAllProducten();

    void saveProduct(Product product);
    
    List<Product> getByCategorie(long id);
    
    Product getByID(long id);
    
    void deleteProduct(long id);
}
