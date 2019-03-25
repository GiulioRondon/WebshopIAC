package com.iac.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iac.model.Account;
import com.iac.model.Product;
import com.iac.requests.AccountRequest;
import com.iac.requests.ProductRequest;
import com.iac.service.interfaces.ProductService;

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

	@SuppressWarnings("resource")
	@PostMapping("/create")
	public void saveProduct(@RequestBody ProductRequest request) throws ParseException {
		Product product = new Product();
		product.setNaam(request.getNaam());
		product.setOmschrijving(request.getBeschrijving());
		product.setPrijs(request.getPrijs());
		
		product.setAfbeelding(request.getAfbeelding());

		productService.saveProduct(product);
	}
}
