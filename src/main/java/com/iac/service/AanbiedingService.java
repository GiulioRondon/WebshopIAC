package com.iac.service;

import java.util.List;

import com.iac.model.Aanbieding;

public interface AanbiedingService {
	List<Aanbieding> getAlleAanbiedingen();
	
	void saveAanbieding(Aanbieding aanbieding);
}
