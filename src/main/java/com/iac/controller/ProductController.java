package com.iac.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iac.model.Product;
import com.iac.service.ProductService;

@RestController
@RequestMapping("/producten")
public class ProductController {
    private final ProductService productService;
    
    public ProductController(ProductService productservice) {
    	this.productService = productservice;
    }

    @GetMapping
    public ResponseEntity getProducten(){
        List<Product> producten = productService.getAllProducten();
        if (producten == null) {
            return ResponseEntity.status(409).build();
        }

        return ResponseEntity.status(200).body(producten);
    }

    @PostMapping
    public void saveProduct(@RequestBody Product product){
        System.out.println(product == null);
        productService.saveProduct(product);
    }
}
