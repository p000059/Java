package ic.interfaces.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ic.model.dto.TaxDTO;
import ic.model.entity.Tax;

public interface ItaxController {

	ResponseEntity<Tax> insertTax(TaxDTO taxDTO);
	
	ResponseEntity<List<Tax>> listTax();
	
	ResponseEntity<Tax> updateTax(TaxDTO taxDTO);
	
	ResponseEntity<Tax> deleteTax(TaxDTO taxDTO);
}
