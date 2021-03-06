package com.iac.service.interfaces;

import java.util.List;

import com.iac.model.Aanbieding;

public interface AanbiedingService {
	List<Aanbieding> getAlleAanbiedingen();
	
	void saveAanbieding(Aanbieding aanbieding);
	
	Aanbieding getByProduct(long id);
	
	void deleteByProduct(long id);
}
