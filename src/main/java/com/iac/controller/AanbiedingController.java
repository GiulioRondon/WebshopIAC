package com.iac.controller;


import java.io.FileOutputStream;
import java.text.ParseException;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iac.model.Aanbieding;
import com.iac.requests.AanbiedingRequest;
import com.iac.service.AanbiedingService;
import com.iac.service.ProductService;
import com.iac.service.ProductServiceImpl;

@RestController
@RequestMapping("/aanbiedingen")
public class AanbiedingController {
    private final AanbiedingService aanbiedingService;
    private final ProductService productService;
    
    public AanbiedingController(AanbiedingService aanbiedingService, ProductService productService) {
    	this.aanbiedingService = aanbiedingService;
    	this.productService = productService;
    }

    @GetMapping
    public ResponseEntity getAanbiedingen(){
        List<Aanbieding> aanbiedingen = aanbiedingService.getAlleAanbiedingen();
        if (aanbiedingen == null) {
            return ResponseEntity.status(409).build();
        }

        return ResponseEntity.status(200).body(aanbiedingen);
    }

    @SuppressWarnings("resource")
	@PostMapping("/create")
	public void saveAanbieding(@RequestBody AanbiedingRequest request) throws ParseException {
		Aanbieding aanbieding = new Aanbieding();
	
		aanbieding.setPrijs(request.getPrijs());
		aanbieding.setBeginDatum(request.getBeginDatum());
		aanbieding.setEindDatum(request.getEindDatum());
		aanbieding.setProductID(productService.getByID(request.getProductId()));

		aanbiedingService.saveAanbieding(aanbieding);
	}
}

