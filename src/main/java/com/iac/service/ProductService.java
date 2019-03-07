package com.iac.service;

import java.util.List;

import com.iac.model.Product;

public interface ProductService {
    List<Product> getAllProducten();

    void saveProduct(Product product);
}
