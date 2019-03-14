package com.iac.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iac.model.Product;
import com.iac.service.ProductService;

@RestController
@RequestMapping("/producten")
public class ProductController {
	private static final RequestMethod[] GET = null;
	private final ProductService productService;

	public ProductController(ProductService productservice) {
		this.productService = productservice;
	}

	@GetMapping
	public ResponseEntity getProducten() {
		List<Product> producten = productService.getAllProducten();
		if (producten == null) {
			return ResponseEntity.status(409).build();
		}

		return ResponseEntity.status(200).body(producten);
	}
	
	@GetMapping
	@RequestMapping(value = "categorie/{id}")
	@ResponseBody
	public ResponseEntity getProductByCategorie(@PathVariable("id") long id) {
	    return ResponseEntity.status(200).body(productService.getByCategorie(id));
	}
	@GetMapping
	@RequestMapping(value = "/{id}")
	@ResponseBody
	public ResponseEntity getProductByID(@PathVariable("id") long id) {
	    return ResponseEntity.status(200).body(productService.getByID(id));
	}

	@PostMapping
	public void saveProduct(@RequestBody Product product) {
		System.out.println(product == null);
		productService.saveProduct(product);
	}

}
